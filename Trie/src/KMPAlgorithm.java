public class KMPAlgorithm {

	public static void main(String args[])
	{
		patt("Dinarynary","nary");
	}
	
	public static void patt(String txt, String patt)
	{
		int[] lps = computelps(patt);
		int q = 0;
		for(int i = 0;i<txt.length();i++)
		{
			while(q!=0 && txt.charAt(i)!= patt.charAt(q))
				q = lps[q-1];
			if(txt.charAt(i) == patt.charAt(q))
				q++;
			if( q == patt.length())
			{
				System.out.println("Pattern found at index " + (i - q + 1));
				q = lps[q-1];
			}
		}
	}
	
	public static int[] computelps(String patt)
	{
		int len = 0;
		int[] lps = new int[patt.length()];
		lps[0] = 0;
		int i = 1;
		while(i<patt.length())
		{
			if(patt.charAt(i)==patt.charAt(len))
			{
				len++;
				lps[i] = len;
				i++;
			}
			else
			{
				if(len != 0)
					len = lps[len-1];
				else
				{
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}
}
