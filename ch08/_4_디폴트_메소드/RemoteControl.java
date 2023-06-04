package ch08._4_디폴트_메소드;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 모드입니다.");
            setVolume(MIN_VOLUME);
        }

        else{
            System.out.println("무음 모드를 해제합니다.");
        }
    }
    /*
    인터페이스 내에서도 완전히 구현부를 가진 메소드를 선언할 수 있는데 이를 디폴트 메소드라고 한다.
    디폴트 메소드를 선언하기 위해서는 메소드 앞에 default 제한자를 붙여주면 된다.
    디폴트 메소드도 구현 객체가 필요하기 때문에 다른 클래스에서 그냥 호출할 수는 없고 구현 객체를 인터페이스 변수에 대입한 뒤 사용할 수 있다.
     */
}
