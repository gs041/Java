import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		Grade me = new Grade(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		System.out.println("���� " + me.sum());
		System.out.println("����� " + me.average());
		
		scanner.close();
	}
}