package Tries;

public class TrieClient {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.addWords("art");
		trie.addWords("arts");
		trie.addWords("bug");
		trie.addWords("boy");
		trie.addWords("amit");
		trie.addWords("see");
		trie.addWords("sea");
		trie.addWords("seen");
		
		trie.display();
		System.out.println();
		
//		System.out.println(trie.search("art"));
//		System.out.println(trie.search("afzal"));
		
		trie.remove("art");
		trie.display();
	}

}
