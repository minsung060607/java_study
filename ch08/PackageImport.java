package ch08;
import ch08.A;
public class PackageImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ch08.A a=new ch08.A(); 직접 주서를 적어 사용함
		A num = new A();//import를 사용하여 class를 사용함
		System.out.println(num.m);
		System.out.println(num.n);
		num.print();
	}

}
