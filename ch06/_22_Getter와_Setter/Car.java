package ch06._22_Getter와_Setter;

public class Car {
    private int speed;
    private boolean stop; //각각 speed와 stop이란 필드를 private 접근제한자를 붙여 생성하였다.

    public int getSpeed(){
        return speed; //필드 데이터를 외부에서 읽기 위해 speed 필드의 Getter인 getSpeed 메소드를 생성한다.
    }

    public void setSpeed(int speed){ //들어오게 되는 데이터를 미리 검증해서 올바른 값만 넣어주기 위해 speed의 Setter인 setSpeed 메소드를 생성한다.
        if (speed < 0){ //만약 속도가 음수라면
            this.speed = 0; //speed의 값을 0으로 설정하고 return한다.
            return;
        }
        else this.speed = speed; //음수가 아니라면 그 값을 그대로 speed 필드에 저장한다.
    }

    public boolean isStop(){ //boolean 자료형의 경우 get 대신 is를 사용한다. Setter는 그대로 set을 사용한다.
        return stop; //여기서는 stop의 Getter를 생성하려고 하므로 isStop이라는 메소드를 만들어주었다.
    }

    public void setStop(boolean stop){ //stop의 Setter인 setStop 메소드를 설정한다.
        this.stop = stop;
        if(stop == true) this.speed = 0; //만약 stop 필드의 변수가 true라면 멈춰있는 것이므로 speed 필드의 값을 0으로 변경한다.
    }
}


