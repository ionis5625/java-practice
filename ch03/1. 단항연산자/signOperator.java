package ch03.단항연산자;

public class signOperator {
    public static void main(String[] args){
        int x = -100;
        x = -x; //단항연산자 -는 대입된 변수의 부호를 반전시킨다.
        System.out.println("x = " + x);

        int y = 100;
        y = -y;
        System.out.println("y = " + y);
    }
}
