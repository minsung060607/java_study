package ch07;
import java.util.Scanner;
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner su = new Scanner(System.in);
		int i=0;
		int num1;
		char num2;
		int num3;
		int j;
			System.out.print("와 자바 계산기 만들기");
		while(i==0) {
			num1 = su.nextInt();
			num2 = su.next().charAt(0);
			num3 = su.nextInt();
			if(num2 == '+') {
				System.out.println(num1 + "+"+ num3 +"=" + (num1+num3));
			}else if(num2 == '-') {
				System.out.println(num1 + "-"+ num3 +"=" + (num1-num3));
			}else if(num2 == '*') {
				System.out.println(num1 + "*"+ num3 +"=" + (num1*num3));
			}else if(num2 == '/') {
				System.out.println(num1 + "/"+ num3 +"=" + (num1/num3));
			}
			System.out.print("계속 실행 하려면 0,그렇지 않으면 1을 입력하세요");
			j = su.nextInt();
			if(j == 1) {
				break;
			}
		}
	}

}
