package ch08._4_디폴트_메소드;

import ch08._3_추상_메소드.Television;

public class RemoteControlExample {
    public static void main(String[] args){
        RemoteControl rc = new Audio();

        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);


    }
}
