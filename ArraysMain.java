package arrays;

import java.util.*;

public class ArraysMain {

	public static void main(String[] args) {
// Bad Bagger
//		int num1 = 4;
//		int num2 = 6;
//		int num3 = 19;
//		//...
//		System.out.println(num1 + " " + num2 + " " + num3);
//		// grouping of similar variables together
//		// primitive array
//		// index value:0  |  1  |  2
//		int[] arr1 = {num1, num2, num3};
//		String[] arr2 = {"Think", "about", "it"};
//		int[] arr3 = {1, 2, 3, 4, 5, 6};
//		double[] arr4 = {2.3, 3.4, 5.6, 6.73};
//		boolean[] arr5 = {true, false, false, true};
//		char[] arr6 = {'M', 'a', 'r', 'y'};
//		
//	
//		
//		
//		System.out.println(arr1[0] + " " + arr2[1] + " " + arr1[2]);
//		// System.out.println(arr2);
//		
////		for(int i = 0; i <= arr2.length - 1; i++) {
////			System.out.println(arr2[i]);
////		}
//		
//		
//		double[] arrRefVar = new double[5];
//		arrRefVar[0] = 2.3;
//		arrRefVar[1] = 4.32;
//		arrRefVar[2] = 78.34;
//		arrRefVar[3] = 54.89;
//		arrRefVar[4] = 9213.8;
//		
//		for(int i = 0; i < arrRefVar.length; i++) {
//			System.out.println(arrRefVar[i]);
//		}
//		System.out.println("Array length: " + arrRefVar.length);
//		
//		boolean[] boolArr = new boolean[3];
//		for (int i = 0; i < boolArr.length; i++) {
//			System.out.print(boolArr[i] + " | ");
//		}
//		char[] charArrZard = new char[4];
//		System.out.println();
//		for (int i = 0; i < charArrZard.length; i++) {
//			System.out.print(" | " + (int) charArrZard[i]);
//		}

//		int[] myList = new int[5];
//		for (int i = 0; i < myList.length; i++) {
//			myList[i] = i;
//		}
//		
//		for (int i = 0; i < myList.length; i++) {
//			System.out.println(myList[i]);
//		}

//		double[] listTwo = new double[5];
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter " + listTwo.length + " values: ");
//		for(int i = 0; i < listTwo.length; i++) {
//			listTwo[i] = in.nextDouble();
//		}
//		
//		System.out.println("Values that were input: ");
//		for(int i =0; i < listTwo.length; i++) {
//			System.out.print(listTwo[i] + "|");
//		}

//		double[] listThree = new double[6];
//		//randomizer
//		for(int i = 0; i < listThree.length; i++) {
//			listThree[i] = Math.random() * 100;
//		}
//		
//		for (int i = 0; i < listThree.length; i++) {
//			System.out.print((int) listThree[i] + " | ");
//		}

//		String phraseTwo = "Meet me in St Louis";
//		char[] charArrBok = phraseTwo.toCharArray();
//		for (int i = 0; i < charArrBok.length; i++) {
//			System.out.print("'" + (int)charArrBok[i] + "', ");
//		}

//		char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
//		System.out.println(city);

		// index = 0 | 1 | 2 | 3 | 4 |
//		double[] listFour = {1, 2, 3, 4, 5};
//		double total = 0;
//		
//		for(int i = 0; i < listFour.length; i++) {
//			// total = total + listFour[i];
//			total *= listFour[i];
//			System.out.println(total);
//		}
//		
//		System.out.println(total);

//		double[] listFive = { 34.5, 67.2, 56.3, 21.8 };
//
//		Arrays.sort(listFive);
//		
//		for (int i = 0; i < listFive.length; i++) {
//			System.out.println("Outer loop is at: " + i);
//			for (int j = 0; j < listFive.length - 1; j++) {
//				System.out.println("Inner loop is at: " + j);
//				if (listFive[j] < listFive[j + 1]) {
//					double temp = listFive[j]; 
//					System.out.println("Temp: " + temp + " listFive[j]: " + listFive[j]);
//					listFive[j] = listFive[j + 1]; 
//					System.out.println("listFive[j]: " + listFive[j] + " listFive[j + 1] " + listFive[j + 1]);
//					listFive[j + 1] = temp; 
//					System.out.println("listFive[j + 1]: " + listFive[j + 1] + " Temp: " + temp);
//				}
//			}
//		}
//		double highest = listFive[listFive.length - 1];
//		System.out.println(highest);
//		for (int i = 0; i < listFive.length; i++) {
//			System.out.print(listFive[i] + " ");
//		}

	}

}
