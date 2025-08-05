package Trie.TrieImplementation;

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

public class LongestStringWithAllPrefix {
    public static Node root;

    public LongestStringWithAllPrefix(){
        root = new Node();
    }
    public void insert(String word) {
        Node node = root;


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.containsKey(ch)) {
                node.put(ch, new Node());
            }
            node = node.getNextRefNode(ch);
        }
        node.setEnd();
    }
    boolean longestPrefixExists(String word){
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(node.containsKey(ch)){
                node = node.getNextRefNode(ch);
                if(node.isEnd() == false){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words = {"n", "ni", "nin", "ninj", "ninja", "ninga"};
        LongestStringWithAllPrefix trie = new LongestStringWithAllPrefix();
        for(String str: words){
            trie.insert(str);
        }

        //!checking for the longest string with all prefixes
        String longest = "";
        for(String str: words){
            if(trie.longestPrefixExists(str)){
                if(str.length() > longest.length()){
                    longest = str;
                }
                else if(str.length() == longest.length() && str.compareTo(longest) < 0){
                    longest = str;
                }
            }
        }
        String ans = longest == "" ? "None" : longest;
        System.out.println(ans); 
    }
}
