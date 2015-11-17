public class TestDNS {

	public static void main(String args[])
	{
		DNS trie = new DNS();
		String[] ip = {"107.108.11.123", "107.109.123.255","74.125.200.106" };
		String[] url = {"www.samsung.com", "www.samsung.net","www.google.in"};
		for(int i = 0;i<ip.length;i++)
			trie.insert(ip[i], url[i]);
		System.out.println(trie.search("74.125.200.106"));
	}
}
