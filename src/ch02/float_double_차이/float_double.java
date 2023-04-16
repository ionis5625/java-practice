package ch02.float_double_차이;

public class float_double {
    public static void main(String[] args){
        float var1 = 0.1234567890123456789f; //float형은 숫자 뒤에 f를 붙여주어야 한다.
        double var2 = 0.1234567890123456789; //double은 따로 처리가 필요 없음
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        double var3 = 3e6;
        float var4 = 3e6f;
        double var5 = 2e-3; // 2 * 10^(-3)

        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);

    }
}
