package ch05._3_가비지콜렉팅;

public class GarbageCollecting {
    public static void main(String[] args){
        String hobby = "여행";
        hobby = "null"; //여행이라는 문자열 객체는 쓰레기가 되어 힙에 존재하게 되고 가비지 콜렉터에 의해 제거된다.

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;

        System.out.println("kind2 : " + kind2); //kind2가 kind1과 같은 값을 참조하고 kind1이 null이 되었지만
                                                //kind2라는 객체가 여전히 자동차라는 주소를 참조하고 있기 때문에
                                                //kind2는 정상적으로 출력된다.
    }
}
