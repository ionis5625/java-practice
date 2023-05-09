package ch06._21_필드와_메소드의_접근_제한.package1;

public class A {
    public int field1;
    int field2;
    private int field3;

    public A(){
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();
    }

    public void method1(){
    }

    void method2(){
    }

    private void method3(){
    } //각 필드와 메소드에 public, default, private 접근제한자를 붙여주었다.
}
