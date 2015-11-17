import java.util.HashMap;

public class Dict {

	NodeD root;
	
	public Dict()
	{
		root = new NodeD((char)0);
	}
	
	public void insert(String word)
	{
		NodeD curr = root;
		for(int i = 0;i<word.length();i++)
		{
			HashMap<Character, NodeD> child = curr.getchildren();
			char ch = word.charAt(i);
			if(child.containsKey(ch))
				curr = child.get(ch);
			else
			{
				NodeD temp = new NodeD(ch);
				child.put(ch, temp);
				curr  = temp;
			}
		}
		curr.setEnd();
	}
	
	public String getmatching(String input)
	{
		String result = "";
		NodeD curr = root;
		int prev = 0;
		for(int i = 0; i<input.length(); i++)
		{
			HashMap<Character, NodeD> child = curr.getchildren();
			char ch = input.charAt(i);
			if(child.containsKey(ch))
			{
				result += ch;
				curr = child.get(ch);
				if(curr.isdone)
					prev = i+1;
			}
			else
				break;
		}
		if(curr.isdone)
			return result;
		else
			return result.substring(0,prev);
	}
	
}
