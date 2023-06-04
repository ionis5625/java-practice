package ch08._5_정적_메소드;

public class RemoteControlExample {
    public static void main(String[] args){
        RemoteControl.changeBattery(); //따로 구현 객체 없이 인터페이스명으로 접근하여 메소드를 호출할 수 있다.
    }
}
