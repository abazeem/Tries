import java.util.HashMap;

public class NodeD {

	char val ;
	boolean isdone = false;
	HashMap<Character,NodeD> children;
	
	public NodeD(char ch)
	{
		val = ch;
		children = new HashMap<>();
	}
	
	public HashMap<Character, NodeD> getchildren()
	{
		return children;
	}
	
	public char getvalue()
	{
		return val;
	}
	
	public void setEnd()
	{
		isdone = true;
	}
	
}
