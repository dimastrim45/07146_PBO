package com.company.guru;

public class Jadwal {
    public String hari;
    public String mapel;
    public Guru guru;

    public Jadwal(String hari, String mapel) {
        this.hari = hari;
        this.mapel = mapel;
        this.guru = null;
    }

    public void setGuru(Guru guru) {
        this.guru = guru;
    }
}
