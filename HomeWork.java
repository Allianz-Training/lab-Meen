package meen;

//import java.util.*;



public class HomeWork {
	public static void main(String[] args) {
//		System.out.println("--------------This is HW 1------------------");
//		draw1(2);
//		draw1(3);
//		draw1(4);
//		
//		System.out.println("---------------------------------------------");
//		
//		draw2(2);
//		draw2(3);
//		draw2(4);
//		
//		draw3(4);
//		
//		draw4(4);
		
//		draw5(4);
//		draw6(4);
//		draw7(4);
//		draw8(4);
//		String[][] table = { 
//			     { "1", "2", "3" }, 
//			     { "4", "5", "6" }, 
//			     { "7", "8", "9" } };
//		multiple(table);
//		draw9(4);
//		draw10(4);
//		draw11(4);
//		draw12(4);
//		draw13(4);
//		draw14(4);
//		draw15(4);
//		draw16(4);
//		multipication();
//		draw18(4);
//		draw19(4);
		draw20(4);
	}
	public static void draw1(int n) {
		String out = "";
		for (int i = 0; i < n; i++) {
			out += "*";
		}
		System.out.println(out);
	}
	public static void draw2(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("*".repeat(n));
		}
	}
	public static void draw3(int n) {
		for (int i = 0; i < n; i++) {
			for (int b = 1; b <= n; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
	public static void draw4(int n) {
		for (int i = 0; i <n ; i++) {
			for (int x =n; x>0; x--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	public static void draw5(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(Integer.toString(i).repeat(n));
		}
	}
	public static void draw6(int n) {
		for (int i = n; i >0; i--) {
			System.out.println(Integer.toString(i).repeat(n));
		}
	}
	public static void draw7(int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n ; j++) {
				count++;
				System.out.print(count+" ");
				
			}
			System.out.println();
		
		}
	}
	public static void draw8(int n) {
		int count = (int) Math.pow(n, 2);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n ; j++) {
				
				System.out.print(count+" ");
				count--;
			}
			System.out.println();
		
		}
	}
	public static void multiple(String[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(Integer.parseInt(table[i][j])*2);
				if (j != table[i].length -1 ) {
					System.out.print(", ");
				}
				
			}
			System.out.println();
		}
	}
	public static void draw9(int n) {
		int count = 0;
		for (int i = 0; i <n ; i++) {
			System.out.println(count);
			count= count+2; //count+=2
		}
	}
	public static void draw10(int n) {
		int count = 2;
		for (int i = 0; i <n ; i++) {
			System.out.println(count);
			count= count+2; //count+=2
		}
	}
	public static void draw11(int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n ; j++) {
				count++;
				System.out.print(count+" ");
				
			}
			System.out.println();
		}
		}
	public static void draw12(int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==count) {
					System.out.print("-");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			count++;
		}
	}
	public static void draw13(int n) {
		int count = n-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j==count) {
					System.out.print("-");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
			count--;
		}
	}
	public static void draw14(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j <= i) {
					System.out.print("*");
				} 
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void draw15(int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= 0; j--) {
				if (j >= i) {
					System.out.print("*");
				} 
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void draw16(int n) {
		for (int i = 0; i < n*2-1; i++) {
			if (i>=n) {
				for (int j = n; j >0 ; j--) {
					if (j>=(i-2)) {
						System.out.print("*");
					}
					else {
						System.out.print("-");
					}
				}
			}
			else {
				for (int j = 0; j < n; j++) {
					if (j<=(i)) {
						System.out.print("*");
					}
					else {
						System.out.print("-");
					}
			}
				
			}
			
			System.out.println();
			
		}
		
	}
	//draw17
	public static void multipication() {
//		Scanner scan = new Scanner(System.in);
		System.out.print(" Input: ");
//		int num = scan.nextInt();
		for (int i = 1; i <=12 ; i++) {
//			System.out.println(i + " x" + num + " = " + (i*num));
		}
	}
	public static void draw18(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n  ; j++) {
				if (j<=n -i) {
					System.out.print("-");					
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public static void draw19(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j > i - 1) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
	public static void draw20(int n) {
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
	
		
	

}
