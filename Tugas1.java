import java.util.Scanner;
public class Tugas1 {
    
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

  
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input19.nextInt();
        
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    
                    if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}

