package num8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int Num = Integer.parseInt(br.readLine());
		int Sum = 0;
		br.close();

		for (int i = 0; i <= Num; i++) {
			Sum += i;
		}
		System.out.println(Sum);
	}
}
