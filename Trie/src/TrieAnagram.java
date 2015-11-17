
public class TrieAnagram {

	NodeC root;
	
	public TrieAnagram()
	{
		root = new NodeC();
	}
	
	public void insert(String x, int index)
	{
		NodeC curr = root;
		for(int i = 0; i< x.length(); i++)
		{
			char c = x.charAt(i);
			int j = c - 'a';
			if(curr.children[j] == null)
				curr.children[j] = new NodeC();
			curr = curr.children[j];
		}
		if(!curr.isEnd)
		{
			curr.isEnd = true;
			curr.head = new Nodeindex(index);
		}
		else
		{
			Nodeindex temp = curr.head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = new Nodeindex(index);
		}
	}
	
	public void print(NodeC root, String[] words)
	{
		if( root == null)
			return;
		if( root.isEnd)
		{
			Nodeindex temp = root.head;
			while(temp != null)
			{
				System.out.println(words[temp.val]);
				temp = temp.next;
			}
		}
		for( int i = 0; i< 26; i++)
			print(root.children[i], words);
	}
}
