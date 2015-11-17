public class TestBin {

	public static void main(String args[])
	{
		Binmatrix trie = new Binmatrix();
		int[][] a = new int [][]{
				{0, 1, 0, 0, 1},
        		{1, 0, 1, 1, 0},
        		{0, 1, 0, 0, 1},
        		{1, 1, 1, 0, 0}};
		print(a, trie);
	}
	
	public static void print(int[][] a, Binmatrix trie)
	{
		Point ptr = new Point(trie);
		int rows = a.length;
	//	for(int i =0;i<rows;i++)
	//	{
	//		if(trie.insert(a[i]))
	//		{
	//			for(int j = 0;j<a[i].length; j++)
	//				System.out.print(a[i][j] + " ");
	//			System.out.println("");
	///		}
	//	}
		
		for(int i =0;i<rows;i++)
		{
			if(ptr.trie.insert2(a[i],0,a[i].length,ptr.trie))
			{
				for(int j = 0;j<a[i].length; j++)
					System.out.print(a[i][j] + " ");
				System.out.println("");
			}
		}
	}
}
