package DS_ALGO;

public class TrieNode {
	TrieNode [] childrens;
	boolean wordBreak;

	public TrieNode(){
		wordBreak = false;
		childrens = new TrieNode[26];
	}
}
