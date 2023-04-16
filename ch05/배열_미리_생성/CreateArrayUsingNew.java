package ch05.배열_미리_생성;

public class CreateArrayUsingNew {
    public static void main(String[] args){
        int[] arr1 = new int[3]; //자료형이 int이며 3개의 변수를 저장할 수 있는 배열 arr1을 선언한다

        for(int i = 0 ; i < 3 ; i++){
            System.out.println("arr1[" + i + "] = " + arr1[i]); //새로운 배열을 선언했을 때의 초기값을 알아보기 위한 for문
        }
        System.out.println();

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for(int i = 0 ; i < 3 ; i++){
            System.out.println("arr1[" + i + "] = " + arr1[i]); //각 항목의 변경된 값을 출력
        }
        System.out.println();

        double[] arr2 = new double[3];

        for(int i = 0 ; i < 3 ; i++){
            System.out.println("arr2[" + i + "] = " + arr2[i]); //새로운 배열을 선언했을 때의 초기값을 알아보기 위한 for문
        }
        System.out.println();

        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;

        for(int i = 0 ; i < 3 ; i++){
            System.out.println("arr2[" + i + "] = " + arr2[i]); //각 항목의 변경된 값을 출력
        }
        System.out.println();

        String[] arr3 = new String[3];

        for(int i = 0 ; i < 3 ; i++){
            System.out.println("arr3[" + i + "] = " + arr3[i]); //새로운 배열을 선언했을 때의 초기값을 알아보기 위한 for문
        }
        System.out.println();

        arr3[0] = "봄";
        arr3[1] = "여름";
        arr3[2] = "가을";

        for(int i = 0 ; i < 3 ; i++){
            System.out.println("arr3[" + i + "] = " + arr3[i]); //각 항목의 변경된 값을 출력
        }
        System.out.println();







    }
}
