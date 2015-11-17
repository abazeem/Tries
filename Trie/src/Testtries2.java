
public class Testtries2 {

	public static void main(String args[])
	{
		String[] dict = {"dog", "god", "bat","tab"};
		tries2 trie = new tries2();
		for(int i = 0; i<dict.length; i++)
			trie.insert(dict[i],i);
		int[] a = trie.intelligence("a");
		if(a != null)
		{
			for(int i = 0; i< a.length;i++)
			{
				System.out.print(dict[a[i]] + " ");
			}
		}
		
	}
}
