
public class tries2 {

	NodeC root;
	
	public tries2()
	{
		root = new NodeC();
	}
	
	public void insert(String str, int index)
	{
		char[] x = str.toCharArray();
		quicksort(x, 0 ,x.length-1);
		NodeC curr = root;
		for(int i = 0; i< x.length; i++)
		{
			char c = x[i];
			int j = c-'a';
			if(curr.children[j] == null)
				curr.children[j] = new NodeC();
			curr = curr.children[j];
		}
		curr.isEnd = true;
		if(curr.head == null )
			curr.head = new Nodeindex(index);
		else
		{
			Nodeindex last = curr.head;
			while(last.next != null)
				last = last.next;
			last.next = new Nodeindex(index);
		}
	}
	
	public int[] search(String str)
	{
		NodeC curr = root;
		char[] x = str.toCharArray();
		quicksort(x, 0, x.length-1);
		str = String.valueOf(x);
		for(int i= 0; i< str.length(); i++ )
		{
			int j = str.charAt(i) - 'a';
			if( curr.children[j] == null)
			{
				System.out.print("Word Not found");
				return null;
			}
			else
			{
				curr =curr.children[j];
			}
		}
		if(curr.isEnd && curr.head != null)
		{
			int[] a;
			int count = 0;
			Nodeindex temp = curr.head;
			while(temp!=null)
			{
				count++;
				temp = temp.next;
			}
			a = new int[count];
			Nodeindex temp2 = curr.head;
			int i = 0;
			while(temp2!= null)
			{
				a[i] = temp2.val;
				i++;
				temp2 = temp2.next;
			}
			return a;
		}
		return null;
	}
	
	public int[] intelligence(String str)
	{
		char[] x = str.toCharArray();
		quicksort(x, 0 ,x.length-1);
		str = String.valueOf(x);
		NodeC curr = root;
		for(int i = 0; i< str.length(); i++)
		{
			int j = str.charAt(i) - 'a';
			if(curr.children[j] == null)
			{
				System.out.print("Word Not found");
				return null;
			}
			else
			{
				curr = curr.children[j];
			}
		}
		int[] a = print(curr);
		return a;
	}
	public int[] print(NodeC x)
	{
		if( x == null)
			return null;
		if(x.isEnd && x.head != null)
		{
			int[] a;
			int count = 0;
			Nodeindex temp = x.head;
			while(temp!=null)
			{
				count++;
				temp = temp.next;
			}
			a = new int[count];
			Nodeindex temp2 = x.head;
			int i = 0;
			while(temp2!= null)
			{
				a[i] = temp2.val;
				i++;
				temp2 = temp2.next;
			}
			return a;
		}
		for(int i = 0; i< 26; i++)
		{
			if(x.children[i] != null)
				return print(x.children[i]);
		}
		return null;
	}
	
	public void quicksort(char[] x, int l, int r)
	{
		if(l>=r)
			return;
		int p = find(x,l,r);
		quicksort(x,l, p-1);
		quicksort(x, p+1, r);
	}
	
	public int find(char[] x, int l, int r)
	{
		char a = x[r];
		int i = l;
		for(int j = l; j< r; j++)
		{
			if(x[j] < a)
			{
				char temp = x[j];
				x[j] = x[i];
				x[i] = temp;
				i++;
			}
		}
		char temp2 = x[r];
		x[r] = x[i];
		x[i] = temp2;
		return i;
	}
}
