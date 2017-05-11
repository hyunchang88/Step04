package test.main;
import test.star.Marine;
import test.plane.AirPlane;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		//Marine type 객체를 생성해서
		//참조값(id)를 이용하여 move() 메소드 호출하기
		
		new Marine().move();//일반 메소드를 실행하는중
		
		// Class 명 자체가 객체의 type이 됌. 따라서 m1 앞에 Marine 해준것.
		// 정확한 type 은 test.star.Marine type 인 것.
		
		// Marine type 객체 생성해서 참조값(id) 를 변수에 담고
		Marine m1 = new Marine();
		// 여러번 참조해서 사용하기
		m1.move();
		m1.move();
		m1.move();
		
		System.out.println("메인 메소드가 리턴되었습니다.");
	}
}
