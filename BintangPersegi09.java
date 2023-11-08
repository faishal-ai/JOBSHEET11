import java.util.Scanner;

//bintang persegi
public class BintangPersegi09{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Masukan Nilai N:");
			int N = sc.nextInt();
			for (int iOuter = 1; iOuter <= N; iOuter++) {
			    for (int i = 0; i < N; i++) {
			        System.out.print("*");
			    }
			    System.out.println();
			}
		}

    }
}

	
