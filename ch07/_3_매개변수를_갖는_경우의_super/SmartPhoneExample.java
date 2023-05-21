package ch07._3_매개변수를_갖는_경우의_super;

public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
    }
}
