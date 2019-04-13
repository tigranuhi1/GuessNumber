import java.util.Random;

public class Checker {
    private static int num;

    Checker(){
        Random rand = new Random();
        num = rand.nextInt(10);
    }

    static CheckValues check(int number){
        if(num==number)
            return CheckValues.EQUAL;
        else if(num < number)
            return CheckValues.LESS;
        else
            return CheckValues.MORE;
    }
}
