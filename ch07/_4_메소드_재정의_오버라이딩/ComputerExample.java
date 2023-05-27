package ch07._4_메소드_재정의_오버라이딩;

public class ComputerExample {
    public static void main(String[] args){
        int r = 10;

        Calculator calc = new Calculator();

        System.out.println("반지름이 10인 원의 넓이(Calculator 클래스) = " + calc.areaCircle(r));

        Computer comp = new Computer();

        System.out.println("반지름이 10인 원의 넓이(Computer 클래스) = " + comp.areaCircle(r));
    }   //Computer의 원 넓이 구하는 메소드가 더 정확한 결과를 출력하였다.
}
