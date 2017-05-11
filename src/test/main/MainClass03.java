package test.main;

//다른 패키지에 있는 특정 클래스 import 하기
import test.plane.AirPlane;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인메소드가 시작되었습니다.");
		// . 다른 클래스의 static 멤버 메소드를 호출할때 사용한다.
		Person.sing();
		//import된 클래스의 static 멤버 메소드 호출하기
		AirPlane.fly();
		
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
