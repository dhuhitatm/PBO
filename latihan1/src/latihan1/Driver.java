package latihan1;

public class Driver {
    public static void main(String[] args) {
        Kelas k1 = new Kelas("KELAS K1", "k1", 15);
        Kelas k2 = new Kelas("KELAS K2", "k2", 10);

        Mahasiswa m1 = new Mahasiswa();
            m1.setNama("m1");
        Mahasiswa m2 = new Mahasiswa();
            m2.setNama("m2");
        Mahasiswa m3 = new Mahasiswa();
            m3.setNama("m3");
        Mahasiswa m4 = new Mahasiswa();
            m4.setNama("m4");
        Mahasiswa m5 = new Mahasiswa();
            m5.setNama("m5");
        
        k1.addMahasiswa(m1);
        k1.addMahasiswa(m2);
        k1.addMahasiswa(m5);
        k2.addMahasiswa(m2);
        k2.addMahasiswa(m3);
        k2.addMahasiswa(m4);
        k2.addMahasiswa(m5);
        
        System.out.println("JUMLAH MAHASISWA PADA KELAS k1 = " + k1.getnMhs());
        System.out.println("JJUMLAH MAHASISWA PADA KELAS k2 = " + k2.getnMhs());
        System.out.println(" ");
        
        Dosen d1 = new Dosen();
        d1.setNama("D1");
        Dosen d2 = new Dosen();
        d2.setNama("D2");
        d1.setTugas(m2, "TUGAS DARI :  " + d1.getNama());
        d1.setTugas(m4, "TUGAS DARI :  " + d1.getNama());
        d2.setTugas(m1, "TUGAS DARI :  " + d2.getNama());
        
        k1.display();
        System.out.println("");
        k2.display();

    }
}
