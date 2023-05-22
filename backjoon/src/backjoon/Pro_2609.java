package backjoon;

import java.util.Scanner;

public class Pro_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result=1;
		int result2=0;
		int[] arr1 = new int[a];
		int[] arr2 = new int[b];
		if(a>b) {
			for(int i=b; i>1; i--) {
				if(a%i == 0 && b%i==0 ) {
					result=i;
					break;
				}
			}
		}else {
			for(int i=a; i>1; i--) {
				if(a%i == 0 && b%i==0 ) {
					result=i;
					break;
				}
			}
		}
		try {
			result2 = result * a/result * b/result;
		}catch(Exception e) {
			
		}
		
		System.out.println(result);
		System.out.println(result2);
	}

}
