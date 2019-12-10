package lv.jg.lesson9.homework1;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
	public static void main(String[] args) {

		Set<String> vocabulary = new HashSet<>();
		        addWord(vocabulary);
		        getUniqueWords(vocabulary);
		        printToConsole(vocabulary);
    		    }

		    private static void addWord(Set<String> set) {
		        set.add("Kazis");
		        set.add("Jomo");
		        set.add("Jolo");
		        set.add("Jolo");
		    }
		    
		    private static void getUniqueWords(Set<String> set) {
		    	System.out.println("UniqueWords = " + set.size()); 
		    	}

		    private static void printToConsole(Set<String> vocabulary) {
		    	System.out.println(vocabulary);
		      }
		    
}
