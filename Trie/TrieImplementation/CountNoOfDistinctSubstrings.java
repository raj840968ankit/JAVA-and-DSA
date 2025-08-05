package Trie.TrieImplementation;

class Node {
    Node[] links;
    public Node(){
        links = new Node[26];
    }

    boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }

    void put(char ch, Node reference){
        links[ch - 'a'] = reference;
    }

    Node getNextRefNode(char ch){
        return links[ch - 'a'];
    }
}

public class CountNoOfDistinctSubstrings {
    public static Node root;
    public CountNoOfDistinctSubstrings(){
        root = new Node();
    }

    public int getNoOfDistinctSubstring(String word) {
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            Node node = root;
            for(int j = i; j < word.length(); j++){
                char ch = word.charAt(j);
                if(!node.containsKey(ch)){
                    count++;
                    node.put(ch, new Node());
                }
                node = node.getNextRefNode(ch);
            }
        }
        return count + 1;
    }
    public static void main(String[] args) {
        String word = "abc";
        CountNoOfDistinctSubstrings trie = new CountNoOfDistinctSubstrings();
        System.out.println(trie.getNoOfDistinctSubstring(word));
    }
}
