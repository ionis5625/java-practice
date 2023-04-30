package ch02.서로_다른_진수_출력하기;

public class diffnumbers_to_int {
    public static void main(String[] args){
        int var1 = 0b1011; //이진법 표기법(숫자 앞에 0b 붙여줌)
        int var2 = 0206; //8진법 표기법(숫자 앞에 0 붙여줌)
        int var3 = 365; //정상적인 10진법 표기
        int var4 = 0xb3; //16진법 표기법(숫자 앞에 0x 붙여줌)

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
