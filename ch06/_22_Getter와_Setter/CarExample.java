package ch06._22_Getter와_Setter;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setSpeed(-60); //현재 내 차의 속도를 음수로 설정했다. 이를 적당히 걸러주기위해 Car 클래스에서 설정한 Setter를 사용한다.
        System.out.println("내 차의 현재 속도 : " + myCar.getSpeed()); //setSpeed를 통해 음수가 들어가면 speed 필드의 값을 0으로 변경한다.
                                                                    //그리고 Getter를 통해 값을 불러오면 값이 0으로 설정된 것을 볼 수 있다.

        myCar.setSpeed(60);
        System.out.println("내 차의 현재 속도 : " + myCar.getSpeed()); //올바른 값을 넣으면 Getter를 통해 본 값은 60으로 정상적으로 출력된다.

        if(!myCar.isStop()){ //isStop은 stop 필드의 값을 반환한다. 여기서 stop의 초기값은 false였기 때문에 !를 붙이면 if(true)가 되어 밑의 메소드가 실행된다.
            myCar.setStop(true); //그리고 setter를 통해 Stop의 값을 true로 변경한다. 이를 통해 speed 필드의 값은 0이 된다.
        }

        System.out.println("내 차의 현재 속도 : " + myCar.getSpeed()); //출력 값이 0이 된걸 확인할 수 있다.
    }
}
