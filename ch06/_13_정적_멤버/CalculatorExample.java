package ch06._13_정적_멤버;

public class CalculatorExample {
    public static void main(String[] args){
        double result1 = 10 * 10 * Calculator.pi; //result1은 반지름이 10인 원의 넓이로 이 때 Calculator 클래스 내의 정적필드인 pi를 사용했다.
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);
        //마찬가지로 result2와 3도 Calculator 클래스의 정적 메소드인 plus와 minus를 사용한다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
