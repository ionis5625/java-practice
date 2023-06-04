package ch08._3_추상_메소드;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 켭니다.");
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
    }
    /*
    만약 Volume이 MAX_VOLUME보다 크다면 volume을 최대치로 설정하고
    Volume이 MIN_VOLUME보다 작다면 volume을 최소치로 설정한다.
    둘 다 해당되지 않는다면 이 클래스 내의 값으로 volume을 설정한다.
     */
}
