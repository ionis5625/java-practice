package ch08._1_인터페이스_및_구현_클래스;

public class Television implements RemoteControl{ //인터페이스를 구현한 클래스를 만들기 위해 implements라는 키워드를 붙여준다.
    public void turnOn(){ //그리고 클래스에서 추상 메소드로 선언되었던 turnOn을 Televion 클래스 내에서 구체적으로 구현해준다.
        System.out.println("전원을 켭니다.");
    }
}
