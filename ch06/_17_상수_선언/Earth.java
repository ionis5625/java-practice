package ch06._17_상수_선언;

public class Earth {
    static final double EARTH_RADIUS = 6400; //절대로 변하지 않는 파이, e와 같은 상수는 static과 final을 동시에 사용한다.

    static final double EARTH_SURFACE_AREA; //마찬가지로 static과 final을 동시에 가지는 EARTH_SURFACE_AREA를 선언한다.
                                            //보통 상수의 경우 모두 대문자로 입력하며 단어가 다른 경우 언더바로 연결한다.

    static{
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    } //복잡한 초기값은 static 블록을 사용하여 입력해주었다. 여기서 Math.PI는 자바에서 기본으로 제공하는 수학 클래스인 Math 내의 PI를 가져온다.

}
