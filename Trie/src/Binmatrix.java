public class Binmatrix {

	NodeB root;
	
	public Binmatrix()
	{
		root = new NodeB();
	}
	
	public boolean insert(int[] a)
	{
		NodeB curr = root;
		for(int i = 0; i<a.length;i++)
		{
			int key = a[i];
			if(curr.children[key] == null)
				curr.children[key] = new NodeB();
			curr = curr.children[key];
		}
		if(curr.isend)
			return false;
		else
		{
			curr.isend = true;
			return true;
		}
	}
	
	public boolean insert2(int[] a, int col, int COL, Binmatrix trie)
	{
		if(trie.root == null)
		{
			trie.root = new NodeB();
		}
		
		if(col<COL-1 )
		{
			col++;
			trie.root = trie.root.children[a[col]];
			return insert2(a,col,COL,trie);
		}
		else
		{
			if(trie.root.isend)
				return false;
			else
			{
				trie.root.isend = true;
				return true;
			}
		}
		
	}
}
