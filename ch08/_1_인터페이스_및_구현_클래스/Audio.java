package ch08._1_인터페이스_및_구현_클래스;

public class Audio implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("음향을 출력합니다.");
    }
}
