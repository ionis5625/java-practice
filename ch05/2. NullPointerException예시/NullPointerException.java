package ch05.NullPointerException예시;

public class NullPointerException {
    public static void main(String[] args){
        int[] intArray = null; /*intArray라는 배열은 현재 아무런 값도 가지지 않는다(null)
        intArray[0] = 10;      그 상태에서 값을 넣으려고 시도하는 경우 NullPointerException이 발생한다.
                               intArray가 아무런 값도 참조하고 있지 않기 때문이다. */

        String arr = null;
        //System.out.println("arr의 총 문자 수 : " + arr.length());
        //마찬가지로 arr도 null이기 때문에 문자열의 길이를 구하려 하면 같은 오류가 뜬다.
    }
}
