package ch03.증감연산자;

public class IncreaseDecreaseOperator {
    public static void main(String[] args){
        int x = 10;
        int y = 10;
        int z;

        z = x++;
        System.out.println("z = " + z); //x가 먼저 대입된 후 증가 연산자를 취했으므로 z = 10, x = 11이 된다.
        System.out.println("x = " + x);
        System.out.println();

        z = ++x;
        System.out.println("z = " + z); //이땐 증가 연산자가 먼저 수행되므로 z = 12, x = 12가 된다.
        System.out.println("x = " + x);
        System.out.println();

        z = ++x + y++; //x = 12, y = 10, z = 12인 상황
        System.out.println("z = " + z); //x엔 먼저 ++가 들어가므로 13, y는 나중에 ++되므로 더할땐 10이 된다. 따라서 z = 23
        System.out.println("x = " + x);
        System.out.println("y = " + y); //x와 y는 똑같이 증가연산자가 붙었으므로 x = 13, y = 11이 된다.

    }
}
