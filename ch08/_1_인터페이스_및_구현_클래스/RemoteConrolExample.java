package ch08._1_인터페이스_및_구현_클래스;

public class RemoteConrolExample {
    public static void main(String[] args){
    RemoteControl rc;
    //인터페이스를 위한 객체를 사용하기 위해 우선 인터페이스 클래스를 참조하는 rc 변수를 만들어준다.
    rc = new Television();
    /*
    그리고 그 변수를 Television 클래스를 참조하는 객체라고 선언한다. 이제 rc를 통해 인터페이스의 추상 메소드를 호출할 수 있다.
    이 때 RemoteControl rc = new Television이라는 식으로 생성할 수도 있다.
    */

    rc.turnOn(); //원래 추상 메소드라 호출이 불가능했지만 rc가 Television의 객체가 되었으므로 전원을 켭니다 라는 결과가 출력된다.

    rc = new Audio();
    rc.turnOn();

    /*
    만약 rc에 다른 구현 클래스를 넣어주고 싶다면 new 뒤에 원하는 클래스명을 삽입하면 된다.(rc = new Audio()와 같은 식)
    이런 식으로 인터페이스를 활용하면 다형성을 구현하기 더 수월해진다.
    */

    }
}