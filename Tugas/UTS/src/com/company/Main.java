package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public Scanner input;
    int select;
    String NIPindex;

    public ArrayList<Guru> dataGuru = new ArrayList<>();
    public ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
    public ArrayList<Jadwal> dataJadwal = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    private void menu() {

        input = new Scanner(System.in);
        String NIP, NUPTK;

        init();

        System.out.println("Selamat Datang Di Program Manajemen Sekolah");
        do {
            System.out.println("Menu:");
            System.out.println("1. Daftar Guru");
            System.out.println("2. Edit Data Guru");
            System.out.println("3. Hapus Guru");
            System.out.println("4. View Data Guru");
            System.out.println("5. Exit");
            System.out.print("Masukkan Pilihan: ");
            select = input.nextInt();

            switch (select){
                case 1:
                    daftar();
                    break;
                case 2:
                    System.out.println("Edit Data Guru");
                    System.out.print("Masukkan NIP: ");
                    NIPindex = input.next();
                    update(NIPindex);
                    break;
                case 3:
                    System.out.println("Hapus Guru");
                    System.out.print("Masukkan NIK Data Guru Yang Akan Dihapus: ");
                    NIPindex = input.next();
                    delete(NIPindex);
                    break;
                case 4:
                    System.out.println("View");
                    view();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan Anda Salah!!!");
                    break;
            }
        }while (select!=5);
    }



    private void init() {
        dataJadwal.add(new Jadwal("Senin", "PBO"));
        dataJadwal.add(new Jadwal("Selasa", "MAT"));
        dataJadwal.add(new Jadwal("Rabu", "IPA"));
        dataJadwal.add(new Jadwal("Kamis", "ENG"));
        dataJadwal.add(new Jadwal("Jumat", "BI"));

        dataKaryawan.add(new Karyawan("0", "< 1.000.000", "< 1 Tahun"));
        dataKaryawan.add(new Karyawan("1", ">= 2.000.000", ">= 1 Tahun"));
        dataKaryawan.add(new Karyawan("2", ">= 3.000.000", ">= 2 Tahun"));
        dataKaryawan.add(new Karyawan("3", ">= 4.000.000", ">= 3 Tahun"));
    }

    public void viewJadwal(){
        for (int i=0; i<dataJadwal.size(); i++){
            System.out.println( i +". " + dataJadwal.get(i).hari + ", " + dataJadwal.get(i).mapel);
        }
    }

    public void viewKaryawan(){
        for (int i=0; i<dataKaryawan.size(); i++){
            System.out.println( dataKaryawan.get(i).indexKaryawan +". " + dataKaryawan.get(i).gaji + ", " + dataKaryawan.get(i).masaKerja);
        }
    }


    private void daftar() {
        System.out.println("Daftar Guru");
        String selectJadwal;
        String selectKaryawan;

        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan NIK: ");
        String NIK = input.next();
        System.out.print("Masukkan NIP: ");
        String NIP = input.next();
        System.out.print("Masukkan NUPTK: ");
        String NUPTK = input.next();

        System.out.println("\nPilih Jadwal Guru: ");
        viewJadwal();
        System.out.print("Masukkan Hari: ");
        selectJadwal = input.next();

        Guru guru = new Guru(NIP, NUPTK);
        for (int i=0; i<dataJadwal.size(); i++){
            if (dataJadwal.get(i).hari.equals(selectJadwal)){
                Jadwal jadwal = new Jadwal(dataJadwal.get(i).hari, dataJadwal.get(i).mapel);

                dataJadwal.get(i).setGuru(guru);
                guru.setJadwal(jadwal);
            }
        }

        System.out.println("\nPilih Gaji dan Masa Kerja Anda: ");
        viewKaryawan();
        System.out.print("Masukkan Nomor Pilihan: ");
        selectKaryawan = input.next();
        for (int i=0; i<dataKaryawan.size(); i++){
            if (dataKaryawan.get(i).indexKaryawan.equals(selectKaryawan)){
                Karyawan karyawan = new Karyawan(dataKaryawan.get(i).indexKaryawan, dataKaryawan.get(i).gaji, dataKaryawan.get(i).masaKerja);

                dataJadwal.get(i).setGuru(guru);
                guru.setKaryawan(karyawan);
            }
        }

        guru.setNama(nama);
        guru.setNIK(NIK);
        dataGuru.add(guru);
    }

    private void view(){
        if (dataGuru.size()>0){
            for (int i=0; i<dataGuru.size(); i++){
                System.out.println("-----------------------");
                System.out.println("Nama: " + dataGuru.get(i).nama);
                System.out.println("NIK: " + dataGuru.get(i).NIK);
                System.out.println("NIP: " + dataGuru.get(i).NIP);
                System.out.println("NUPTK: " + dataGuru.get(i).NUPTK);
                System.out.println("Jadwal Yang Diambil: " + dataGuru.get(i).jadwal.hari + ", " + dataGuru.get(i).jadwal.mapel);
                System.out.println("Gaji: " + dataGuru.get(i).karyawan.gaji);
                System.out.println("Masa Kerja: " + dataGuru.get(i).karyawan.masaKerja);
                System.out.println("-----------------------");
            }
        }
        else {
            System.out.println("Belum Ada Data !!!");
        }
    }

    public void update(String NIPindex){
        for (int i=0; i<dataGuru.size(); i++){
            if (dataGuru.get(i).NIP.equals(NIPindex)){
                System.out.println("Nama: " + dataGuru.get(i).nama);
                System.out.println("NIK: " + dataGuru.get(i).NIK);
                System.out.println("NIP: " + dataGuru.get(i).NIP);
                System.out.println("NUPTK: " + dataGuru.get(i).NUPTK);

                System.out.print("Masukkan Nama: ");
                String nama = input.next();
                System.out.print("Masukkan NIK: ");
                String NIK = input.next();
                System.out.print("Masukkan NIP: ");
                String NIP = input.next();
                System.out.print("Masukkan NUPTK: ");
                String NUPTK = input.next();

                dataGuru.get(i).setNama(nama);
                dataGuru.get(i).setNIK(NIK);
                dataGuru.get(i).setNIP(NIP);
                dataGuru.get(i).setNUPTK(NUPTK);
            }
        }
    }

    private void delete(String NIPindex) {
        for (int i=0; i<dataGuru.size(); i++){
            if (dataGuru.get(i).NIP.equals(NIPindex)){
                System.out.println("Data Guru Milik: " + dataGuru.get(i).nama + " Dihapus!");
                dataGuru.remove(i);
            }
        }
    }
}
