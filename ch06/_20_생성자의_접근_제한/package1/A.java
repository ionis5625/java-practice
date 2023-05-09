package ch06._20_생성자의_접근_제한.package1;

public class A {
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("String");

    public A(boolean b){
    } //public 접근 제한자를 사용한 생성자

    A(int b){
    } //default 접근 제한자를 사용한 생성자

    private A(String b){
    } //private 접근 제한자를 사용한 생성자
}
