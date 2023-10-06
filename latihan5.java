import java.util.Scanner;

class latihan5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("GAJI PEGAWAI BERDASARKAN PENGALAMAN");

        System.out.println("NAMA :");
        String nama = input.nextLine();

        System.out.println("DEPARTEMEN BAGIAN:");
        System.out.println("1. Produksi");
        System.out.println("2. Marketing");
        System.out.println("3. Inventory");
        String departemen = input.nextLine();

        System.out.println("LAMA BEKERJA :");
        System.out.println("1. Kurang dari 1 tahun");
        System.out.println("2. 1 sampai 2 tahun");
        System.out.println("3. lebih dari 2 tahun");
        int lamaBekerja = input.nextInt();

        switch (lamaBekerja) {
            case 1:
                System.out.println("PENDAPATAN ANDA SEBESAR Rp.3.000.000");
                break;
            case 2:
                System.out.println("PENDAPATAN ANDA SEBESAR Rp.4.000.000");
                break;
            case 3:
                System.out.println("PENDAPATAN ANDA SEBESAR Rp.5.000.000");
                break;
            default:
                System.out.println("TIDAK VALID");
                break;

        }
    }

}