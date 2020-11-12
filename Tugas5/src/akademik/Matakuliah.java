package akademik;

import java.io.Serializable;

public class Matakuliah implements Serializable {

    private String kode, namaMK;
    private int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.namaMK = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getSks() {
        return sks;
    }

    public String toString() {
        return namaMK + " " + sks;
    }
}
