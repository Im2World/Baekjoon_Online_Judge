package num10950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum, num1, num2;

		caseNum = sc.nextInt();
		int arr[] = new int[caseNum]; // arr size

		for (int i = 0; i < caseNum; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			arr[i] = num1 + num2;
		}
		sc.close();

		//print
		for (int k : arr) {
			System.out.println(k);
		}
	}

}
