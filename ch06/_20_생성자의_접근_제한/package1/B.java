package ch06._20_생성자의_접근_제한.package1;

public class B {
    A a1 = new A(true);
    A a2 = new A(1);
    // A a3 = new A("String"); private 생성자이기 때문에 B 클래스에서는 접근이 불가능하다.
}
