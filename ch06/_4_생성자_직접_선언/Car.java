package ch06._4_생성자_직접_선언;

public class Car {
    Car(String model, String color, int maxSpeed){
        //기존의 클래스에서 생성자를 붙여주지 않는다면 Car()식으로 JVM에서 자동으로 생성자를 만들지만
        //유저가 직접 생성자를 만들어주는 경우 기본 생성자는 만들어지지 않고 호출하지도 못한다.
    }

}
