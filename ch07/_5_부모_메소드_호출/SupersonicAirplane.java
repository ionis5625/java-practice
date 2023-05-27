package ch07._5_부모_메소드_호출;

public class SupersonicAirplane extends Airplane{
    public static final int normal = 1;
    public static final int supersonic = 2;

    public int flyMode = normal;

    public void fly(){
        if(flyMode == supersonic){
            System.out.println("초음속 비행중입니다.");
        }
        else{
            super.fly();
            /*
            자식 클래스에서 메소드 오버라이딩을 실행하는 경우 원래 부모의 메소드는 사용할 수 없게된다.
            하지만 'super.원하는 메소드'를 입력하면 사용할 수 없는 부모의 메소드를 호출하여 사용할 수 있게 된다.
            이 경우는 비행 모드가 supersonic인 경우 자식 메소드를, normal인 경우 부모의 메소드를 호출한다.
             */
        }
    }
}
