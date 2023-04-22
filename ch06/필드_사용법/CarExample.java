package ch06.필드_사용법;

public class CarExample {
    public static void main(String[] args){
        Car newCar = new Car(); //Car라는 클래스를 참조하는 객체인 newCar 생성

        System.out.println("제작회사 : " + newCar.company);
        System.out.println("모델명 : " + newCar.model);
        System.out.println("색깔 : " + newCar.color);
        System.out.println("최고속도 : " + newCar.maxSpeed);
        System.out.println("현재속도 : " + newCar.speed);

        newCar.speed = 60; //C언어의 함수와는 달리 서로 다른 클래스에서도 필드의 값은 변경이 가능하다.
        System.out.println("수정된 속도 : " + newCar.speed);
    }
}
