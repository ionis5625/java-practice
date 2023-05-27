package ch07._12_매개변수의_다형성;

public class Driver {
    public void drive(Vehicle vehicle){
        vehicle.run();
    }

    //drive 메소드는 클래스 타입의 매개변수를 가지고 있다.
}
