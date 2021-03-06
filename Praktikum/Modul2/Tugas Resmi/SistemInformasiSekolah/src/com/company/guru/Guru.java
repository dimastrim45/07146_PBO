package com.company.guru;

import com.company.karyawan.Karyawan;

public class Guru extends Karyawan {
    public String nama;
    public String NIK;
    public String NIP;
    public String NUPTK;
    public Karyawan gaji;
    public Karyawan masaKerja;
    public Jadwal jadwal;
    public Karyawan karyawan;
    public String IDNum;

    public Guru(String NIP, String NUPTK) {
        super();
        this.nama = super.nama;
        this.NIK = super.NIK;
        this.IDNum = super.IDNum;
        this.NIP = NIP;
        this.NUPTK = NUPTK;
        this.gaji = null;
        this.masaKerja = null;
        this.jadwal = null;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getIDNum(){ return IDNum; }
    public void setIDNum(String NIK){ this.IDNum = "1"+NIK; }

    public String getNIP() {
        return NIP;
    }
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNUPTK() {
        return NUPTK;
    }
    public void setNUPTK(String NUPTK) {
        this.NUPTK = NUPTK;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    public void setKaryawan(Karyawan karyawan){
        this.karyawan = karyawan;
    }
}
