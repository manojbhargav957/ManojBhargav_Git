import java.util.Scanner;
public class Substraction {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int sub=num1-num2;
			System.out.println(sub);
		}
	}

}
