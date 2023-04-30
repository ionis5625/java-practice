package ch05._19_배열_복사;

public class ArrayCopy {
    public static void main(String[] args){
        String[] oldStrArray = {"java", "array", "copy"};

        String[] newArray = new String[5];

        System.arraycopy(oldStrArray, 0, newArray, 0, oldStrArray.length);
        //for문을 사용하지 않고 java 자체적으로 제공하는 메소드인 System.arraycopy를 사용하면 쉽게 배열을 복사할 수 있다.
        //System.arraycopy(복사하고 싶은 배열, 복사하고 싶은 배열의 시작인덱스, 새로 넣을 배열, 새로 넣을 배열에서 시작할 인덱스, 복사 항목 수)
        //위와 같이 사용된다.

        System.out.print("newArray의 항목들 : ");

        for(int i = 0 ; i < newArray.length ; i++) {
            System.out.println(newArray[i] + ","); //복사한 항목은 3개였으므로 나머지 2개 항목은 null이 된다.
        }
    }
}
