package SistemInformasiSekolah;
import java.util.ArrayList;
import java.util.Scanner;

public class Dimas07146_Main {
    static ArrayList<Dimas07146_GuruEntity> dataGuru = new ArrayList();
    static Scanner input;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimas07146_Main menu = new Dimas07146_Main();
        menu.Menu();
    }
    
    public void Menu(){
        int selectedMenu;
        input = new Scanner(System.in);
        do{
            System.out.println("===Manajemen Guru===");
            System.out.println("[1] Lihat Guru");
            System.out.println("[2] Tambah Guru");
            System.out.println("[3] Hapus Guru");
            System.out.println("[4] Update Guru");
            System.out.println("[5] Exit");
            System.out.println("======================");
            System.out.print("Pilihan: ");
            selectedMenu = input.nextInt();
            input.nextLine();

            switch(selectedMenu){
                case 1:
                    readGuru();
                    break;

                case 2:
                    addGuru();
                    break;

                case 3:
                    System.out.println("Masukkan NIP: (Jika hapus semua data masukkan 0) ");
                    int nip = input.nextInt();
                    deleteGuru(nip);
                    break;

                case 4:
                    System.out.println("Masukkan NIP: ");
                    nip = input.nextInt();
                    updateGuru(nip);
                    break;

                default:
                    System.out.println("Terimakasih.");
                   // backToMenu();
                    break;
            }
        }while(selectedMenu != 5);
    }
    
    public void addGuru() {
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan NIK: ");
        String nik = input.next();
        System.out.print("Masukkan NIP: ");
        int nip = input.nextInt();
        System.out.print("Masukkan NUPTK: ");
        int  nuptk = input.nextInt();
        System.out.print("Jenis Kelamin: ");
        String JK = input.next();
        System.out.print("Masukkan Mapel: ");
        String mapel = input.next();
        
        dataGuru.add(new Dimas07146_GuruEntity(nama, nik, nip, nuptk, JK, mapel));
    }
    
    
    public void readGuru() {
        for(int i = 0; i < dataGuru.size(); i++) {
            System.out.println("============");
            System.out.println("Nama: " + dataGuru.get(i).getNama());
            System.out.println("NIK: "+ dataGuru.get(i).getNIK());
            System.out.println("NIP: " + dataGuru.get(i).getNIP());
            System.out.println("NUPTK: " + dataGuru.get(i).getNUPTK());
            System.out.println("Jenis Kelamin: " + dataGuru.get(i).getJK());
            System.out.println("Mapel: "+ dataGuru.get(i).getMapel());
            System.out.println("============");
        }
    }
    
    public void deleteGuru(int nip) {
        if(nip == 0) {
            dataGuru.clear();
            System.out.println("Data Semua Guru Berhasil Dihapus");
        } else {
            for(int i = 0; i < dataGuru.size(); i++) {
                if(dataGuru.get(i).getNIP() == nip) {
                    System.out.println("Data guru milik: " + dataGuru.get(i).getNama() + " berhasil terhapus");
                    dataGuru.remove(i);
                }
            }
        }
    }
    
    public void updateGuru(int nip){
        for(int i = 0; i < dataGuru.size(); i++) {
                if(dataGuru.get(i).getNIP() == nip) {
                    System.out.print("Masukkan Nama: ");
                    String nama = input.next();
                    System.out.print("Masukkan NIK: ");
                    String nik = input.next();
                    System.out.print("Masukkan NIP: ");
                    int nips = input.nextInt();
                    System.out.print("Masukkan NUPTK: ");
                    int  nuptk = input.nextInt();
                    System.out.print("Jenis Kelamin: ");
                    String JK = input.next();
                    System.out.print("Masukkan Mapel: ");
                    String mapel = input.next();
                    //Replace Data
                    dataGuru.get(i).Nama = nama;
                    dataGuru.get(i).NIK = nik;
                    dataGuru.get(i).NIP = nips;
                    dataGuru.get(i).NUPTK = nuptk;
                    dataGuru.get(i).JenisKelamin = JK;
                    dataGuru.get(i).Mapel = mapel;
                }
        }
    }
    
}
