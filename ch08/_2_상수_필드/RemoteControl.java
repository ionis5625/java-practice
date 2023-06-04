package ch08._2_상수_필드;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}

/*
인터페이스 내부에서도 필드를 선언할 수 있는데 이 때 내부의 필드는 무조건 public static final 특성을 갖는다.
이는 컴파일 상에서 자동으로 붙게 된다.
 */
