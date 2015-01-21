import java.util.*;
public class PermutationsOfString {
	
	public static List<String> permutationsOfString(String s)
	{
		
		if(s.length() == 1)
		{
			ArrayList<String> ans = new ArrayList<String>();
			ans.add(s);
			return ans;
		}
		else
		{
			char c = s.charAt(s.length() - 1);
			ArrayList<String> adder = new ArrayList<String>();
			List<String> ans = permutationsOfString(s.substring(0, s.length() - 1));
			for(int i = 0; i < ans.size(); i++)
			{
				for(int j = 0; j <= ans.get(i).length(); j++) // NOTE THIS FORLOOP j <= ans.get(i).length()
				{
					adder.add(ans.get(i).substring(0, j) +  c + ans.get(i).substring(j, ans.get(i).length()));
				}
			}
			
			return adder;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> test = permutationsOfString("abcdef123");
		for(int i = 0; i < test.size(); i++)
		{
			System.out.println(test.get(i));
		}
	}

}
