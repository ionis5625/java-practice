package ch06._13_정적_멤버;

public class Calculator {
    static double pi = 3.14159; //파이는 항상 같은 값을 가지기 때문에 객체마다 다를 이유가 없다. 이렇게 일정한 수치를 가진 것은 정적으로 선언하는게 좋다.

    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y){
        return x-y;
    }
    //마찬가지로 더하기와 빼기도 정적으로 선언해주었다.
}
