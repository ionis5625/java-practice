package ch06._20_생성자의_접근_제한.package2;

import ch06._20_생성자의_접근_제한.package1.*;

public class C {
        A a1 = new A(true); //public 생성자이기 때문에 다른 패키지에서도 정상적으로 접근이 가능하다.
        //A a2 = new A(1); default 생성자이기 때문에 다른 패키지인 package2에서는 접근이 불가능하다.
        //A a3 = new A("String"); private 생성자이기 때문에 B 클래스에서는 접근이 불가능하다.
    }
