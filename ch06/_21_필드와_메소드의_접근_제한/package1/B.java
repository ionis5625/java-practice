package ch06._21_필드와_메소드의_접근_제한.package1;

public class B {
    public void method() {
        A a = new A();

        a.field1 = 1;
        a.field2 = 1;
        // a.field3 = 1; field3는 private 접근 제한자를 가지므로 A 클래스가 아닌 B 클래스에선 접근이 불가능하다.

        a.method1();
        a.method2();
        // a.method3(); 마찬가지로 private 접근 제한자를 가지므로 B 클래스에선 접근이 불가능하다.
    }
}
