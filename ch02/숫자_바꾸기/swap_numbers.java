package ch02.숫자_바꾸기;

public class swap_numbers {
    public static void main(String[] args){
        int x = 3;
        int y = 5;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x + " y = " + y);


    }
}
