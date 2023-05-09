package ch06._19_접근_제한자.package2;

import ch06._19_접근_제한자.package1.*; //package1이 가지고 있는 모든 class를 import한다.

public class C {
    //A a; A 클래스의 접근제한자가 public이 아니기 때문에 외부에서 접근할 수 없다는 오류가 뜬다.
    B b; //B 클래스는 public이었기 때문에 정상적으로 접근이 가능하다.
}
