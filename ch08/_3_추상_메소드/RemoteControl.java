package ch08._3_추상_메소드;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume); //상수 필드와 추상 메소드를 작성해주었다.
}