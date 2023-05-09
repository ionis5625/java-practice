package ch06._23_싱글톤_패턴;

public class Singleton {
    private static Singleton singleton = new Singleton();
    //private 접근 권한을 가지는 정적 필드인 singleton을 선언하고 초기화한다.
    private Singleton(){
    }

    //마찬가지로 private 접근 권한을 가지는 생성자를 선언한다.

    public static Singleton getInstance(){
        return singleton;
    }
    //그리고 어디서든 접근할 수 있는 public 권한을 가지는 정적 메소드를 선언한다.
}
