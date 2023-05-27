package ch07._16_봉인된_클래스;

public sealed class Person permits Employee, Manager { //sealed를 사용하여 Employee와 Manager 클래스에만 상속이 가능해졌다.
    public String name;

    public void work(){
        System.out.print("업무가 결정되지 않았습니다.");
    }
}
