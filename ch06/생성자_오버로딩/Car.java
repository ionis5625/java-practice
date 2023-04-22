package ch06.생성자_오버로딩;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

        Car(){} //기본 생성자
        Car(String model){
            this.model = model;
        }

        Car(String model, String color){
            this.model = model;
            this.color = color;
        }

        Car(String model, String color, int maxSpeed){
            this.model = model;
            this.color = color;
            this.maxSpeed = maxSpeed;
        }

        //생성자를 여러개 만들어주어 제공되는 매개값과 비교한 뒤 실행될 생성자를 결정하게 된다.
        //예를 들어 String 변수가 2개, int 변수가 1개라면 마지막의 생성자로 객제를 생성하는 방식이다.
}
