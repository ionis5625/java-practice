package ch07._4_메소드_재정의_오버라이딩;

public class Calculator {
    public double areaCircle(double r){ //원의 반지름을 받은 뒤 원주율 * 반지름 * 반지름으로 원의 넓이를 구하는 메소드
        return 3.14159 * r * r;
    }
}
