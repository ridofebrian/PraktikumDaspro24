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
            // Perlombaan
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

        } else {
            System.out.println("Cabang ini belum dibuat.");
        }

        input.close();
    }
}