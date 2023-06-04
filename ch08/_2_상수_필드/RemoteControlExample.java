package ch08._2_상수_필드;

public class RemoteControlExample {
    public static void main(String[] args){
        System.out.println("최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        System.out.println("최소 볼륨 : " + RemoteControl.MIN_VOLUME);
    }
}

/*
인터페이스 내의 필드는 구현과는 상관 없으므로 이렇게 객체를 생성하지 않고 바로 접근할 수 있다.
 */