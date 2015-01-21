
public class RemoveDuplicatesFromString {

	//REMOVE DUPLICATES FROM STRING WITHOUT ADDITIONAL BUFFER
	public static void removeDuplicates(char[] s)
	{
		if(s == null || s.length <= 1)
			return;
		
		int end = 1;
		for(int i = 1; i < s.length; i++)
		{
			
			boolean has = false;
			for(int j = 0; j < end; j++)
			{
				if(s[j] == s[i])
				{
					has = true;
					break;
				}
			}
			if(!has)
			{
				s[end] = s[i];
				end++;
				
			}
			
		}
		for(int i = end; i < s.length; i++)
		{
			s[i] = '\0';
		}
	}
	
	public static void main(String[] args)
	{
		String s = "ababab";
		char[] sb = s.toCharArray();
		removeDuplicates(sb);
		System.out.println(sb);
	}
}
