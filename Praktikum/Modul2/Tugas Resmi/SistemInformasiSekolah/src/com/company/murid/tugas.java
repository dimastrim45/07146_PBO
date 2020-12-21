package com.company.murid;

public class tugas {
    public String nama;
    public String assignment;
    public murid asistensi;

    public tugas(String nama, String assignment) {
        this.nama = nama;
        this.assignment = assignment;
    }

    public tugas(String nama, String assignment, murid asistensi) {
        this.nama = nama;
        this.assignment = assignment;
        this.asistensi = asistensi;
    }

    public void build(){
        if (asistensi == null){
            System.out.println("Siswa " + nama + " Tugas: " + assignment);
        }
        else {
            System.out.println("Siswa " + nama + " Tugas: " + assignment + " Dengan Asistensi");
        }
    }

    public murid getAsistensi(){
        return asistensi;
    }
}
