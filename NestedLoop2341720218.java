import java.util.Scanner;

public class NestedLoop2341720218 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Double temps[][] = new Double[5][7];
            for (int i = 0; i < temps.length; i++) {
                System.out.println("Kota ke-" + i);
                for (int j = 0; j < temps[0].length; j++) {
                    System.out.print("Hari ke-" + (j + 1) + ": ");
                    temps[i][j] = scanner.nextDouble();
                }
                System.out.println();
            }
            int cityNumber = 0;
        for (Double[] innerTemps : temps) {
            double counter = 0;
            int counter2 = 0;
            System.out.print("Kota ke-" + cityNumber++ + ": ");
            for (Double temp : innerTemps) {
                System.out.print(temp + ", ");
                counter += temp;
                counter2++;

            }
            cityNumber--;
            counter = counter / counter2;
            System.out.println("Rata-rata kota ke- "+cityNumber++ +" Adalah " + ((int)counter));
            System.out.println();
        }

        //     int cityNumber = 0;
        // for (Double[] innerTemps : temps) {
        //     System.out.print("Kota ke-" + cityNumber++ + ": ");
        //     for (Double temp : innerTemps) {
        //         System.out.print(temp + " ");
        //     }
        //     System.out.println();
        // }

            // for (int i = 0; i < temps.length; i++) {
            //     System.out.print("Kota ke-" + (i + 1) + ": ");
            //     for (int j = 0; j < temps[0].length; j++) {
            //         System.out.print(temps[i][j] + " ");
            //     }
            //     System.out.println();
            // }
        }

    }

}

while (menu != 'y' && menu != 'Y' && menu != 't' && menu != 'T') {
                System.out.println("Pilihan tidak valid. Silakan masukkan Y/y atau T/t.");
                System.out.print("Apakah Anda ingin mengulang permainan? (Y/y, T/t): ");
                menu = input.nextLine().charAt(0);
            }

        } while (menu == 'y' || menu == 'Y');
        
        if (menu == 't' || menu == 'T') {
            System.out.println("Terima kasih telah bermain!");
        }
