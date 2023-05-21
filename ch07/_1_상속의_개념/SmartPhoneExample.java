package ch07._1_상속의_개념;

public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색"); //SmartPhone 클래스를 참조하는 객체를 생성한다.

        System.out.println(myPhone.model);
        System.out.println(myPhone.color); //Phone으로부터 상속받은 SmartPhone의 필드를 읽는다.

        System.out.println("현재 와이파이 상태 : " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요");
        myPhone.hangUp();

        /*
        myPhone은 SmartPhone 클래스를 참조하는 객체임에도 불구하고 Phone에 해당되는 메소드를 호출할 수 있었는데
        SmartPhone 클래스가 Phone으로부터 메소드와 필드를 상속받았기 때문이다.
        따라서 SmartPhone 클래스를 참조하는 myPhone에서도 Phone 클래스의 필드나 메소드를 사용할 수 있다.
        */
        myPhone.setWifi(true); //와이파이 상태를 변경하고
        myPhone.internet(); //인터넷 연결상태를 출력한다.
    }
}
