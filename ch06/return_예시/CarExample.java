package ch06.return_예시;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setGas(5); //gas값을 5로 설정한다.

        myCar.isGasLeft(); //현재 gas값이 얼마 있는지 판단한다.

        myCar.run(); //gas값이 0이 될때까지 주행한다.
    }
}
