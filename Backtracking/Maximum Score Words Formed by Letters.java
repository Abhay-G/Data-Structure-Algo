import java.io.*;
import java.util.*;

public class Main {

	public static int solution(String[] words, int[] farr, int[] score, int idx) {
		
		if(idx == words.length){
		    return 0;
		}
		int scoreNotIncluded = 0 + solution(words, farr, score, idx+1);  //not included
		
		//word to include
	    int scoreIfIdxWordIncluded  = 0;
	    String word = words[idx];
	    boolean flag = true; //if word can be included
	    for(int i=0;i<word.length();i++){
	        char ch = word.charAt(i);
	         if(farr[ch-'a']<=0){
	             flag = false;// this word can not be included as frequency for it's characters is less than or equal to zero
	         }
	         farr[ch-'a']--;
	         scoreIfIdxWordIncluded += score[ch-'a'];
	         
	    }
	    int scoreyes = 0;
	    if(flag){
	        scoreyes = scoreIfIdxWordIncluded + solution(words, farr, score, idx+1);
	    }
		for(int i=0;i<word.length();i++){
		    char ch = word.charAt(i);
		     farr[ch-'a']++;
		}
		return Math.max(scoreNotIncluded,scoreyes);
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int nofWords = scn.nextInt();
		String[] words = new String[nofWords];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int nofLetters = scn.nextInt();
		char[] letters = new char[nofLetters];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = scn.next().charAt(0);
		}
		int[] score = new int[26];
		for (int i = 0; i < score.length; i++) {
			score[i] = scn.nextInt();
		}
		if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
				|| score.length == 0) {
			System.out.println(0);
			return;
		}
		int[] farr = new int[score.length];
		for (char ch : letters) {
			farr[ch - 'a']++;
		}
		System.out.println(solution(words, farr, score, 0));

	}
}
