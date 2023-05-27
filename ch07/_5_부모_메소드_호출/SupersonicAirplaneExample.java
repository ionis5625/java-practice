package ch07._5_부모_메소드_호출;

public class SupersonicAirplaneExample {
    public static void main(String[] args){
        SupersonicAirplane sa = new SupersonicAirplane(); //SupersonicAirplane 클래스를 참조하는 sa 객체를 생성한다.

        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.supersonic; //sa 객체의 flyMode를 supersonic으로 변경한다.
        sa.fly();
        sa.flyMode = SupersonicAirplane.normal; //sa 객체의 flyMode를 normal로 변경한다.
        sa.fly();
        sa.land();
    }
}
