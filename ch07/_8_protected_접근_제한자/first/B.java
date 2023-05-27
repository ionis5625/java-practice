package ch07._8_protected_접근_제한자.first;

public class B{
    public void method(){
        A a = new A();
        a.field = "value";
        a.method();
    }

    //B는 A와 같은 패키지에 있기 때문에 굳이 상속을 시켜주지 않더라도 protected 처리된 필드, 메소드, 생성자에 접근할 수 있다.
}
