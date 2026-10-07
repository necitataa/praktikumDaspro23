import java.util.Scanner;

public class studiKasus223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;

        String namamahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaan, kurang;

        System.out.print("Nama Mahasiswa    : ");
        namamahasiswa = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara : ");
            peringkatJuara = sc.nextInt();

            if (jumlahDokumen == 4) {
                if (peringkatJuara == 1 || peringkatJuara == 2 || peringkatJuara == 3) {
                    System.out.println("Status : Memperoleh dana penghargaan (Juara " + peringkatJuara + ").");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (Bukan Juara 1, 2, atau 3).");
                }
            } else {
                kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } 
    }
}