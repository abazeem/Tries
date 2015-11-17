public class NodeB {

	boolean isend ;
	NodeB[] children;
	
	public NodeB()
	{
		isend = false;
		children = new NodeB[2];
		children[0] = null;
		children[1] = null;
	}
}
