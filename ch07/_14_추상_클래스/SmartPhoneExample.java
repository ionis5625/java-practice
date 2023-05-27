package ch07._14_추상_클래스;

public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone smartPhone = new SmartPhone("홍길동");
        //Phone phone = new Phone(); Phone은 추상 클래스이기 때문에 이런식으로 직접적인 객체 생성이 불가능하다.

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
