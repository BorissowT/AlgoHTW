package myproject.commands.Algorithms;

public class StringMatchingAlgorithm {

	//GIBT den Index des gesuchten Wort
	public static int match(String str_text, String str_search){
		int patternSize = str_search.length();
		int textSize = str_text.length();
		char[] text = str_text.toCharArray();
		char[] pattern = str_search.toCharArray();

		int i = 0;

		while ((i + patternSize) <= textSize) {
			int j = 0;
			while (text[i + j] == pattern[j]) {
				j += 1;
				if (j >= patternSize)
					return i;
			}
			i += 1;
		}
		return -1;
	}
}
