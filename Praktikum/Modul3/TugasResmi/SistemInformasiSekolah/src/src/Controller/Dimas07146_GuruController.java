package Controller;
import Entity.Dimas07146_GuruEntity;
import Model.Dimas07146_GuruModel;

public class Dimas07146_GuruController {
    private Dimas07146_GuruModel guruModel = new Dimas07146_GuruModel();

    public int maxData(){
        return guruModel.getSize();
    }

    public Dimas07146_GuruEntity view(int index){
        return guruModel.getData(index);
    }

    public String insert(Dimas07146_GuruEntity guruEntity){
        boolean result = guruModel.insert(guruEntity);
        if (result){
            return "Data Berhasil Diinput !";
        }
        return "Data Gagal Diinput !";
    }

    public String update(Dimas07146_GuruEntity guruEntity, String IDNum){
        boolean result = guruModel.update(guruEntity, IDNum);
        if (result){
            return "Data Berhasil Diedit !";
        }
        return "Data Tidak Berhasil Diedit !";
    }

    public int cekData(String NIP){
        return guruModel.cekData(NIP);
    }
    public int hapusData(String NIP){
        return guruModel.delete(NIP);
    }

}
