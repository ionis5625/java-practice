package ch08._7_다중_인터페이스_구현;

public class MultiInterfaceExample {
    public static void main(String[] args){
        RemoteControl rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();

        //SmartTelevision 인터페이스에 관련된 변수이므로 Searchable의 메소드는 사용할 수 없다.

        Searchable search = new SmartTelevision();

        search.search("www.youtube.com");

        //마찬가지로 Searchable 인터페이스의 변수이므로 RemoteControl의 메소드는 사용할 수 없다.
    }
}
