package ch06._23_싱글톤_패턴;

public class SingletonExample {
    public static void main(String[] args){
        /*
        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton(); Singleton()은 private 접근 권한을 가지기 때문에 이 방식으로 객체를 생성할 수 없다.
         */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        //따라서 객체를 생성하기 위해 아까 선언해두었던 getInstance라는 메소드를 사용한다. 이 메소드의 return값은 singleton이고
        //접근 제한자가 public이기때문에 Singleton 클래스의 객체를 생성할 수 있다.

        if(obj1 == obj2){
            System.out.println("같은 Singleton 객체입니다.");
        }
        else
            System.out.println("다른 Singleton 객체입니다.");
        //그리고 obj1과 obj2는 같은 메소드를 사용해서 같은 return값을 받았으므로 같은 객체라고 할 수 있다.
    }
}
