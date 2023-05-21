package ch07._1_상속의_개념;

public class SmartPhone extends Phone{ //자식 클래스 extends 부모 클래스 형태로 상속받는다.
    public boolean wifi;

    public SmartPhone(String model, String color){ //SmartPhone 클래스의 생성자를 선언해주며
        this.model = model;
        this.color = color; //model과 color는 Phone 클래스로부터 상속을 받는다.
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이를 연결합니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
