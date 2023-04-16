package ch04.If문;

public class IfExample {
    public static void main(String[] args){
        int num = (int)((Math.random()*6) + 1); //Math.random()은 0.0에서 1.0까지의 double형 난수를 생성하는 함수이다.
                                              //필요한 것은 1~6까지의 정수이므로 int형으로 형변환 해준 뒤 +1을 더해 1~6의 난수를 얻을 수 있다.

        if(num == 1)
            System.out.println("1번이 나왔습니다.");

        else if(num == 2)
            System.out.println("2번이 나왔습니다.");

        else if(num == 3)
            System.out.println("3번이 나왔습니다.");

        else if(num == 4)
            System.out.println("4번이 나왔습니다.");

        else if(num == 5)
            System.out.println("5번이 나왔습니다.");

        else if(num == 6)
            System.out.println("6번이 나왔습니다.");

    }
}
