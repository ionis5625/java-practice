package ch07._3_매개변수를_갖는_경우의_super;

public class Phone {
    public String model;
    public String color;

    public Phone(String model, String color){ //Phone 클래스의 기본 생성자를 실행한다.
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자를 실행합니다.");
    }
}
