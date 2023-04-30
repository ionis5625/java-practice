package ch06._9_가변길이_매개변수;

public class ComputerExample {
    public static void main(String[] args){
        Computer com1 = new Computer(); //Computer 클래스를 참조하는 com1 객체를 생성한다.

        int result1 = com1.sum(1, 2, 3); //com1의 sum 메소드에 1, 2, 3를 제공한다.
        System.out.println("총합 : " + result1);
        System.out.println();

        int result2 = com1.sum(1, 2, 3, 4, 5);
        System.out.println("총합 : " + result2);
        System.out.println();

        int[] values = {1, 2, 3, 4, 5};
        int result3 = com1.sum(values); //values라는 int형 배열을 선언하고 그 배열을 sum 메소드에 넣어준다.
        System.out.println("총합 : " + result3);
        System.out.println();

        int result4 = com1.sum(new int[] {1, 2, 3, 4, 5}); //여기선 새로운 배열을 아예 메소드의 매개값으로 선언해주었다.
        System.out.println("총합 : " + result4);
    }
}
