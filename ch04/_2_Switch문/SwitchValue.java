package ch04._2_Switch문;

public class SwitchValue {
    public static void main(String[] args){
        String grade = "B";

        int score1 = 0; //java 11 이전의 문법
        switch(grade){
            case "A":
                score1 = 100;
                break;

            case "B":
                int result = 100 - 20;
                score1 = result;
                break;

            default:
                score1 = 60;
        }

        System.out.println("score1 = " + score1);

        int score2 = switch(grade){ //java 12 이후의 문법
            case "A" -> 100;
            case "B" -> {
                int result = 100-20;
                yield result;
            }
            default -> 60;
        };

        System.out.println("score2 = " + score2);
    }
}
