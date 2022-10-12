package ch12;
class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}
class student extends Human{//Human 클래스의 상속
	int studentId;
	void goToSchool() {}
}
class Worker extends Human{//Human 클래스의 상속
	int workerId;
	void goToworks() {}
}
public class Inheritance {

	public static void main(String[] args) {
		//human 객체 생성
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		//student 객체 생성
		student s = new student();
		s.name = "김민성";
		s.age = 16;
		s.studentId = 128;//추가로 정의한 멤버
		h.eat();
		h.sleep();
		s.goToSchool();//추가로 정의한 멤버
		//worker 객체 생성
		Worker w = new Worker();
		w.name = "김민성";
		w.age = 16;
		w.workerId = 128;//추가로 정의한 멤버
		w.eat();
		w.sleep();
		w.goToworks();//추가로 정의한 멤버
	}

}
