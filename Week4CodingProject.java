package week4;

import java.util.Arrays;

public class Week4CodingProject {

	public static void main(String[] args) {
		//Step 1
		System.out.println("\nStep 1");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//declared array names ages w/ required data
		
		//Prints out my ages array
		System.out.println(Arrays.toString(ages));
		
		//Step 1a
		System.out.println("\nStep 1a");
		
		 //accesses array
		int length = ages.length; 
		
		//attaches last element of array to lastElement
		int lastElement = ages[length-1];  
		
		//prints out value of the first element minus the last element
		System.out.println(ages[0] - lastElement); 
		
		//Step 1b
		System.out.println("\nStep 2b");
		
		//new array
		int[] age = {3, 9, 23, 64, 2, 8, 28, 93, 79};
		
		int lengths = age.length;
		
		int lastElementVerTwo = age[lengths -1];
		
		//prints -76 to console proves code above is dynamic
		System.out.println(age[0] - lastElementVerTwo);
		
		//Step 1c
		System.out.println("\nStep 1c");
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		float average = sum / length;
		System.out.println(average);
		
		//Step 2
		System.out.println("\nStep 2");
		//makes array names with required names
		String[] names = {"Sam", "Tommy", 
		"Tim", "Sally", "Buck", "Bob"};
		//just prints to make sure it worked
		System.out.println(Arrays.toString(names));
		
		
		//Step 2a   ??????????????????
		System.out.println("\nStep 2a");
		//loop to iterate thru array, adds # of letters of words
		//then averages them together
		double aveLetters;  //average number of letters for all names in names
		for (String name : names) {
			aveLetters += name.length();  //michael's example
		}
		
		
		for (int ia = 0; ia < names.length; ia++) {
			
			
			
			aveLetters += names[ia].length();
		}		
		
		
			System.out.println(aveLetters / names.length);
		
		
		//Step 2b
		System.out.println("\nStep 2b");
		/*use loop to iterate thru array and concatenate
		 * all names together
		 * seperated by spaces
		 */ 
		StringBuilder sb = new StringBuilder();//creates new string
		for(int i = 0; i < names.length; i++) {//loops thru the array
				sb = sb.append(names[i] + " ");//adds every element
			}					//of names array + " " to sb
		System.out.println(sb);// prints sb to console
	
		
		//Step 3
		//names[0]
		
		//Step 4 
		//names.length -1
		
		//Step 5   //michaels example
		int[] nameLengths = new int [names.length];
			for(int ia = 0; ia < names.length; ia++) {
				nameLengths[ia] = names[ia].length();
			}
		
		//Step 6
		
		
		//Step 11
		
		//Step 12
		
		//Step 13
		
		
		}
	
	//Step 7  ???????????
	public static String concatWord(String word, int n) {
		
	}
	
	//Step 8
	//String firstName = "Alex";
	//String lastName = "Albarran";
	//String fullName = createFullName(firstName, lastName);
	
	//System.out.println(fullName);
	
	//creates method to concatenate firstName and lastName
	public static String createFullName(String x, String y) { 
		String fullName = x + y;
		return fullName;
	}
	
	
	//Step 9
	//creates method of an array of numbers
	public static int intArray(int[] numbers) {
		int sum = 0; 
		for (int i : numbers) {
			sum += i; //adds sum of numbers in array
		} if (sum >= 100) {
			System.out.println(sum); //if true returns sum
		}else {
			System.out.println("Too many numbers."); //if greater then 100 returns this
		}
		return sum;
	}
	//Step 10
	//method of an array of doubles
	public static double aveArray(double[] numbers) {
		double sum = 0; //makes sum 0
		for (double i : numbers) {//iterates array thru a loop
			sum += i; //adds elements of array together
		}
		return sum / numbers.length; //divides sum by amount of elements in the array to get average
	}
	
		}
