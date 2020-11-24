package com.allianz.helloWorld;



public class Lab {
	public static void main(String[] args) {
		bark();
		primitive();
		finals();
		unaryplus();
		unaryminuus();
		unaryplus2();
		compared();
		condition();
		lab4(40 , false);
		lab4opwater();
		lab4shipping();
		lab5();
		lab5b();
		lab8();
		lab9();
		lab10();
		lab11();
		
		
		
	}
	
	public static void bark() {
		String dogName = "Fu";
	    System.out.println("The Dog Name: "+ dogName);
	}
	public static void primitive() {

		int myInt = 50;
		float myFloat = 5.5f;
		double mydouble = 5.44d;
		char myChar = 'A';
		
		
		int newInt = (int) myFloat;
		float newFloat = (float) myInt;
		float newDouble = (float) mydouble;
		int newChar = (char) myChar;
		
		System.out.println(newInt);
		System.out.println(newFloat);
		System.out.println(newDouble);
		System.out.println(newChar);
	}
	public static void finals() {
		final int finalInt = 20;
		//finalInt = 40;
		
		System.out.println("final value: " + finalInt);
		
		}
	public static void unaryplus() {
		
		int i = 20; 
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
	}
	public static void unaryminuus() {
		int i = 20; 
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
	}
	public static void unaryplus2() {
		int i = 0;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i*3);
	}
	public static void compared() {
		int one = 1;
		int two = 2;
		if (one==two)
			System.out.println("one = two");
		if (one!=two)
			System.out.println("one != two: 1 not eq 2");
		if (one>two)
			System.out.println("one > two: 1 not more than 2");
		if (one<two)
			System.out.println("one < two: 1 less than 2");
		if (one<=two)
			System.out.println("one <= two: 1 not eq or more than 2");
			
			
		
		
	}
	public static void condition() {
		int one = 1;
		int two = 2;
		if ((one == 1 ) && (two == 2))
			System.out.println("one is 1 AND two is 2");
		if ((one ==1) || (two == 1))
			System.out.println("one is 1 OR two is 2");
		
	}
	public static void lab4(int score , boolean isHandsome) {
		
		if (isHandsome) {
			System.out.println("Good");
		}
		else {
			if (score >= 80) {
				System.out.println("Good");
				}
				else if (score>=50) {
					System.out.println("normal");
				}
				else if (score<50) {
					System.out.println("fail");
				}
		}
			
//		if (score >= 80) {
//			System.out.println("Good");
//			}
//			else if (score>=50) {
//				System.out.println("normal");
//			}
//			else if (score<50) {
//				System.out.println("fail");
//			}
		
	}
	public static void lab4opwater() {
		int water = 100;
		double total = 0;
		
		if (water <=50) {
			total = water * 4.25;
			}
		else if (water<=100) {
			total = water * 3.25;
			
		}
		else {
			total = water * 2.25;
			
		}
			System.out.println(total);
		
		
		
}
	public static void lab4shipping() {
		int product = 2000;
		int year = 0;
		while(product<=5000) {
			product = product+365;
			year++;
			System.out.println("years = "+ year);
			System.out.println("product = "+ product);
		}
		System.out.println("the company was produce for:"+ year+"year");
	}
	public static void lab5() {
		int grade = 60;
		if (grade >=80) {
			System.out.println("Grade A ");
		}
		else if (grade <=70) {
			System.out.println("Grade B ");
		}
		else if (grade <=60) {
			System.out.println("Grade C ");
		}
		else if (grade <= 50) {
			System.out.println("Grade D ");
		}
		else if (grade <50 ) {
			System.out.println("Grade F ");
			
		}
		else {
			System.out.println("Your Grade ");
		}
	}
	public static void lab5b() {
		int grade = 60;
		switch (grade) {
		case 80:
			System.out.println("Your Score = "+ grade + "and"+ "Your grade A"); 
			break;
		case 70:
			System.out.println("Your Score = "+ grade + "and"+ "Your grade B"); 
			break;
		case 60:
			System.out.println("Your Score = "+ grade + "and"+ "Your grade C"); 
			break;
		case 50:
			System.out.println("Your Score = "+ grade + "and"+ "Your grade D"); 
			break;
		case 40:
			System.out.println("Your Score = "+ grade + "and"+ "Your grade F"); 
			break;
		default:
			System.out.println("Idiot");
		}
	}
	public static void lab8() {
		for (int counter = 0; counter <=20; counter++) {
			if (counter == 11) {
			System.out.println("counter: "+ counter);	
				break;
			}
			
		}
	}
	public static void lab9() {
		for (int couter = 0; couter <= 20; couter++) {
			if (couter==11) {
			System.out.println("************count = "+ couter);	
				continue;
				
			}
			System.out.println("Count = "+ couter);
		}
	}
	public static void lab10() {
		for (int A = 0; A < 10; A++) {
			
			if (A ==2) {
				continue;
				
			}
			System.out.println(A);
		} 
			
	}	
	public static void lab11() {
		String myName = "Hello world!";
		hi(myName);
		System.out.println(sum(10, 5));
		
	}
	public static void hi(String world) {
		System.out.println(world);
	}
	public static int sum(int a, int b) {
		return a+b;
	}
}

