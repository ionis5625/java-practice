package ch06.메소드_오버로딩;

public class Calculator {
    double areaRectangle(double x){
        double result = x * x;
        System.out.println("이 사각형의 넓이 : " + result);
        return result;
    }

    double areaRectangle(double x, double y){
        double result = x * y;
        System.out.println("이 사각형의 넓이 : " + result);
        return result;
    } //생성자 오버로딩과 마찬가지로 각 입력값의 차이에 따라 실행되는 메소드가 다르게 설정할 수 있다.
}
