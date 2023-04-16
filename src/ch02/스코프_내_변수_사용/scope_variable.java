package ch02.스코프_내_변수_사용;

public class scope_variable {
    public static void main(String[] args){
        int v1 = 15;
        if(v1 > 10){
            int v2 = v1 - 10;
        }
        int v3 = v1 + /* v2 */ + 5; //v2는 if 스코프 내에서 선언되었기 때문에 오직 if문 안에서만 쓸 수 있다.
                              //따라서 이 코드는 컴파일 오류로 인해 실행되지 않을 것이다.
    }
}
