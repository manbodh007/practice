package DS_ALGO;

public class TrieTest {
    public static void main(String[] args){
		Trie trie = new Trie();
		trie.insert("abcd");
		trie.insert("manbodh");
		trie.insert("ratre");
		System.out.println(trie.search("test"));
		System.out.println(trie.search("ratre"));
	}
}
