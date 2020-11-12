/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akademik;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author 012D1N
 */
public class Data implements Serializable{
    public ArrayList<Mahasiswa> dafMhs=new ArrayList();
    public ArrayList<Dosen> dafDsn=new ArrayList();
    public ArrayList<Matakuliah> dafMatkul=new ArrayList();
    public ArrayList<KelasKuliah> dafKelas=new ArrayList();
}
