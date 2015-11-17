
public class TestAnagram {

	public static void main(String args[])
	{
		TrieAnagram trie = new TrieAnagram();
		String[] words = {"cat", "dog", "tac", "god", "act", "gdo"};
		printutil(trie,words);
	}
	
	public static void printutil(TrieAnagram trie, String[] words)
	{
		for( int i = 0; i< words.length; i++)
		{
			String buffer = words[i];
 			char[] str = new char[buffer.length()];
			for(int j = 0; j< buffer.length(); j++)
				str[j] = buffer.charAt(j);
			sort(str , 0 , str.length -1);
			buffer = "";
			for(int j = 0; j< str.length; j++)
				buffer +=str[j];
			trie.insert(buffer, i);
		}
		trie.print(trie.root, words);
	}
	
	public static void disp(char[] str)
	{
		for( int i = 0; i< str.length; i++)
			System.out.print(str[i] );
		System.out.println("");
			
	}
	
	public static void sort(char[] str, int l ,int r)
	{
		if( l < r)
		{
			int part = partition(str, l, r);
			sort(str, l, part-1);
			sort(str, part+1,r);
		}
	}
	
	public static int partition(char[] str, int l , int r)
	{
		char c = str[r];
		int i = l;
		for( int j = l; j <= r; j++)
		{
			if(str[j] < c)
			{
				char temp = str[i];
				str[i] = str[j];
				str[j] = temp;
				i++;
			}
		}
		char temp2 = str[i];
		str[i] = str[r];
		str[r] = temp2;
		return i;
	}
}
