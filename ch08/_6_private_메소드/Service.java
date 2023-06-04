package ch08._6_private_메소드;

public interface Service {
    default void defaultMethod1(){
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2(){
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("defaultMethod 종속 코드 A");
        System.out.println("defaultMethod 종속 코드 B");
    }

    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("staticMethod 종속 코드 A");
        System.out.println("staticMethod 종속 코드 B");
    }

    /*
    각각 default 메소드와 static 메소드를 선언해주었고 거기 안에 private 메소드를 넣어주었다.
     */
}
