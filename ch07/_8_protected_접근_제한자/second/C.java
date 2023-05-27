package ch07._8_protected_접근_제한자.second;

import ch07._8_protected_접근_제한자.first.A;

public class C{
    /*
    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }


    */
}

//C와 A는 서로 다른 패키지에 있으므로 protected 접근 제한자가 작동하여 A 클래스의 생성자, 메소드, 필드를 사용할 수 없다.
