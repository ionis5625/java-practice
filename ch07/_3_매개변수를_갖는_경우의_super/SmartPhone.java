package ch07._3_매개변수를_갖는_경우의_super;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color){
        super(model, color);
        /*
        부모 클래스가 기본 생성자 없이 model과 color라는 변수를 갖는 생성자만 가지고 있기 때문에
        이런 경우는 따로 super에 model과 color라는 매개값을 넣어주어야한다.
        */

        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자가 실행됨.");
    }

}
