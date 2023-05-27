package ch07._4_메소드_재정의_오버라이딩;

public class Computer extends Calculator { //Calculator 클래스를 상속받는 Computer 클래스를 선언한다.
    @Override //컴파일 시 메소드 재정의(오버라이딩)가 제대로 되었는지 체크해준다(생략 가능)
    public double areaCircle(double r){ //받는 메소드, 변수는 부모 클래스와 동일해야한다.
        return Math.PI * r * r; //부모 클래스는 3.14159인 반면 자식 클래스에선 Math.PI를 활용하여 더 정확한 결과를 얻을 수 있다.
    }
}
