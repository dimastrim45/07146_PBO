package SistemInformasiSekolah;

public class Dimas07146_GuruEntity {
    String Nama, Agama, NIK;
    int NIP, NUPTK;
    String JenisKelamin, Mapel;
    
    public Dimas07146_GuruEntity(String Nama, String NIK, int NIP, int NUPTK, String JenisKelamin, String Mapel){
        this.Nama = Nama;
        this.NIK = NIK;
        this.NIP = NIP;
        this.NUPTK = NUPTK;
        this.JenisKelamin = JenisKelamin;
        this.Mapel = Mapel;
    }
    String getNama(){
        return this.Nama;
    }
    String getNIK(){
        return this.NIK;
    }
    int getNIP(){
        return this.NIP;
    }
    int getNUPTK(){
        return this.NUPTK;
    }
    String getJK(){
        return this.JenisKelamin;
    }
    String getMapel(){
        return this.Mapel;
    }
    
}
