package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Week4StringBulerLIstSetMapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Question 1 answer
		System.out.println("Question 1");
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(i);  //this is adding i to sb
			if (i != 9) {  //as long as i does not equal 9
				sb.append("-"); //add "-" to after the int
		}
	}
		
		System.out.println(sb);
		
		//Question 2
		
		System.out.println("Question 2");
		
		List<String> dogBreeds = new ArrayList<String>();
		dogBreeds.add("GermanShep");
		dogBreeds.add("Shibainu");
		dogBreeds.add("Corgi");
		dogBreeds.add("Doberman");
		dogBreeds.add("Poodle");
		
		//Array.asList("***", "+++", etc.); accomplishes the same
		//with fewer lines of code.
		//goes above List<...= Array.asList(...);
		
		System.out.println(dogBreeds);   //this wasnt needed, just
										//checking to see if it worked
		
		//Question 3
		
		System.out.println("Question 3");		
		
		System.out.println(findShortestString(dogBreeds));
		
		
		//Question 4
		
		System.out.println("Question 4");
		
		List <String> swapped = swapFirstAndLast(dogBreeds);
		for (String string : swapped) {//for every string in swapped
			System.out.println(string);//print string
		}
		
		//Question 5 
		
		System.out.println("Question 5");
		
		List <String> concat = concatElements(dogBreeds); //calls method from below
		for (String string : concat) {//for every string in concat
		System.out.print(string + ", ");//print string
		}
		System.out.println(' ');
		
		//Question 6
		
		System.out.println("Question 6");
		
		List<String> searchResults = search(dogBreeds, "a"); //takes our list dogBreed, query is "a"
		for (String result : searchResults) { //iterates over the dogBreeds and searches for query in list
			System.out.println(result); //prints what code intended
	}
		
		//Question 7
		
		System.out.println("Question 7");
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		
		for(List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			System.out.println("Next list ---------");
		}
		
		//Question 8
		// 8. Write and test a method that takes a list of strings 
		//and returns a list of integers that contains the length of each string
		
		System.out.println("\nQuestion 8");
		List<Integer> dogBreedsLength = strinLength(dogBreeds);
		for (Integer i : dogBreedsLength) {
			System.out.println(i);
		}
	
		//Question 9
		// 9. Create a set of strings and add 5 values
		System.out.println("\nQuestion 9");
		Set<String> drones = new HashSet<String>();
		drones.add("FPV");
		drones.add("Mini3");
		drones.add("Air3");
		drones.add("Ai2");
		drones.add("Mini3pro");
		for (String word : drones) {
			System.out.println(word);
		}
		
		//Question 10
		System.out.println("\nQuestion 10");
		
		Set<String> startsWithInput = allStrings(drones, 'F');
		for (String string : startsWithInput) {
			System.out.println(string);
		}
		//Question 11
		System.out.println("\nQuestion 11");
		
		List<String> returnsList = listOfStrings(drones);
		
		for (String string : returnsList) {
			System.out.println(string);
		}
		//Question 12
		System.out.println("\nQuestion 12");
		
		Set<Integer> numbSet = new HashSet<Integer>();
		numbSet.add(8);
		numbSet.add(13);
		numbSet.add(98);
		numbSet.add(27);
		
		Set<Integer> extractRes = setOfInteger(numbSet);
		for (Integer number : extractRes) {
			System.out.println(number);
		}
		
		//Question 13
		System.out.println("\nQuestion 13");
		
		Map<String, String> dictionary =new HashMap<String, String>();
		dictionary.put("Apple", "A crunchy fruit usually red");
		dictionary.put("Banana", "A yellow fruit");
		dictionary.put("Java", "A programming language made in 1995");
		
		
		//Question 14
		System.out.println("\nQuestion 14");
		
		String value = lookupValue(dictionary, "Java");
		System.out.println(value);
		
		
		//Method 15
		System.out.println("\nQuestion 15");
		 
		Map<Character, Integer> counts = countStartingLetters(returnsList);
		
		for (Character character : counts.keySet()){
			System.out.println(character + "-" + counts.get(character));
		}
		
	}	
		//methods here outside of main
	
				//Method 15
			public static Map<Character, Integer> countStartingLetters(List<String> list) {
				Map<Character, Integer> results = new HashMap<Character, Integer>();
				
				for (String string : list) {
					char c = string.charAt(0);
					if(results.get(c) == null) {
						results.put(c, 1);
					}else {
						results.put(c, results.get(c) + 1);
					}
				}
				
				return results;
				
			}
	
	
				//Method 14
			public static String lookupValue(Map<String, String> map, String string) {
				for(String key : map.keySet()) {
					if (key.equals(string)) {
						return map.get(key);
					}
				}
				return "";
			}
	
				//Method 13
			//doesnt need a methond for this question
	
				//Method 12
			public static Set<Integer> setOfInteger(Set<Integer> set){
				Set<Integer> results = new HashSet<Integer>();
				
				for (Integer inte : set) {
					if ( inte % 2 == 0) {
						results.add(inte);
					}
				}
				return results;
			}
	
				//Method 11
			public static List<String> listOfStrings(Set<String> list){
				List<String> result = new ArrayList<String>();
				
				for (String string : list) {
					result.add(string);
				}
				return result;
			}
	
				//Method 10 
			public static Set<String> allStrings(Set<String> set, char a){
				Set<String> result = new HashSet<String>();
				
				for (String string : set) {
					if (string.charAt(0) == a) {
						result.add(string);
					}
				}
				return result;
			}
	
	
				//Method 8
			public static List<Integer>  strinLength(List<String> list) {
				List<Integer> lengths = new ArrayList<Integer>();//declares new arraylist called lengths
				for(String string : list) {
					lengths.add(string.length());//adds the # of char to lengths list
				}
				return lengths;
			}
	
	
	
				//Method 7
				//reads as list of list of integers takes a list of integers and calls it list
			public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
				List<List<Integer>> results = new ArrayList<List<Integer>>();
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				
				for (Integer number : list) {
					if (number % 2 == 0 ) {
						results.get(0).add(number);
					}
					if (number % 3 == 0 ) {
						results.get(1).add(number);
					}
					if (number % 5 ==0) {
						results.get(2).add(number);
					}
					if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
						results.get(3).add(number);
					}
				}return results;
				
			}
	
	
				//Method 6
			public static List<String> search(List<String> list, String query){
			List<String> results = new ArrayList<String>();	//creates new array: results
				for (String string : list) { //for string in list (string is new object)
					if(string.contains(query)) { //if it contains  whatever is in query
						results.add(string); //add to new string
					}
				}
				return results;
				}
			

				//Method 5
			public static List<String> concatElements(List<String> list){
				String tem = String.join(", ", list);
				return list;
			}
			
	
	
				//method 4 
			public static List<String> swapFirstAndLast(List<String> list){
				String temp = list.get(0);   //this gets first element at place 0
				list.set(0, list.get(list.size() - 1)); //this overrides first element w last
				list.set(list.size() -1 , temp);
					return list;
	}
	
				//method 3 
			public static String findShortestString(List<String> list) {
				String shortest = list.get(0);
				for (String string : list) {
					if (string.length() < shortest.length()) {
						shortest = string;
					}
				}
					return shortest;
				}
			
}
