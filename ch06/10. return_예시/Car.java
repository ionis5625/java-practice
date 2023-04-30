package ch06.return_예시;

public class Car {
    int gas; //gas라는 class 내에서 사용할 변수를 선언한다.

    void setGas(int gas){ //gas 변수에 값을 넣어줄 메소드
        this.gas = gas; //이 메소드의 gas를 Car 클래스 메소드에 대입한다.
    }

    boolean isGasLeft(){ //gas값이 0인지 0이 아닌지에 대해 판단하는 메소드
        if(gas == 0){
            System.out.println("연료가 부족합니다.");
            return false; //gas값이 0인경우 false값을 반환한다. return이 실행된 경우 메소드 내 밑의 코드는 실행되지 않는다.
        }

        System.out.println("연료가 남아있습니다.");
        return true;
    }

    void run(){
        while (true){
            if (gas > 0){ //gas가 남아있는 경우 while문은 계속 실행된다.
                System.out.println("주행중입니다. 남은 연료 : " + gas);
                gas--;
            }

            else{ //gas값이 0이 되는 경우 return문으로 인해 메소드가 종료된다.
                System.out.println("주행을 종료합니다. 남은 연료 : " + gas);
                return;
            }
        }
    }
}
