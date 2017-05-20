package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Source: https://www.hackerrank.com/challenges/ctci-contacts */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Trie trie = new Trie();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
                trie.insert(contact);
            } else {
                System.out.println(trie.search(contact));
            }
        }
    }
}

class TrieNode {
    char character;
    boolean isCompleteWord;
    int characterCounter;
    HashMap<Character, TrieNode> children = new HashMap<>();

    public TrieNode(){

    }

    public TrieNode(char character){
        this.character = character;
    }
}


class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        HashMap<Character, TrieNode> children = root.children;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode t;
            if (children.containsKey(c)){
                t = children.get(c);
                t.characterCounter++;
            }else{
                t = new TrieNode(c);
                t.characterCounter++;
                children.put(c, t);
            }
            children = t.children;
            if (word.length() - 1 == i) t.isCompleteWord = true;
        }
    }

    public int search(String word){
        TrieNode t = searchNode(word);
        return (t != null) ? t.characterCounter : 0;
    }

    public TrieNode searchNode(String str){
        Map<Character, TrieNode> children = root.children;
        TrieNode t = null;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }else{
                return null;
            }
        }
        return t;
    }
}