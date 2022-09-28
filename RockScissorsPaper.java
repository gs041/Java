import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"scissors", "rock", "paper"};
		String user, computer;
		int n;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.println("가위 : scissors , 바위 : rock , 보 : paper");
		do {
			System.out.print("가위 바위 보!>> ");
			user = scanner.next();
			if(user.equals("stop"))
				break;
			n = (int)(Math.random()*3);
			computer = str[n];
			if(user.equals("scissors")) {
				if(computer.equals("scissors")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 비겼습니다.");
					continue;
				}
				else if(computer.equals("rock")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 컴퓨터가 이겼습니다.");
					continue;
				}
				else if(computer.equals("paper")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 사용자가 이겼습니다.");
					continue;
				}
			}
			if(user.equals("rock")) {
				if(computer.equals("scissors")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 컴퓨터가 졌습니다.");
					continue;
			}
				else if(computer.equals("rock")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 비겼습니다.");
					continue;
			}
				else if(computer.equals("paper")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 사용자가 졌습니다.");
					continue;
			}
			}
			if(user.equals("paper")) {
				if(computer.equals("scissors")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 컴퓨터가 이겼습니다.");
					continue;
			}
				else if(computer.equals("rock")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 사용자가 이겼습니다.");
					continue;
			}
				else if(computer.equals("paper")) {
					System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer + ", 비겼습니다.");
					continue;
			}
			}
			System.out.println("사용자 = " + user + " , " + "컴퓨터 = " + computer);
		}
		while(true);
		System.out.println("게임을 종료합니다...");
		scanner.close();
	}
}
