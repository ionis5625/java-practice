package ch03._2_형변환;

public class ArithmeticOperator {
    public static void main(String[] args){
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L; //long 형식임을 알 수 있게 L을 붙임

        int result1 = v1 + v2;
        System.out.println("result1 = " + result1); //같은 byte 자료형이 쓰였지만 결과가 int이기 때문에 v1과 v2도 int로 변환되어 계산된다.

        long result2 = v1 + v2 - v4;
        System.out.println("result2 = " + result2); //마찬가지로 v4가 long이기 때문에 나머지 자료형도 long으로 변환되어 계산된다.

        double result3 = (double) v1 / v2;
        System.out.println("result3 = " + result3); //double형으로 강제 변환하여 계산하게 된다.

        int result4 = v1 % v2;
        System.out.println("result4 = " + result4);
    }
}
