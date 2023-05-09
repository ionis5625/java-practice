package ch06._12_this_키워드;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car("벤츠");
        Car yourCar = new Car("포르쉐");
        //각각 Car 클래스의 myCar, yourCar라는 객체를 생성한다. 문자열을 받는 생성자를 사용했다.

        myCar.run();
        yourCar.run();

        //그리고 Car 클래스 내의 run이라는 메소드를 실행한다. 속도를 100으로 설정하고 현재 속도가 얼마인지 출력하게 된다.
    }
}
