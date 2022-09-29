import java.util.Scanner;
import java.util.Random;

public class OpenChallenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int num = 0;
		int min = 0;
		int max = 0;
		
		while(true) {
			min = 0;
			max = 99;
			int cnt = 1;
			int k = r.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println(min + "-" + max);
			System.out.print(cnt + ">> ");
			num = scanner.nextInt();
			
			while(k!=num) {
				if(k<num) {
					System.out.println("더 작게");
					max = num;
				}
				else {
					System.out.println("더 높게");
					min = num;
				}
				cnt++;
				System.out.println(min + "-" + max);
				System.out.print(cnt + ">> ");
				num = scanner.nextInt();
			}
			System.out.println("맞았습니다.");
			System.out.print("다시하시겠습니까(y/n)>> ");
			String text = scanner.next();
			if(text.equals("n")) {
				System.out.println("종료합니다..");
				break;
			}
			else {
				System.out.println("계속 진행합니다..");
				continue;
			}
		}
	}
}
