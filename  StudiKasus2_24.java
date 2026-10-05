import java.util.Scanner;

class StudiKasus2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine().trim();

        System.out.println();
        System.out.println("Nama   : " + nama);

        if (jenis.equalsIgnoreCase("BELMAWA")
                || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara (isi 0 jika bukan juara) : ");
            int peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap dan meraih Juara " + peringkat
                            + ". Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
 
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPKM = input.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Tim PKM lolos pendanaan dan dokumen lengkap. "
                            + "Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tim PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }

        } else if (jenis.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status : Kegiatan lainnya tidak memperoleh dana penghargaan.");

        } else {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }

        input.close();
    }
}