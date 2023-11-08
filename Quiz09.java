import java.util.Random;
import java.util.Scanner;

public class Quiz09{
    public static void main(String[] args) {

        Random randNum = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            char menu = 'y';

            do {
                int number = randNum.nextInt(10) + 1;
                boolean success = false;

                do {
                    System.out.print("Tebak Angka (1-10): ");
                    int answer = sc.nextInt();
                    sc.nextLine();
                    if (answer < number) {
                        System.out.println("Angka terlalu kecil");
                    } else if (answer > number) {
                        System.out.println("Angka terlalu besar");
                    }
                    success = (answer == number);

                } while (!success);
                System.out.println("Tebakan anda benar!");
                System.out.println("Apakah anda ingin mengulang permainan (Y/y)?");
                menu = sc.nextLine().charAt(0);
            } while (menu == 'y' || menu == 'Y');
        }

    }

}
