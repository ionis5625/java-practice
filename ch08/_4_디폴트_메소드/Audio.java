package ch08._4_디폴트_메소드;
public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME){
            volume = MAX_VOLUME;
        }

        else if(volume < MIN_VOLUME){
            volume = MIN_VOLUME;
        }

        else
        this.volume = volume;

        System.out.println("현재 볼륨은 " + volume + "입니다.");
    }

    private int memoryVolume; //원래 설정되어있던 볼륨을 넣어놓기 위한 변수를 선언한다.

    public void setMute(boolean mute){ //디폴트 메소드라도 오버라이딩이 가능하다.
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 모드를 설정합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }

        /*
        만약 무음모드가 설정되었다면 해당 메세지를 출력하고 setVolume 메소드를 통해 RemoteControl에 MIN_VOLUME값을 전해준다.
        */


        else{
            System.out.println("무음 모드를 해제합니다.");
            setVolume(this.memoryVolume);
        }

        /*
        아닌 경우 setVolume 메소드를 사용하여 memoryVolume값을 RemoteControl에 전달한다.
         */

    }
}
