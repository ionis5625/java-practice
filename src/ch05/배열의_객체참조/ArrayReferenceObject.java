package ch05.배열의_객체참조;

public class ArrayReferenceObject {
    public static void main(String[] args){
        String[] strArray = new String[3]; //공간 3개를 가지는 변수 strArray 생성

        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String ("Java");

        System.out.println(strArray[0] == strArray[1]); //참조변수에서  해보았듯 처음 선언할 때 문자열 리터럴이 같다면 같은 주소를 참조하는 것을 알 수 있다.
        System.out.println(strArray[0] == strArray[2]); //하지만 strArray[2]는 new를 통해 생성하였으므로 다른 주소를 참조하게 된다.
        System.out.println(strArray[0].equals(strArray[2])); //equals는 문자열 자체를 비교하므로 true가 된다.
    }
}
