import java.util.Random;

public class RandomNumbersGenerator {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int randomNumber = random.nextInt(31) + 15;
            System.out.print(randomNumber);
            if (i < 29) {
                System.out.print("%");
            }
        }

    }
}
