package ch06.필드_선언_예시;

public class CarExample {
    public static void main(String[] args){
        Car newCar = new Car(); //Car 클래스를 참조하는 객체인 newCar를 생성한다.

        System.out.println("모델명 : " + newCar.model);
        System.out.println("출발 여부 : " + newCar.start);
        System.out.println("현재 속도 : " + newCar.speed);
        //Car라는 객체의 필드값이 각각 어떤 초기값을 가지고 있는지 나타낸다.
    }
}
