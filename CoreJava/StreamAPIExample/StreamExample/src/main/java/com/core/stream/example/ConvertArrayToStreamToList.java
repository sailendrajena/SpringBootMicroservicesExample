package com.core.stream.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Notes {
	int id;
	String name;
	int pages;

	public Notes(int id, String name, int pages) {
		this.id = id;
		this.name = name;
		this.pages = pages;
	}

	public Notes() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}

public class ConvertArrayToStreamToList {
	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<Integer> intList = Stream.of(intArr).toList();
		System.out.println(intList);
		// Find out number greater than 5
		List<Integer> numGrtFive = intList.stream().filter(num -> num > 5).collect(Collectors.toList());
		System.out.println(numGrtFive);

		// Find Duplicate Numbers in List
		List<Integer> intDupList = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 4, 5);
		Set<Integer> dupList = new HashSet<Integer>();
		List<Integer> dupNumList = intDupList.stream().filter(num -> !dupList.add(num)).collect(Collectors.toList());
		System.out.println(dupNumList);

		// Find the number Start with 1
		List<String> numStartWithOne = intDupList.stream().map(s -> s + "").filter(num -> num.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(numStartWithOne);

		// Find even number and odd number from the list
		List<Integer> evenNumList = intDupList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		List<Integer> oddNumList = intDupList.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println("Even Number List: " + evenNumList);
		System.out.println("Odd Number List: " + oddNumList);

		// Find Prime number list
		List<Integer> primeNumList = intDupList.stream().filter(num -> num / 2 != 0).filter(num -> num / 2 != 1)
				.collect(Collectors.toList());
		System.out.println("Prime Number List: " + primeNumList);

		// Find first number from the list if exist using stream
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		List<Integer> myEmptyList = Arrays.asList();
		myList.stream().findFirst().ifPresent(System.out::println);
		myEmptyList.stream().findFirst().ifPresent(System.out::println);

		// Find Total number of elements present in the list using stream
		long count = myList.stream().count();
		System.out.println(count);

		// Find the max & min value present in the list using Stream
		long max = myList.stream().max(Integer::compare).get();
		System.out.println("Maximum value in the list: " + max);
		long min = myList.stream().min(Integer::compare).get();
		System.out.println("Minimum value in the list: " + min);

		// Find the repeated character in the string using Stream
		String name = "Sailendra Narayan Jena";

		List<Character> result = name.chars().mapToObj(s -> Character.toLowerCase((char) s))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey())
				.collect(Collectors.toList());
		System.out.println(result);

		// Find the non-repeated character in String using stream
		List<Character> nonRepeatedChars = name.chars().mapToObj(s -> Character.toLowerCase((char) s))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey())
				.collect(Collectors.toList());
		System.out.println(nonRepeatedChars);

		// Find the list with sorted format using stream
		List<Integer> sorterList = myList.stream().sorted().collect(Collectors.toList());
		System.out.println(sorterList);

		// Find the list with descending order sorted format using stream
		List<Integer> descSortedList = myList.stream().sorted(Collections.reverseOrder()).toList();
		System.out.println(descSortedList);

		// Convert Array into List and then return true if any repeated number present
		// or return false if non-repeated number present in the list
		Integer[] intVal = new Integer[] { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		List<Integer> intLists = Stream.of(intVal).toList();
		Set<Integer> intSet = new HashSet<Integer>(intLists);
		if (intSet.size() == intLists.size()) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// Find the current Date & Time using Java 8 Date and Time
		System.out.println("Current Local Date: " + LocalDate.now());
		System.out.println("Current Local Time: " + LocalTime.now());
		System.out.println("Current Local Date & Time: " + LocalDateTime.now());

		// Using of intern() of String class
		String str = "abc";
		String str1 = "abc";
		System.out.println(str == str1);

		// Concatenate two String of List using Stream
		List<String> list1 = Arrays.asList("Java", "8");
		List<String> list2 = Arrays.asList("explained", "through", "programs");
		Stream<String> conStr = Stream.concat(list1.stream(), list2.stream());
		conStr.forEach(System.out::println);

		// Find the cube of each elements of List and check which is greater than 50
		List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		List<Integer> cubeResult = integerList.stream().map(num -> num * num * num).filter(num -> num > 50)
				.collect(Collectors.toList());

		System.out.println(cubeResult);

		// Find the longest string in the list
		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "Geek");

		Optional<String> longestString = words.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		longestString.ifPresent(System.out::println);

		// Find the sum of even number from the list using Stream
		List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		long sumOfEven = lists.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println(sumOfEven);

		// Find the difference between filter and map using Stream
		List<Integer> intList1 = Arrays.asList(6, 7, 8, 1, 2, 3, 4, 5);
		List<Integer> intListGrtFive = intList1.stream().filter(num -> num > 5).toList();
		System.out.println("Find the elements greater than 5 using Filter: " + intListGrtFive);

		List<Boolean> intListGrtFv = intList1.stream().map(num -> num > 5).toList();
		System.out.println("Find the elements grater than 5 using Map: " + intListGrtFv);

		// Sort the list using stream with ascending order
		List<Integer> intList2 = Arrays.asList(6, 7, 8, 1, 2, 3, 4, 5);
		System.out.println("List before sort: " + intList2);
		intList2 = intList2.stream().sorted().toList();
		System.out.println("List after sorted with ascending order: " + intList2);

		// Sort the list using Stream with descending order
		intList2 = intList2.stream().sorted(Collections.reverseOrder()).toList();
		System.out.println("Sorted List with Descending order: " + intList2);

		// Convert Object into UpperCase using Stream API and map Function
		List<String> names = Arrays.asList("Sailendra", "Narayan", "Jena");
		List<String> nameList = names.stream().map(String::toUpperCase).toList();
		System.out.println(nameList);
		List<String> nameListLower = names.stream().map(String::toLowerCase).toList();
		System.out.println(nameListLower);

		// Find the average of a list of integer using Stream api
		List<Integer> avgList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Double avgResult = avgList.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(avgResult);

		// Find the unordered List from a Ordered List using Stream API
		List<Integer> unordList = avgList.stream().map(Integer::intValue).unordered().toList();
		System.out.println(unordList);

		// Convert Array into Stream with ordered using parallelSort() method
		int arr[] = { 99, 55, 203, 99, 4, 91 };
		Arrays.parallelSort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		
		//Convert list to map and remove duplicate objects using Stream API
		List<Notes> noteList = Arrays.asList(new Notes(1, "Note1", 11), new Notes(2, "Note2", 12),
				new Notes(3, "Note3", 13), new Notes(4, "Note4", 14), new Notes(5, "Note5", 15),
				new Notes(6, "Note6", 16), new Notes(7, "Note7", 17), new Notes(8, "Note5", 15),
				new Notes(9, "Note9", 19));
		Map<String, Integer> noteRecords = noteList.stream().sorted(Comparator.comparingInt(Notes::getPages).reversed())
				.collect(Collectors.toMap(Notes::getName, Notes::getPages, (oldVal, newVal) -> oldVal,
						LinkedHashMap::new));
		System.out.println("Notes Record: "+noteRecords);
		
		//Count each elements/words from a String ArrayList using Stream API
		List<String> nameLists = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> nameCount = nameLists.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Name Counts: "+nameCount);
		
		//Count the occurrence of duplicate elements/words in the String ArrayList using Stream API
		List<String> names1 = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> nameDupCount = names1.stream().filter(x->Collections.frequency(names1, x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(nameDupCount);
		
		//Check if list is empty or not if not then iterates all elements using Stream API
//		Optional.ofNullable(noteList).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull).map(note->Notes::getName).forEach(System.out::println);
	}
}
