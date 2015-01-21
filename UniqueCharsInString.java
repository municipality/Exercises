
public class UniqueCharsInString {

	
	public static boolean uniqueCharsInString(String s)
	{
		
		//ASSUME ASCII SET, 256 VALUES IN ASCII
		boolean chars[] = new boolean[256]; 
		for(int i = 0; i < s.length(); i++)
		{
			int curr = s.charAt(i);
			if(chars[curr])
			{
				return false;
			}
			chars[curr] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueCharsInString("abcde+++"));
	}

}
