
public class NodeC {

	boolean isEnd;
	NodeC[] children = new NodeC[26];
	Nodeindex head;
	
	public NodeC()
	{
		isEnd = false;
		for(int i = 0; i< 26; i++)
			children[i] = null;
		head = null;
	}
}
