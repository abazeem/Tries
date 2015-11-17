public class NodeDNS {

	boolean isleaf;
	NodeDNS[] children;
	String URL;
	
	public NodeDNS()
	{
		isleaf = false;
		children = new NodeDNS[11];
		for(int i = 0;i<11;i++)
			children[i]=null;
		URL = "";
	}
}
