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
			System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
			System.out.println(min + "-" + max);
			System.out.print(cnt + ">> ");
			num = scanner.nextInt();
			
			while(k!=num) {
				if(k<num) {
					System.out.println("�� �۰�");
					max = num;
				}
				else {
					System.out.println("�� ����");
					min = num;
				}
				cnt++;
				System.out.println(min + "-" + max);
				System.out.print(cnt + ">> ");
				num = scanner.nextInt();
			}
			System.out.println("�¾ҽ��ϴ�.");
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>> ");
			String text = scanner.next();
			if(text.equals("n")) {
				System.out.println("�����մϴ�..");
				break;
			}
			else {
				System.out.println("��� �����մϴ�..");
				continue;
			}
		}
	}
}
