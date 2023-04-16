package ch05.참조_타입_변수의_비교;

public class ReferenceVariableCompare {
    public static void main(String[] args){
        int [] arr1;
        int [] arr2;
        int [] arr3; //공백 배열 3개 입력

        arr1 = new int[] {1, 2, 3};
        arr2 = new int[] {1, 2, 3}; //arr1과 2에 1, 2, 3이라는 원소를 가지는 정수형 배열을 대입해준다.
        arr3 = arr2; //arr3은 arr2와 동일한 주소를 참조하도록 설정

        System.out.println(arr1 == arr2); //이 결과는 배열이 같느냐를 찾는게 아니라 같은 주소를 참조하고 있는지에 대한 결과를 나타내므로 false이다
        System.out.println(arr2 == arr3); //arr3 = arr2로 두 배열은 완전히 같은 주소를 참조하고 있기 때문에 결과는 true이다
                                          //안에 있는 문자열 등이 같은지를 살펴보기 위해서는 원하는 배열.equals(원하는 배열)메소드를 사용한다.
    }
}
