import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"scissors", "rock", "paper"};
		String user, computer;
		int n;
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		System.out.println("���� : scissors , ���� : rock , �� : paper");
		do {
			System.out.print("���� ���� ��!>> ");
			user = scanner.next();
			if(user.equals("stop"))
				break;
			n = (int)(Math.random()*3);
			computer = str[n];
			if(user.equals("scissors")) {
				if(computer.equals("scissors")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", �����ϴ�.");
					continue;
				}
				else if(computer.equals("rock")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", ��ǻ�Ͱ� �̰���ϴ�.");
					continue;
				}
				else if(computer.equals("paper")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", ����ڰ� �̰���ϴ�.");
					continue;
				}
			}
			if(user.equals("rock")) {
				if(computer.equals("scissors")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", ��ǻ�Ͱ� �����ϴ�.");
					continue;
			}
				else if(computer.equals("rock")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", �����ϴ�.");
					continue;
			}
				else if(computer.equals("paper")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", ����ڰ� �����ϴ�.");
					continue;
			}
			}
			if(user.equals("paper")) {
				if(computer.equals("scissors")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", ��ǻ�Ͱ� �̰���ϴ�.");
					continue;
			}
				else if(computer.equals("rock")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", ����ڰ� �̰���ϴ�.");
					continue;
			}
				else if(computer.equals("paper")) {
					System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer + ", �����ϴ�.");
					continue;
			}
			}
			System.out.println("����� = " + user + " , " + "��ǻ�� = " + computer);
		}
		while(true);
		System.out.println("������ �����մϴ�...");
		scanner.close();
	}
}
