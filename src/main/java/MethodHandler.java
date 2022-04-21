import java.util.ArrayList;
import java.util.List;

public class MethodHandler implements Hadnler {
    long resultFactorial = 1;
    List<Integer> fibon = new ArrayList<>();


    @Override
    public boolean chet(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public long factorial(int number) {
        for (int i = 1; i <= number; i++) {
            resultFactorial *= i;
        }
        return resultFactorial;
    }

    @Override
    public List<Integer> fibonacci(int number) {
        for (int i = 0; i <= number; i++) {
            if (i < 2) {
                fibon.add(i, i);
            } else {
                int nowNumber = fibon.get(i - 2) + fibon.get(i - 1);
                fibon.add(i, nowNumber);
            }
        }
        return fibon;
    }

}

