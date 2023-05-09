package ch06._21_필드와_메소드의_접근_제한.package2;

import ch06._21_필드와_메소드의_접근_제한.package1.*;

public class C {
    public void method() {
        A a = new A();

        a.field1 = 1;
        // a.field2 = 1; field2는 default 접근 제한자를 가지므로 package1이 아닌 패키지에서 접근이 불가능하다.
        // a.field3 = 1; field3는 private 접근 제한자를 가지므로 A 클래스가 아닌 B 클래스에선 접근이 불가능하다.

        a.method1(); //field1과 method1은 public 접근 제한자이므로 다른 패키지에서도 import를 통해 접근이 가능하다.
        // a.method2(); method2도 마찬가지로 default 접근 제한자를 가지므로 package2에서 접근이 불가능하다.
        // a.method3(); 마찬가지로 private 접근 제한자를 가지므로 B 클래스에선 접근이 불가능하다.
    }
}
