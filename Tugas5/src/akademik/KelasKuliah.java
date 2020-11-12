package akademik;

import java.io.Serializable;
import java.util.ArrayList;

public class KelasKuliah implements Serializable{
   private String namaKelas;
   private Matakuliah matakuliah;
   private Dosen dosen;
   private ArrayList<Mahasiswa> dafMhs=new ArrayList();

   public KelasKuliah(String namaKelas, Matakuliah mk,Dosen ds){
       this.namaKelas=namaKelas;
       matakuliah=mk;
       dosen=ds;
   }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

   public void addMhs(Mahasiswa mhs){
       dafMhs.add(mhs);
   }

   public Matakuliah getMatakuliah(){
       return matakuliah;
   }

   public ArrayList<Mahasiswa> getDafMhs(){
       return dafMhs;
   }
   
   public Mahasiswa getMhs(int no){
       return dafMhs.get(no);
   }
}
