package ch07;
class A2{
	int m;
	int n;
	void init(int a,int b) {
		int c =3;
		this.m = a;
		this.n=b;
	}
	void work() {
		this.init(3,5);
	}
}
public class test3 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
	}

}
