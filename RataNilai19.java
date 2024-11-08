import java.util.Scanner;

public class RataNilai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, rataNilai;
        i = 1;

        while (i <= 5) {
            j = 1;
            totalNilai = 0;
            System.out.println("Masukkan Nilai Siswa Ke-" + i);
            while (j <= 5) {
                System.out.print("Masukkan Nilai = ");
                totalNilai += sc.nextInt();
                j++;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Total nilai dari siswa ke " + i + " \t: " + totalNilai);
            System.out.println("Rata Rata Nilai \t\t: " + rataNilai + "\n");
            i++;
        }
        
    }
}
