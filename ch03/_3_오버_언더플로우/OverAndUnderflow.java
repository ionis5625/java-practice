package ch03._3_오버_언더플로우;

public class OverAndUnderflow {
    public static void main(String[] args){
        byte var1 = 125;
        for(int i = 0 ; i < 5 ; i++){
            var1++;
            System.out.println("var1 = " + var1);
        } //byte형은 -128 ~ 127까지 저장가능하므로 127이 넘어가면 -128이 된다. 이를 오버플로우라고 한다.

        System.out.println("-------------------------------------------");

        byte var2 = -125;

        for(int i = 0 ; i < 5 ; i++){
            var2--;
            System.out.println("var2 = " + var2);
        } //마찬가지로 -128이 넘어가면 127이 되는데 이를 언더플로우라고 한다.
    }
}
