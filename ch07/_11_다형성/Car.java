package ch07._11_다형성;

public class Car {
    public Tire tire;

    public void run(){
        //tire 필드에 대입된 객체의 roll()메소드를 호출하게 된다.
        tire.roll();
    }
}
