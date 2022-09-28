import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99까지의 정수를 입력하시오: ");
		
		int num = scanner.nextInt();
		int cnt = 0;
		
		if(num/10==3 || num/10==6 || num/10==9)
			cnt++;
		if(num%10==3 || num%10==6 || num%10==9)
			cnt++;
		if(cnt == 0)
			System.out.print(num);
		else {
			System.out.print("박수");
			if(cnt == 1)
				System.out.print("짝");
			else
				System.out.print("짝짝");
		}
		scanner.close();
	}
}
