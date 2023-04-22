package ch06.생성자_직접_선언;

public class CarExample {
    public static void main(String[] args){
        Car newCar = new Car("그랜저", "검정", 350);
        //사용자가 직접 생성한 생성자에 맞추어 객체를 생성한다.
        //기본 생성자인 Car()는 사용하지 못한다.
    }
}
