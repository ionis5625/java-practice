package ch06._8_메소드_선언과_호출;

public class Calculator { //메소드도 객체와 동일하게 생성하게 된다. 단 반환값이 있으면 자료형, 없으면 void로 선언한다.
    void powerOn(){
        System.out.println("전원을 켭니다."); //단순 메세지 출력이기 때문에 반환값이 없으므로 void형으로 선언한다.
    }

    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y){
        int result = x+y;
        return result; //result라는 값을 반환하므로 int 자료형으로 선언한다.
    }

    double devide(int x, int y){
        double result = (double)x / (double)y;
        return result; //나눗셈은 소수점까지 표현해야하므로 double형으로 선언한다.
    }
}
