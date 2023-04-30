package ch02._8_문자열_추가출력;

public class string_concat {
    public static void main(String[] args){
        int result1 = 10+20;
        System.out.println("result1 = " + result1); //이때 +는 숫자 연산이 아닌 문자열을 추가로 출력한다는 의미를 가진다.
                                                 //결과 : result1 = 30

        String result2 = 10 + 2 + "8";
        System.out.println("result2 = " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3 = " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4 = " + result4); //위 3개의 자료형은 string으로 우선 더할 수 있는 정수, 실수 자료형을 가진
                                                    //숫자부터 더하게 된다.
                                                    //result2는 10+2가 먼저 더해져서 12 + "8"이 되고
                                                    //result3는 중간에 문자열이 있으므로 지금 더하진 않는다
                                                    //result4도 숫자가 먼저 오지 않았으므로 먼저 더해지지 않는다.
                                                    //그리고 다음으론 문자열끼리 붙이는 과정을 수행한다.
                                                    //따라서 위 수식의 결과물은 각각 128, 1028, 1028이 될 것이다.
                                                    //만약 숫자계산을 먼저 하고 싶으면 숫자에 괄호를 씌워준다.
    }
}
