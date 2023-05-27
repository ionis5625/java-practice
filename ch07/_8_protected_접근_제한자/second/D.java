package ch07._8_protected_접근_제한자.second;

import ch07._8_protected_접근_제한자.first.A;

public class D extends A { //protected 접근 제한자를 가지는 클래스에 접근하기 위해 우선 해당 클래스로부터 상속을 받아준다.

    public D(){ //기본 생성자 생성 후
    }
    public void method1(){
        this.field = "value";
        this.method();
    }

    // 상속을 통해 a의 필드값과 메소드를 변경 할 수 있다.

    /*
    public void method2(){
        A a = new A();
        a.field = 'string';
        a.method();
    }

     */

    //단, 여기서 직접 객체를 생성하여 사용하는 것은 불가능하다.
}
