package latihan1;

public class MataKuliah {
    public String namaMK;
    public int sks;    
    public MataKuliah(String nama, int sks){
        this.namaMK = nama;
        this.sks = sks;
    }
    public String getNamaMK() {
        return this.namaMK;
    }
    public int getSks() {
        return this.sks;
    }    
    public String toString(){
        return "NAMA : " + this.namaMK + ", SKS : " + this.sks;
    }
}
