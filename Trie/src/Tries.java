import java.util.ArrayList;

public class Tries {

	int count;
	Node root;
	
	public Tries()
	{
		root = new Node();
		count = 0;
	}
	
	public void add(String keyy)
	{
		String key = keyy.toLowerCase();
		count++;
		Node curr = root;
		for(int i = 0; i<key.length(); i++)
		{
			int c;
			if(key.charAt(i) == 32)
				c = 26;
			else
			 c = key.charAt(i) - 'a';
			if(curr.children[c] == null)
				curr.children[c] = new Node();
			curr = curr.children[c];
		}
		curr.val = count;
	}
	
	public boolean search(String kkey)
	{
		String key = kkey.toLowerCase();
		count++;
		Node curr = root;
		for(int i = 0;i<key.length();i++)
		{
			int c = key.charAt(i) - 'a';
			if(curr.children[c] == null)
				return false;
			curr = curr.children[c];
		}
		return (curr.val!=0);
	}
	
	public boolean isleaf(Node x)
	{
		return (x.val != 0);
	}
	
	public boolean isafreenode(Node x)
	{
		for(int i = 0;i<26;i++)
		{
			if(x.children[i] != null)
				return false;
		}
		return true;
	}
	
	public boolean deletehelper(Node x, int level , int len, String key)
	{
		if(x != null)
		{
			if(level == len)
			{
				x.val = 0;
				if(isafreenode(x))
					return true;
				return false;
			}
			else
			{
				int c = key.charAt(level) - 'a';
				if(deletehelper(x.children[c], level+1,len,key))
				{
					x.children[c] = null;
					return(!isleaf(x) && isafreenode(x));
				}
				return false;
			}
		}
		return false;
	}
	
	public void delete(Tries trie, String key)
	{
		key = key.toLowerCase();
		int l = key.length();
		if(l>0)
			deletehelper(trie.root,0,l,key);
	}
	
	
	public ArrayList<String> intelligence( String input)
	{
		Node curr = root;
		input = input.toLowerCase();
		int n = input.length();
		int j = 0;
		for(int i = 0; i< n; i++)
		{
			j = input.charAt(i) - 'a';
			if(curr.children[j] == null)
				return null;
			curr = curr.children[j];	
		}
		return printutil(curr,input, new ArrayList<String>());
	}
	
	public ArrayList<String> printutil(Node x, String res, ArrayList<String> List)
	{
		if( x == null)
			return null;
		if( x.val != 0)
			//System.out.println(res);
			List.add(res);
			
		for( int i = 0; i< 27; i++)
		{
			String temp = null;
			if(x.children[i] != null)
			{
				temp = res;
				if(i == 26)
				{
					res = res + " ";
				}
				else
				{
					char c = (char)(i + 97);
					String temp2 = Character.toString(c);
					res+= temp2;
				}
     			List = printutil(x.children[i],res,List);
			}
			if(temp!= null)
				res = temp;
		}
		return List;
	}
}
