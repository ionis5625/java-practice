package ch07._7_final_메소드;

public class SportsCar extends Car{
    public void speedUp(){
        speed += 10;
    }

    /*
    public void stop(){
        System.out.println("차를 멈춥니다.");
        speed = 0;
    }
    */

    /*
    SportsCar라는 클래스는 Car 클래스로부터 상속받았는데 stop 메소드의 경우 final이 붙어있다.
    따라서 stop 클래스는 오버라이딩 될 수 없다.
    */
}
