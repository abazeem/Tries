public class TestDict {

	public static void main(String args[])
	{
		Dict dict = new Dict();
	    dict.insert("are");
	    dict.insert("area");
	    dict.insert("base");
	    dict.insert("cat");
	    dict.insert("cater");        
	    dict.insert("basement");
	    String input = "cate";
        System.out.print(input + ":   ");
        System.out.println(dict.getmatching(input));
        input = "basement";
        System.out.print(input + ":   ");
        System.out.println(dict.getmatching(input));                      
         
        input = "are";
        System.out.print(input + ":   ");
        System.out.println(dict.getmatching(input));              
 
        input = "arex";
        System.out.print(input + ":   ");
        System.out.println(dict.getmatching(input));              
 
        input = "basemexz";
        System.out.print(input + ":   ");
        System.out.println(dict.getmatching(input));                      
         
        input = "xyz";
        System.out.print(input + ":   ");
        System.out.println(dict.getmatching(input));
	}
	
}
