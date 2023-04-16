package ch05.참조변수_비교;

public class EqualsExample {
    public static void main(String[] args){
        String str1 = "홍길동";
        String str2 = "홍길동";

        if(str1 == str2)
            System.out.println("str1과 str2는 같은 주소를 참조하고 있다.");

        else
            System.out.println("str1과 str2는 같은 주소를 참조하고 있다.");

        //java에서는 기본적으로 문자열 리터럴이 같다면 동일한 주소를 저장하도록 되어있다.
        //str1과 str2가 같다는 처리를 해주지 않았음에도 같은 주소를 참조하는 것을 볼 수 있다.

        if(str1.equals(str2))
            System.out.println("str1과 str2는 같은 문자열을 가지고 있다.");

        else
            System.out.println("str1과 str2는 다른 문자열을 가지고 있다.");
        //이 때 주소가 아닌 문자열 변수 내의 문자열끼리 동일한지 알고 싶다면 원하는 문자열.equals(비교할 문자열) 메소드를 사용하면 된다.

        String str3 = new String("홍길동");
        String str4 = new String("홍길동");

        if(str3 == str4)
            System.out.println("str3과 str4는 같은 주소를 참조하고 있다.");

        else
            System.out.println("str3과 str4는 다른 주소를 참조하고 있다.");

        //이 경우는 위와 같아보이지만 다른 결과값을 나타내는데 new 연산자로 객체를 별도로 생성했기 때문에 그때그때 다른 주소를 참조하게 된다.
        //따라서 문자열이 같음에도 서로 다른 주소를 참조한다는 결과가 나오게 되는 것이다.

        if(str3.equals(str4))
            System.out.println("str3과 str4는 같은 문자열을 가지고 있다.");

        else
            System.out.println("str3과 str4는 다른 문자열을 가지고 있다.");

        //equals() 메소드는 내부 문자열만을 비교하는 것이기 때문에 위의 str1, str2와 같은 결과값을 출력한다.

    }
}
