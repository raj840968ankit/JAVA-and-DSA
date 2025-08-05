package Trie.TrieImplementation;

//Trie Structure
class Node {
    Node[] links;
    boolean flag;
    public Node(){
        links = new Node[26];
        flag = false;
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

    void setEnd(){
        flag = true;
    }

    boolean isEnd(){
        return flag;
    }
}

public class Trie {
    public static Node root;

    public Trie(){
        root = new Node();
    }

    public void insert(String word){
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            //! if node doesn't contains specific letter then only insert at that position
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new Node());  //! insert a reference node each time when inserting a specific letter
            }
            //? get next reference node to insert another letter
            node = node.getNextRefNode(word.charAt(i));
        }
        //? after insertion is finished, just make flag true of last reference node
        node.setEnd();
    }

    public boolean search(String word){
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.getNextRefNode(word.charAt(i));
        }
        return node.isEnd();
    }

    public boolean startsWith(String prefix){
        Node node = root;
        for(int i = 0; i < prefix.length(); i++){
            if(!node.containsKey(prefix.charAt(i))){
                return false;
            }
            node = node.getNextRefNode(prefix.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("anaconda");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("anaconda"));
        System.out.println(trie.startsWith("anaco"));
    }
}
