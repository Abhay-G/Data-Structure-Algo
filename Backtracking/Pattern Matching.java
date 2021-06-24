// 1. You are given a string and a pattern. 
// 2. You've to check if the string is of the same structure as pattern without using any regular expressions.
// Input :
// s1 : "graphtreesgraph"
// pattern : "pep"
// Output : 
// p -> graph, e -> trees, . 


import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str, String pattern, HashMap<Character,String> map, 	HashSet<Character> set){
		
		if(pattern.length()==0){
		    if(str.length()==0){
		        for(Character ch: set){
		            System.out.print(ch + " -> " + map.get(ch)+", ");
		        }
		        System.out.println(".");
		    }
		    return;
		}
		char ch = pattern.charAt(0);
		String rop = pattern.substring(1);
		
		if(map.containsKey(ch)){
		    String prevMapped = map.get(ch);
		    if(str.length() >= prevMapped.length()){
		        String left = str.substring(0, prevMapped.length());
		        String right = str.substring(prevMapped.length());
		        if(prevMapped.equals(left)){
    		        solution(right, rop, map, set);
		        }
		    }
		}else{
		    for(int i=0; i<str.length();i++){
		        String left = str.substring(0, i+1);
		        String right = str.substring(i+1);
		        map.put(ch, left);
		        solution(right, rop,map, set);
		        map.remove(ch);
		    }
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String pattern = scn.next();
		HashMap<Character,String> map = new HashMap<>();
		HashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0; i<pattern.length();i++){
		    set.add(pattern.charAt(i));
		}
		solution(str,pattern,map,set);
	}
}
