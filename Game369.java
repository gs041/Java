import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99������ ������ �Է��Ͻÿ�: ");
		
		int num = scanner.nextInt();
		int cnt = 0;
		
		if(num/10==3 || num/10==6 || num/10==9)
			cnt++;
		if(num%10==3 || num%10==6 || num%10==9)
			cnt++;
		if(cnt == 0)
			System.out.print(num);
		else {
			System.out.print("�ڼ�");
			if(cnt == 1)
				System.out.print("¦");
			else
				System.out.print("¦¦");
		}
		scanner.close();
	}
}
