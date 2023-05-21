package ch07._2_부모_생성자_호출;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color){
        super();
        /*
        super는 컴파일 과정에서 자동으로 추가되는 구문으로 생략이 가능하다. 객체는 생성자를 가지고 있어야 생성이 가능하므로
        부모 클래스의 기본 생성자를 호출하는 역할을 한다. 만약 부모 클래스에 기본 생성자가 없다면 컴파일 오류가 발생한다.
        이 때 super는 기본 생성자에 한해서 자동으로 추가되므로 만약 기본 생성자가 없고 매개변수를 갖는 생성자만 존재한다면
        super(매개값)과 같은 식으로 선언해야한다.
        */

        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자가 실행됨.");
    }

}
