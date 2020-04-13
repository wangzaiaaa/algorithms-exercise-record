package leetcode;

public class Trie {

    class Node{
        char val;
        boolean isEnd;
        Node [] childs;
        Node(char val){
            this.val = val;
            this.childs = new Node[26];
        }
    }
    private Node node;
    /** Initialize your data structure here. */
    public Trie() {
        node = new Node(' ');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word == null || word.length() == 0){
            return;
        }
        Node tmp = node;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = (int)(c - 'a');
            if(tmp.childs[index] == null){
                tmp.childs[index] = new Node(c);
            }
            tmp = tmp.childs[index];
        }
        tmp.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word == null || word.length() == 0){
            return false;
        }
        Node tmp = node;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int index = (int)(c - 'a');
            if(tmp.childs[index] == null){
                return false;
            }
            tmp = tmp.childs[index];
        }
        return tmp.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        if(prefix == null || prefix.length() == 0){
            return false;
        }
        Node tmp = node;
        for(int i = 0; i < prefix.length(); i++){
            char c = prefix.charAt(i);
            int index = (int)(c - 'a');
            if(tmp.childs[index] == null){
                return false;
            }
            tmp = tmp.childs[index];
        }
        return true;

    }
}
