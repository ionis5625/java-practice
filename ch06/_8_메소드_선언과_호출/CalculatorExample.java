package ch06._8_메소드_선언과_호출;

public class CalculatorExample {
    public static void main(String[] args){
        Calculator newCalc = new Calculator();

        newCalc.powerOn(); //전원을 켭니다 라는 메세지를 출력하는 메소드를 호출한다.

        int result1 = newCalc.plus(5, 6); //두 값을 더해주는 plus 메소드를 호출하며 여기선 값을 직접 제공해주었다.
        System.out.println("result1 = " + result1);

        int x = 11;
        int y = 8;

        double result2 = newCalc.devide(x, y); //두 값을 나누는 devide 메소드를 호출하며 x, y값을 먼저 지정하고 그 변수를 메소드에 제공한다.
        System.out.println("result2 = " + result2);

        newCalc.powerOff(); //전원을 끈다는 메세지를 출력하는 메소드를 호출한다.
    }
}
