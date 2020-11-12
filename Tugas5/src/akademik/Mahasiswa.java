package akademik;

import java.io.Serializable;

public class Mahasiswa implements Serializable{
    private String nim;
    private String nama;
    private int umur;

    public Mahasiswa(String nim, String nama, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void setNim(String nim){
        this.nim=nim;
    }
    
    public void setUmur(int umur){
        this.umur=umur;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public int getUmur(){
        return umur;
    }
}
