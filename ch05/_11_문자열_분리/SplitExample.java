package ch05._11_문자열_분리;

public class SplitExample {
    public static void main(String[] args){
        String mixed = "1,자바 학습,참조 타입 String 학습중,홍길동"; //아무렇게나 섞인 문자열을 따로 입력해주었다.

        String[] splited = mixed.split(","); //쉼표를 기준으로 원 문자열을 따로 나누어 splited라는 배열에 하나씩 저장한다.

        for(int i = 0 ; i < splited.length ; i++) //for문을 이용하여 splited 배열의 길이만큼 반복하여 나누어진 문자열을 출력한다.
            System.out.println(splited[i]);       //이 때 배열에 length를 해주면 가지고 있는 원소의 개수를 알 수 있다.

        System.out.println();

        System.out.println(splited[0]); 
        System.out.println(splited[1]);
        System.out.println(splited[2]);
        System.out.println(splited[3]); //for문을 사용하지 않고 하나씩 출력하는 경우
    }
}
