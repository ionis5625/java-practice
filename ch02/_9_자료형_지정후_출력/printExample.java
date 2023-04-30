package ch02._9_자료형_지정후_출력;

public class printExample {
    public static void main(String[] args){
        int value = 123;
        System.out.printf("%d\n", value);
        System.out.printf("%6d\n", value);
        System.out.printf("%-6d\n", value);
        System.out.printf("%06d\n", value); //printf의 경우 c언어와 역할이 동일하다.
                                            //6은 6자리로 출력하라는 의미이며 이 때 -6은 공백을 오른쪽에서 채운다는 의미
                                            //06은 공백을 0으로 채우라는 의미이며 그냥 6인 경우 왼쪽에서부터 공백을 채워 6자리르 만든다.

        double area = 3.14 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 = %10.2f\n", 10, area); //앞 %d엔 10이 들어가고 뒤의 %10.2f는 10자리로 출력하며 소수점은 2자리까지
                                                                        //남은 자리수는 공백으로 채운다.


    }
}
