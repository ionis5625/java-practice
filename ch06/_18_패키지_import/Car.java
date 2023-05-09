package ch06._18_패키지_import;


import ch06._18_패키지_import.hankook.SnowTire;
import ch06._18_패키지_import.kumho.AllSeasonTire;

//다른 패키지의 클래스를 사용하기 위해서 import를 사용하였다.
public class Car {
    ch06._18_패키지_import.hankook.Tire tire1 = new ch06._18_패키지_import.hankook.Tire();
    ch06._18_패키지_import.kumho.Tire tire2 = new ch06._18_패키지_import.kumho.Tire();

    //hankook과 kumho 패키지의 클래스를 사용하여 tire1과 tire2라는 객체를 생성한다.
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();

    //SnowTire와 AllseasonTire는 이미 import를 해주었기 때문에 클래스를 통해 객체를 바로 생성할 수 있었다.

}
