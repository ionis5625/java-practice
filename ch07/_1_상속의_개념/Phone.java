package ch07._1_상속의_개념;

public class Phone {

    public String model;
    public String color; //public 접근 제한자를 가지는 String 필드를 2개 선언한다.

    public void bell(){ //반환값이 없는 void 형태의 bell이라는 메소드를 선언한다.
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message){
        System.out.println("나 : " + message);
    }

    public void receiveVoice(String message){
        System.out.println("상대방 : " + message);
    }

    public void hangUp(){
        System.out.println("전화를 종료합니다.");
    } //마찬가지로 총 4개의 메소드를 선언해주었다.
}
