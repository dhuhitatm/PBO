package akademik;

import java.io.Serializable;

public class Dosen implements Serializable {
    private String kode;
    private String nama;

    public Dosen(String kode,String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

   public void setNama(String nama){
       this.nama=nama;
   }
   public String getNama(){
       return nama;
   }

}
