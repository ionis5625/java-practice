package ch08._3_추상_메소드;

public class RemoteControlExample {
    public static void main(String[] args){
        RemoteControl rc = new Television();

        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);

        //인터페이스 RemoteControl을 사용하여 Television 클래스의 메소드를 호출한다.
    }
}
