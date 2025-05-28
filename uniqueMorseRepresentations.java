package org.example;

import java.util.HashSet;

public class joo {
    public static void main(String[] args) {
        String[] words =  {"abc","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String [] Env = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet<>();
        for(int i =0;i< words.length;i++){
            char[] hoo = words[i].toCharArray();
            String s = new String();
            for(int j=0;j<hoo.length;j++){
                s=s+Env[hoo[j]-'a'];
            }
            hs.add(s);
        }
        return hs.size();
    }
}
