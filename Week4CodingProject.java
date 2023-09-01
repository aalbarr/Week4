package week4;

import java.util.Arrays;

public class Week4CodingProject {

	public static void main(String[] args) {
		// Step 1
		System.out.println("\nStep 1");
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		// declared array names ages w/ required data

		// Prints out my ages array
		System.out.println(Arrays.toString(ages));

		// Step 1a
		System.out.println("\nStep 1a");

		// accesses array
		int length = ages.length;

		// attaches last element of array to lastElement
		int lastElement = ages[length - 1];

		// prints out value of the first element minus the last element
		System.out.println(ages[0] - lastElement);

		// Step 1b
		System.out.println("\nStep 2b");

		// new array
		int[] age = { 3, 9, 23, 64, 2, 8, 28, 93, 79 };

		int lengths = age.length;

		int lastElementVerTwo = age[lengths - 1];

		// prints -76 to console proves code above is dynamic
		System.out.println(age[0] - lastElementVerTwo);

		// Step 1c
		System.out.println("\nStep 1c");
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		float average = sum / length;
		System.out.println(average);

		// Step 2
		System.out.println("\nStep 2");
		// makes array names with required names
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		// just prints to make sure it worked
		System.out.println(Arrays.toString(names));

		// Step 2a ??????????????????
		System.out.println("\nStep 2a");
		// loop to iterate thru array, adds # of letters of words
		// then averages them together
		double aveLetters = 0; // average number of letters for all names in names
		// for (String name : names) {
		// aveLetters += name.length(); 
		// }

		for (int ia = 0; ia < names.length; ia++) {

			aveLetters += names[ia].length();
		}

		System.out.println(aveLetters / names.length);//prints average of # of letter per name

		// Step 2b
		System.out.println("\nStep 2b");
		/*
		 * use loop to iterate thru array and concatenate all names together seperated
		 * by spaces
		 */
		StringBuilder sb = new StringBuilder();// creates new string
		for (int i = 0; i < names.length; i++) {// loops thru the array
			sb = sb.append(names[i] + " ");// adds every element
		} // of names array + " " to sb
		System.out.println(sb);// prints sb to console

		// Step 3
		// names[0]

		// Step 4
		// names.length -1

		// Step 5 
		System.out.println("\nStep 5"); 
		int[] nameLengths = new int[names.length]; //creates array nameLengths
		for (int ia = 0; ia < names.length; ia++) {//iterates thru array
			nameLengths[ia] = names[ia].length();// adds length of elements to array
		}

		// Step 6
		System.out.println("\nStep 6");
		int sumNameLengths = 0; //adds new variable
		for (int i = 0; i < nameLengths.length; i++) {// loops thru nameLengths array
			sumNameLengths += nameLengths[i];//adds sum of all elements of array to new variable
		}
		System.out.println(sumNameLengths);// prints the new variable

		

	}

	// Step 7 //method to concatenate a word, n number of times
	public static String concatWord(String word, int n) {
		String str = word;// declared new string variable
		StringBuilder sb = new StringBuilder("");// declared new stringbuilder for new string
		int num = n;// declared my integer
		for (int i = 0; i < num; i++) {// for loop to concat word by n
			sb.append(str);// adds str each time loop iterates to new string
		}
		return str;// returns str

	}

	// Step 8
	// String firstName = "Alex";
	// String lastName = "Albarran";
	// String fullName = createFullName(firstName, lastName);

	// System.out.println(fullName);

	// creates method to concatenate firstName and lastName
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
	}

	// Step 9
	// creates method of an array of numbers
	public static int intArray(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i; // adds sum of numbers in array
		}
		if (sum >= 100) {
			System.out.println(sum); // if true returns sum
		} else {
			System.out.println("Too many numbers."); // if greater then 100 returns this
		}
		return sum;
	}

	// Step 10
	// method of an array of doubles
	public static double aveArray(double[] numbers) {
		double sum = 0; // makes sum 0
		for (double i : numbers) {// iterates array thru a loop
			sum += i; // adds elements of array together
		}
		return sum / numbers.length; // divides sum by amount of elements in the array to get average
	}

	// Step 11
	public static boolean dblArray(double[] a, double[] b) {
//		int sum = 0;
//		int sum1 = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i] / a.length;		}
//		for (int i = 0; i < b.length; i++) {
//			sum1 += b[i] / b.length;
//		}if (sum > sum1) {
//			return sum;
//		}
//		return sum1;
//	
//	}
		double averageOne = aveArray(a); 
		double averageTwo = aveArray(b); // calls from method above to solve this problem
		return averageOne > averageTwo;

	}
	// Step 12

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean buyDrink = true; // makes a new boolean variable to pass in a true or false
		isHotOutside = true;// establishes iHO as true
		moneyInPocket = 15;// establishes mIP as greater then 15
		if (isHotOutside = true && moneyInPocket > 10.5) {// method to compare values to if it is hot and if you have
															// lots of cash
			return buyDrink;// returns true if conditions are met
		} else {
			return false;// returns false if otherwise
		}

	}
	// Step 13
	
	public static String gameWinner(int[] a, int[] b) {//method to find average of a teams score and determine the winner
		int scoreA = 0;//team a's score
		int scoreB = 0;//team b's score
		int scoreAverageA = 0;//average of team a
		int scoreAverageB = 0;//average of team b
		String aTeam = "A-Team";//string of A-Team
		String bTeam = "B-Team";//string of B-team
		for (int i : a) {//loop to add up a teams scores
			scoreA += a[i];
			for (int ia : b) {//loop to add up b teams scores
				scoreB += b[ia];
			}
		}scoreAverageA = scoreA / a.length; //averages scores
		scoreAverageB = scoreB / b.length; //averages scores
		
		if(scoreAverageA > scoreAverageB) {//if statement to determine the winner
			return aTeam;
		}else {
			return bTeam;
		}
		
		
		
	}
}
