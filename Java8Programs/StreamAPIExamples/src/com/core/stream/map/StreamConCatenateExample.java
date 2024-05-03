package com.core.stream.map;

import java.util.stream.Stream;

public class StreamConCatenateExample {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("Geeks", "for"); 
        Stream<String> stream2 = Stream.of("GeeksQuiz", "GeeksforGeeks");
        Stream.concat(stream1, stream2).forEach(System.out::println);
	}
}
