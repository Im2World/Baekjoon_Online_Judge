import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int cooktime = sc.nextInt();
		// 전부 분으로 변환
		int allMin = h * 60 + m + cooktime;
		h = allMin / 60;
		m = allMin % 60;

		// 24시간 체계
		if (h >= 24) {
			h = h - 24;
		}
		System.out.println(h + " " + m);
	}
}