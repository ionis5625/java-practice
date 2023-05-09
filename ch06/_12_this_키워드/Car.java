package ch06._12_this_키워드;

public class Car {
    String model;
    int speed;

    //Car의 생성자를 선언한다.
    Car(String model){
        this.model = model; //매개변수를 model이라는 필드에 대입한다.
    }

    //이제 메소드를 선언한다. 반환 값이 없으므로 void형이다.
    void setSpeed(int speed){
        this.speed = speed; //생성자와 마찬가지로 매개변수를 speed라는 필드에 대입한다.
    }

    void run(){
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다. 시속 : " + this.speed + "km/h");
    }
}

