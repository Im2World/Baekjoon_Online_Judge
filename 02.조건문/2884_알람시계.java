import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt(); // 시
		int min = sc.nextInt(); // 분
		sc.close();

		//1. 분이 60보다 작으면 hour -1
		if(min < 45) {
			hour--;
			min= 60 - (45 - min);

		//2. 24시 체계라서 hour를 23으로 수정
			if(hour < 0) {
				hour = 23;
			}
			System.out.println(hour + " " + min);
		}

		//3. min이 45보다 클 경우
		else {
			System.out.println(hour + " " + (min - 45));
		}
	}

}