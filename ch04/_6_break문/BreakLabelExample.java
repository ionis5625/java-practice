package ch04._6_break문;

public class BreakLabelExample {
    public static void main(String[] args){
        Outter: for(char upper = 'A' ; upper <= 'Z' ; upper++){
            for(char lower = 'a' ; lower <= 'z' ; lower++){
                System.out.println(upper + " : " + lower);
                if(lower == 'g') {
                    break Outter; //break만 쓰는 경우 자신이 속한 for문만 탈출하지만
                                  //라벨 Outter를 붙여주면 break Outter를 써서 원하는 곳으로 탈출할 수 있다.
                }
            }
        }
        System.out.println("실행 종료");
    }
}
