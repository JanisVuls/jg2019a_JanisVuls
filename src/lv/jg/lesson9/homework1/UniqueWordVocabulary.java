package lv.jg.lesson9.homework1;


import java.util.HashSet;
import java.util.Set;


public class UniqueWordVocabulary {

	public static void main(String[] args) {

		int UniqueWords = 0;

		        Set<String> vocabulary = new HashSet<>();
		        addWord(vocabulary);
				printToConsole();
		        getUniqueWords(vocabulary);
				System.out.println(vocabulary);
		        System.out.println("UniqueWords = " + UniqueWords);
		    }

		    private static void addWord(Set<String> set) {
		        set.add("Kazis");
		        set.add("Jomo");
		        set.add("Jolo");
		    }
		    
		    private static void getUniqueWords(Set<String> set) {
//				if (Set<String> set) {
//
//				}

		    }

			private static void printToConsole() {
//				System.out.println(vocabulary);
//				System.out.println("UniqueWords = " + UniqueWords);

			}
	
}
