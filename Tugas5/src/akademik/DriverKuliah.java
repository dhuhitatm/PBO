package akademik;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DriverKuliah {

    static ArrayList<KelasKuliah> dafKelas = new ArrayList();
    static ArrayList<Mahasiswa> dafMhs = new ArrayList();
    static ArrayList<Dosen> dafDsn = new ArrayList();
    static ArrayList<Matakuliah> dafMatkul = new ArrayList();
    static Data data = new Data();

    public static void initData() {

        dafMhs.add(new Mahasiswa("001", "Budi", 18));
        dafMhs.add(new Mahasiswa("002", "Agus", 17));
        dafMhs.add(new Mahasiswa("003", "Ita", 19));
        dafMhs.add(new Mahasiswa("004", "Ina", 20));
        dafMhs.add(new Mahasiswa("005", "Ari", 19));

        dafMatkul.add(new Matakuliah("K01", "Algoritma", 4));
        dafMatkul.add(new Matakuliah("K02", "PBO", 3));
        dafMatkul.add(new Matakuliah("K03", "Web Pro", 3));

        dafDsn.add(new Dosen("BGP", "Bagus"));
        dafDsn.add(new Dosen("SLS", "Salsa"));

        dafKelas.add(new KelasKuliah("Kelas-1", dafMatkul.get(0), dafDsn.get(1)));
        dafKelas.add(new KelasKuliah("Kelas-2", dafMatkul.get(1), dafDsn.get(0)));

        dafKelas.get(0).addMhs(dafMhs.get(0));
        dafKelas.get(0).addMhs(dafMhs.get(1));
        dafKelas.get(0).addMhs(dafMhs.get(4));
        dafKelas.get(1).addMhs(dafMhs.get(1));
        dafKelas.get(1).addMhs(dafMhs.get(2));
        dafKelas.get(1).addMhs(dafMhs.get(3));
        dafKelas.get(1).addMhs(dafMhs.get(4));
    }

    public static void saveData() {
        data.dafMatkul = dafMatkul;
        data.dafDsn = dafDsn;
        data.dafMhs = dafMhs;
        data.dafKelas = dafKelas;
        try {
            FileOutputStream fos = new FileOutputStream("data.dat");
            ObjectOutputStream f = new ObjectOutputStream(fos);
            f.writeObject(data);
            f.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void tampilData() {
        System.out.println("Daftar Kelas");
        System.out.println("============");
        for (int i = 0; i < dafKelas.size(); i++) {
            System.out.println("Nama Kelas : " + dafKelas.get(i).getNamaKelas());
            System.out.println("Matakuliah : " + dafKelas.get(i).getMatakuliah().getNamaMK());
            System.out.println("Dosen      : " + dafKelas.get(i).getDosen().getNama());
            System.out.println("Daftar Mahasiswa");
            System.out.println("===================================");
            System.out.println("No NIM        Nama               ");
            System.out.println("===================================");
            for (int j = 0; j < dafKelas.get(i).getDafMhs().size(); j++) {
                System.out.printf("%2d %-10s %-20s\n",
                        (j + 1), dafKelas.get(i).getMhs(j).getNim(), dafKelas.get(i).getMhs(j).getNama());
            }
            System.out.println("===================================");
        }
    }

    public static void tampilDosen() {
        System.out.println("Daftar Dosen");
        System.out.println("===================================");
        System.out.println("No Kode       Nama               ");
        System.out.println("===================================");
        for (int i = 0; i < dafDsn.size(); i++) {
            System.out.printf("%2d %-10s %-20s\n",
                    (i + 1), dafDsn.get(i).getKode(), dafDsn.get(i).getNama());
            System.out.println("===================================");
        }
    }

    public static void tampilMahasiswa() {
        System.out.println("Daftar Mahasiswa");
        System.out.println("===================================");
        System.out.println("No NIM        Nama               ");
        System.out.println("===================================");
        for (int i = 0; i < dafMhs.size(); i++) {
            System.out.printf("%2d %-10s %-20s\n",
                    (i + 1), dafMhs.get(i).getNim(), dafMhs.get(i).getNama());
            System.out.println("===================================");
        }
    }

    public static void tampilMahasiswa(KelasKuliah kelas) {
        System.out.println("Daftar Mahasiswa");
        System.out.println("===================================");
        System.out.println("No NIM        Nama               ");
        System.out.println("===================================");
        for (int i = 0; i < kelas.getDafMhs().size(); i++) {
            System.out.printf("%2d %-10s %-20s\n",
                    (i + 1), kelas.getMhs(i).getNim(), kelas.getMhs(i).getNama());
            System.out.println("===================================");
        }
    }

    public static void tampilMatakuliah() {
        System.out.println("Daftar Matakuliah");
        System.out.println("===================================");
        System.out.println("No Kode       Nama               ");
        System.out.println("===================================");
        for (int i = 0; i < dafMatkul.size(); i++) {
            System.out.printf("%2d %-10s %-20s\n",
                    (i + 1), dafMatkul.get(i).getKode(), dafMatkul.get(i).getNamaMK());
            System.out.println("===================================");
        }
    }

    public static void tampilKelas() {
        System.out.println("Daftar Kelas");
        System.out.println("=======================");
        System.out.println("No Nama               ");
        System.out.println("=======================");
        for (int i = 0; i < dafKelas.size(); i++) {
            System.out.printf("%2d %-20s\n",
                    (i + 1), dafKelas.get(i).getNamaKelas());
            System.out.println("=======================");
        }
    }

    public static void loadData() {
        try {
            FileInputStream fis = new FileInputStream("data.dat");
            ObjectInputStream f = new ObjectInputStream(fis);
            data = (Data) f.readObject();
            f.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dafDsn = data.dafDsn;
        dafMhs = data.dafMhs;
        dafMatkul = data.dafMatkul;
        dafKelas = data.dafKelas;
    }

    public static void dosenNgajar(String kode) {
        System.out.println("Daftar Mengajar Dosen");
        System.out.println("=====================");
        int j;

        j = 0;
        for (int i = 0; i < dafDsn.size(); i++) {
            if (dafDsn.get(i).getKode().equals(kode)) {
                Dosen dosen = dafDsn.get(i);
                System.out.println("Kode Dosen : " + dosen.getKode());
                System.out.println("Nama Dosen : " + dosen.getNama());
                for (int d = 0; d < dafKelas.size(); d++) {
                    KelasKuliah kls = dafKelas.get(d);
                    if (kls.getDosen() == dosen) {
                        j++;
                        System.out.println("Mengajar   : " + j + ". " + kls.getMatakuliah().getNamaMK());
                    }
                }
            }
        }
    }

    public static void mhsKuliah(String nim) {
        int mk;
        Mahasiswa mhs = null;

        for (int i = 0; i < dafMhs.size(); i++) {
            if (dafMhs.get(i).getNim().equals(nim)) {
                mhs = dafMhs.get(i);
            }
        }

        if (mhs == null) {
            System.out.println("Mahassiswa tidak terdaftar");
        } else {
            System.out.println("Daftar Kuliah Mahasiswa");
            System.out.println("=======================");
            System.out.println("NIM        : " + mhs.getNim());
            System.out.println("Nama       : " + mhs.getNama());
            mk = 0;
            for (int i = 0; i < dafKelas.size(); i++) {
                KelasKuliah kls = dafKelas.get(i);
                for (int j = 0; j < kls.getDafMhs().size(); j++) {
                    if (kls.getMhs(j) == mhs) {
                        mk++;
                        System.out.println("Kuliah     : " + mk + ". " + kls.getMatakuliah().getNamaMK());
                    }
                }
            }
        }
    }

    public static void main1() {//buat contoh data dan disimpan
        initData();
        tampilData();
        saveData();
    }

    public static void main2() { //baca file utk ditampilkan
        loadData();
        tampilData();
    }

    public static void main3() { //baca file, dimodifikasi dan ditampilkan dan save
        loadData();
        tampilData();
        System.out.println("===================================================");
        //ketika mahasiswa bernama Ari diganti menjadi Ariyanti
        //maka daftar mahasiswa di kelas-01 dan kelas-02 berubah
        System.out.println("ketika mahasiswa bernama Ari diganti menjadi Ariyanti");
        System.out.println("maka daftar mahasiswa di kelas-01 dan kelas-02 berubah");

        dafMhs.get(4).setNama("Aryanti");
        tampilData();
        saveData();
    }

    public static void main4() { //baca file, dimodifikasi dan ditampilkan dan save
        loadData();
        tampilData();
        System.out.println("===================================================");
        System.out.println("menampilkan daftar matakuliah yang diajar dosen kode BGP");
        dosenNgajar("BGP");
        System.out.println("===================================================");
        System.out.println("menampilkan daftar matakuliah yang diambil mhs nim 005");
        mhsKuliah("005");
    }

    public static void main5() {
        Scanner scan = new Scanner(System.in);
        String nama, nim, kode;
        int input, umur, sks, no_dsn, no_matkul, no_mhs, no_kelas;

        do {
            loadData();
            System.out.println("Menu");
            System.out.println("1. Daftar Matakuliah");
            System.out.println("2. Daftar Dosen");
            System.out.println("3. Daftar Mahasiswa");
            System.out.println("4. Daftar Kelas");
            System.out.println("5. Keluar/Selesai");
            System.out.print("input : ");
            input = scan.nextInt();

            switch (input) {
                case 1:
                    do {
                        System.out.println("\n");
                        tampilMatakuliah();
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Ubah Data");
                        System.out.println("3. Kembali");
                        System.out.print("input : ");
                        input = scan.nextInt();
                        switch (input) {
                            case 1:
                                System.out.print("kode\t: ");
                                kode = scan.nextLine();
                                kode = scan.nextLine();
                                System.out.print("nama\t: ");
                                nama = scan.nextLine();
                                System.out.print("sks\t: ");
                                sks = scan.nextInt();
                                dafMatkul.add(new Matakuliah(kode, nama, sks));
                                break;

                            case 2:
                                System.out.print("no matakuliah\t: ");
                                no_mhs = scan.nextInt();
                                scan.nextLine();
                                System.out.print("nama\t\t: ");
                                nama = scan.nextLine();
                                dafMatkul.get(no_mhs - 1).setNamaMK(nama);
                                break;

                        }
                        System.out.println("\n");
                        saveData();
                    } while (input != 3);

                    break;
                case 2:
                    do {
                        System.out.println("\n");
                        tampilDosen();
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Ubah Data");
                        System.out.println("3. Kembali");
                        System.out.print("input : ");
                        input = scan.nextInt();
                        switch (input) {
                            case 1:
                                System.out.print("kode\t: ");
                                kode = scan.nextLine();
                                kode = scan.nextLine();
                                System.out.print("nama\t: ");
                                nama = scan.nextLine();
                                dafDsn.add(new Dosen(kode, nama));
                                break;

                            case 2:
                                System.out.print("no dosen\t: ");
                                no_dsn = scan.nextInt();
                                scan.nextLine();
                                System.out.print("nama\t\t: ");
                                nama = scan.nextLine();
                                dafDsn.get(no_dsn - 1).setNama(nama);
                                break;
                        }
                        System.out.println("\n");
                        saveData();
                    } while (input != 3);

                    break;
                case 3:
                    do {
                        System.out.println("\n");
                        tampilMahasiswa();
                        System.out.println("1. Tambah Data");
                        System.out.println("2. Ubah Data");
                        System.out.println("3. Kembali");
                        System.out.print("input : ");
                        input = scan.nextInt();
                        switch (input) {
                            case 1:
                                System.out.print("nim\t: ");
                                nim = scan.nextLine();
                                nim = scan.nextLine();
                                System.out.print("nama\t: ");
                                nama = scan.nextLine();
                                System.out.print("umur\t: ");
                                umur = scan.nextInt();
                                dafMhs.add(new Mahasiswa(nim, nama, umur));
                                break;

                            case 2:
                                System.out.print("no mahasiswa\t: ");
                                no_matkul = scan.nextInt();
                                scan.nextLine();
                                System.out.print("nama\t\t: ");
                                nama = scan.nextLine();
                                dafMhs.get(no_matkul - 1).setNama(nama);
                                break;

                        }
                        System.out.println("\n");
                        saveData();
                    } while (input != 3);

                    break;
                case 4:
                    do {
                        System.out.println("\n");
                        tampilKelas();
                        System.out.println("1. Pilih Kelas");
                        System.out.println("2. Kembali");
                        System.out.print("input : ");
                        input = scan.nextInt();
                        switch (input) {
                            case 1:
                                System.out.print("no kelas\t: ");
                                no_kelas = scan.nextInt();
                                do {
                                    System.out.println("\n");
                                    tampilMahasiswa(dafKelas.get(no_kelas - 1));
                                    System.out.println("1. Tambah Mahasiswa");
                                    System.out.println("2. Kembali");
                                    System.out.print("input : ");
                                    input = scan.nextInt();
                                    switch (input) {
                                        case 1:
                                            System.out.println("\n");
                                            tampilMahasiswa();
                                            System.out.print("no mahasiswa\t: ");
                                            no_mhs = scan.nextInt();
                                            dafKelas.get(no_kelas - 1).addMhs(dafMhs.get(no_mhs - 1));
                                            break;
                                    }
                                    System.out.println("\n");
                                    saveData();
                                } while (input != 2);
                                input = 0;
                                break;
                        }
                        System.out.println("\n");
                    } while (input != 2);

                    break;
            }
            System.out.println("\n");
            loadData();
        } while (input != 5);
    }

    public static void main(String[] args) {
        main5();
    }
}
