package ch06.다른_생성자_호출;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(String model){
        this(model, "검은색", 250);
    } //여기서 사용된 this는 맨 밑에 있는 생성자를 호출한다는 의미이다. 현재 생성자에서는 company라는 변수밖에 없기 때문에
      //model과 maxSpeed는 이 생성자에서 값을 먼저 제공해준다.

    Car(String model, String color){
        this(model, color, 250);
    }
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
