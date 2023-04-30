package ch06.메소드_오버로딩;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();

        calc1.areaRectangle(3.14); //전달 값이 1개인 경우 정사각형의 넓이를 출력한다.
        calc1.areaRectangle(3.15, 5.18); //2개인 경우 직사각형의 넓이를 출력한다.
    }
}
