package ch07._12_매개변수의_다형성;

public class DriverExample {
    public static void main(String[] args){
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);
        /*
        drive 메소드는 매개변수로 클래스 타입의 Vehicle을 받았지만 bus는 Vehicle로부터 상속을 받았으므로
        이 때 drive 메소드는 bus.run을 실행시키는 것과 동일한 메세지를 출력한다.
        driver.drive(new Bus());와 동일하며 타입 변환이 자동으로 이루어진다.
        */

        Taxi taxi = new Taxi();
        driver.drive(taxi);
        //마찬가지로 taxi.run을 실행시키는 것과 동일하다.
    }
}
