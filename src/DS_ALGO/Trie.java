package DS_ALGO;

public class Trie {
	private final TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode currentNode = root;    // word = abcd  c
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (currentNode.childrens[index] == null) {
				currentNode.childrens[index] = new TrieNode();
			}
			currentNode = currentNode.childrens[index];

		}
		currentNode.wordBreak = true;
	}

	public boolean search(String word) {
		TrieNode currentNode = root;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'a';
			if (currentNode.childrens[index] == null)
				return false;

			currentNode = currentNode.childrens[index];
		}

		return currentNode.wordBreak;
	}
}
