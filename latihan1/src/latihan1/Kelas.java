package latihan1;

public class Kelas {
    private String namaKelas;
    private int nMhs = 0;
    private MataKuliah matakuliah;
    private Mahasiswa mhs[] = new Mahasiswa[45];
    
    public Kelas(String namaKelas, String namaMK, int sks){
        this.namaKelas = namaKelas;
        this.matakuliah = new MataKuliah(namaMK, sks);
    }
    public void addMahasiswa(Mahasiswa mhsParam){
        this.mhs[nMhs] = mhsParam;
        this.nMhs++;
    }
    public int getnMhs() {
        return this.nMhs;
    }   
    public MataKuliah getMatakuliah() {
        return this.matakuliah;
    }   
    public void display(){
        System.out.println("NAMA KELAS : " + this.namaKelas );
        System.out.println("MATA KULIAH : " + this.matakuliah.getNamaMK());
        for (int i = 0; i < nMhs; i++) 
        {
            System.out.println("NAMA PESERTA KE - " + (i+1) + " : " + mhs[i].getNama());
            String tugas = mhs[i].getTugas() != null ? mhs[i].getTugas() : "TIDAK ADA TUGAS";
            System.out.println(tugas);
        }
    }
}
