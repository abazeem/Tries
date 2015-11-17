public class DNS {

	NodeDNS root;
	
	public DNS()
	{
		root = new NodeDNS();
	}
	
	public int getindex(char c)
	{
		if ( c == '.')
			return 10;
		else
			return c - '0';
	}
	
	public void insert(String ip, String url)
	{
		NodeDNS curr = root;
		for(int i = 0;i<ip.length();i++)
		{
			int j = getindex(ip.charAt(i));
			if(curr.children[j] == null)
				curr.children[j] = new NodeDNS();
			curr = curr.children[j];
		}
		curr.isleaf = true;
		curr.URL = url;
	}
	
	public String search(String ip)
	{
		String result="";
		NodeDNS curr = root;
		for(int i = 0;i<ip.length();i++)
		{
			int j = getindex(ip.charAt(i));
			if(curr.children[j] == null)
				return result;
			else
				curr = curr.children[j];
		}
		if(curr.isleaf)
			return curr.URL;
		else
			return result;
	}
}
