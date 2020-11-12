
package latihan1;

public class Dosen {
    private String nama;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }   
    public void setTugas(Mahasiswa mhs, String tugas){
        mhs.setTugas(tugas);
    }
}
