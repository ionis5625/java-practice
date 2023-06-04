package ch08._5_정적_메소드;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){

    }

    static void changeBattery(){
        System.out.println("배터리를 교환합니다.");
    }
    /*
    인터페이스 내에서 정적 메소드를 사용할 수 있으며 정적 메소드는 구현 객체 없이 인터페이스명으로 접근하여 호출할 수 있다.
    */
}
