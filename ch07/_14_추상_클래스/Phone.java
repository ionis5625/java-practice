package ch07._14_추상_클래스;

public abstract class Phone {
    /*
    abstract 키워드를 활용하여 추상 클래스를 만들어주었다.
    따라서 Phone 클래스를 참조하는 직접적인 개체 생성은 불가능하고 단순히 상속을 통한 자식 클래스만 생성 가능하다.
    */
    String owner;

    Phone(String owner){
        this.owner = owner;
    }

    void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
