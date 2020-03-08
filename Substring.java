import java.util.*;

public class Main {
		public static void main (String [] args)
		{
		
			System.out.print(lengthOfLongestSubstring("wasjcwr"));
		}
		public static int lengthOfLongestSubstring(String s) {
        		if(s.isEmpty()) {
			return 0;
			}
			Stack<Character>stck = new Stack<>();
			int longest= 1;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (stck.contains(s.charAt(i))) 
			{
				while(stck.contains(s.charAt(i)))
				{
					stck.remove(0);
				}
				stck.push(s.charAt(i));
	
			}
			else
			{
				stck.push(s.charAt(i));
				longest = Math.max(stck.size(), longest);	
			}
		}
		return Math.max(stck.size(), longest);
		
    }
	    }
		
}


