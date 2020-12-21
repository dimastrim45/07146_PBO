package com.company.karyawan;

import com.company.Person;

public class Karyawan extends Person {
    public String indexKaryawan;
    public String gaji;
    public String masaKerja;

    public Karyawan(String indexKaryawan,  String gaji, String masaKerja) {
        this.indexKaryawan = indexKaryawan;
        this.gaji = gaji;
        this.masaKerja = masaKerja;
    }

    public Karyawan() {

    }

    public String getGaji() {
        return gaji;
    }
    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getMasaKerja() {
        return masaKerja;
    }
    public void setMasaKerja(String masaKerja) {
        this.masaKerja = masaKerja;
    }

    public String getIndexKaryawan() {
        return indexKaryawan;
    }

    public void setIndexKaryawan(String indexKaryawan) {
        this.indexKaryawan = indexKaryawan;
    }
}
