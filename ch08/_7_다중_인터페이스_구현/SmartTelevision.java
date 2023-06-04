package ch08._7_다중_인터페이스_구현;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
