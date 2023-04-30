package ch02.스트링_형변환;

public class string_to_otherType {
    public static void main(String[] args){
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14159");
        boolean value3 = Boolean.parseBoolean("true"); //어떤 자료형을 다른 자료형으로 변환시키려면
                                                          //(원하는자료형).parse(원하는자료형)을 취해준다.

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        String str1 = String.valueOf("10");
        String str2 = String.valueOf("3.14159"); //어떤 자료형을 문자열로 변환하기 위해서는 String.valueof을 사용한다.
        String str3 = String.valueOf("true");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
