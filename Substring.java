import java.util.*;

public class Main {
		public static void main (String [] args)
		{
		
			System.out.print(lengthOfLongestSubstring("wasjcwr"));
		}
		public static int lengthOfLongestSubstring(String s) {
	        int n = s.length(); // easier to just assign the length rather than calling it every time
	        int startIndex = 0, slidingIndex = 0, counter = 0; // start Index, moving index, and counter
		    Set<Character> set = new HashSet<>(); //Used HashSet so that there's no duplicates
	        while(startIndex < n && slidingIndex < n){ //make the indices don't go past length of string
	            if(set.contains(s.charAt(slidingIndex))){ //If we have the character already in the set
	                set.remove(s.charAt(startIndex)); //remove that character then increment startIndex
	                startIndex++;
	            }
	            
	            /*
	             * If it does not exist in set we add it in, then increment slidingIndex to the next value
	             * to repeat the process. 
	             * Increment counter to keep track of the longest substring
	             */
	            else{ 
	                set.add(s.charAt(slidingIndex));
	                slidingIndex++;
	                counter = Math.max(counter, slidingIndex - startIndex); 
	            }
	        }
	        return counter;
	    }
		
}


