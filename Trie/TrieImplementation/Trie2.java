package Trie.TrieImplementation;


public class Trie2 {
    public static Node root;

    public Trie2() {
        root = new Node();
    }

    static class Node {
        Node[] links;
        int startsWith;
        int endsWith;

        public Node() {
            links = new Node[26];
            startsWith = 0;
            endsWith = 0;
        }

        boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        void put(char ch, Node reference) {
            links[ch - 'a'] = reference;
        }

        Node getNextRefNode(char ch) {
            return links[ch - 'a'];
        }

        void incPrefixCount() {
            startsWith++;
        }

        void incEndingWordCount() {
            endsWith++;
        }

        int getPrefixCount() {
            return startsWith;
        }

        int getEndingWordsCount(){
            return endsWith;
        }

        void decPrefixCount(){
            startsWith--;
        }
        void decEndingWordCount(){
            endsWith--;
        }
    }

    public void insert(String word) {
        Node node = root;

        // ? Increment root for empty prefix (present in all words)
        node.incPrefixCount();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.containsKey(ch)) {
                node.put(ch, new Node());
            }
            node = node.getNextRefNode(ch);
            node.incPrefixCount();
        }
        node.incEndingWordCount();
    }

    int wordsStartsWith(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.containsKey(ch)) {
                return 0;
            }
            node = node.getNextRefNode(ch);
        }
        return node.getPrefixCount();
    }
    int wordsEndsWith(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.containsKey(ch)) {
                return 0;
            }
            node = node.getNextRefNode(ch);
        }
        return node.getEndingWordsCount();
    }
    public void erase(String word){
        Node node = root;
        node.decPrefixCount();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            node = node.getNextRefNode(ch);
            node.decPrefixCount();
        }
        node.decEndingWordCount();
    }
    public static void main(String[] args) {
        String[] words = { "apple", "apple", "apps", "apps" };
        Trie2 trie2 = new Trie2();

        // !inserting each word with startsWith count and endWithCount
        for (int i = 0; i < words.length; i++) {
            trie2.insert(words[i]);
        }

        System.out.println(trie2.wordsEndsWith("apple"));
        System.out.println(trie2.wordsEndsWith("apps"));
        trie2.erase("apple");
        System.out.println(trie2.wordsEndsWith("apple"));

    }
}
