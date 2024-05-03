package com.core.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                "GeeksQuiz", "GeeksforGeeks");
		
		Optional<String> longestStr = words.stream().reduce((word1, word2)->word1.length()>word2.length()?word1:word2);
		longestStr.ifPresent(System.out::println);
		
		Optional<String> smallestStr = words.stream().reduce((word1, word2)->word1.length()<word2.length()?word1:word2);
		smallestStr.ifPresent(System.out::println);
	}
}
