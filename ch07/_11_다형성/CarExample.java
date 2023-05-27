package ch07._11_다형성;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        //myCar라는 객체를 생성한다.

        myCar.tire = new Tire();
        myCar.run();

        //처음엔 Car 클래스를 참조했으므로 Car 클래스 내의 Tire 클래스를 참조하는 tire의 roll, 즉 Tire 클래스의 roll 메소드를 실행한다.

        myCar.tire = new HankookTire();
        myCar.run();

        //그 다음으론 Tire의 자식 클래스 중 하나인 HankookTire 클래스로 타입 변환을 해준 뒤 run 메소드를 실행한다.
        //이러면 HankookTire 클래스에 있는 roll 메소드가 실행된다.

        myCar.tire = new KumhoTire();
        myCar.run();

        //마찬가지로 Tire의 자식 클래스 중 하나인 KumhoTire 클래스로 타입 변환을 해준 뒤 run 메소드를 실행한다.
    }
}
