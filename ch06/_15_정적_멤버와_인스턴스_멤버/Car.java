package ch06._15_정적_멤버와_인스턴스_멤버;

public class Car {
    int speed; //인스턴스 필드 선언

    void run(){
        System.out.println(speed + "으로 달리고 있습니다.");
    }

    static void simulate(){
        Car myCar = new Car();
        //정적 객체 내에서 인스턴스 멤버를 사용하기 위해서는 다른 클래스를 참조하는 형식으로 이루어져야한다.
        myCar.speed = 200;
        myCar.run();
    } //simulate라는 정적 객체를 생성한다.

    public static void main(String[] args){
        simulate();

        Car myCar = new Car();

        myCar.speed = 60;
        myCar.run();
    }

}


