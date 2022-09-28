import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
		Grade me = new Grade(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		System.out.println("합은 " + me.sum());
		System.out.println("평균은 " + me.average());
		
		scanner.close();
	}
}