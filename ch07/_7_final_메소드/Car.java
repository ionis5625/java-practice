package ch07._7_final_메소드;

public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public final void stop(){
        System.out.println("차량을 멈춥니다.");
        speed = 0;
    }
}
