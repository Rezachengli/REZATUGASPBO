/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class datasetmobil {
    private ArrayList<Integer> id_mobil;
    private ArrayList<Integer> id_jenis;
    private ArrayList<String> Nama_mobil;
    private ArrayList<String> Gambar;
   
    public datasetmobil(){
        id_mobil= new ArrayList<Integer>();
        id_jenis= new ArrayList<Integer>();
        Nama_mobil= new ArrayList<String>();
        Gambar= new ArrayList<String>();
    }
    
    public void insertid_mobil(Integer isi){
        this.id_mobil.add(isi);
    }
    public ArrayList<Integer> getRecordid_mobil(){
        return this.id_mobil;
    }
    
    public void insertId_jenis(Integer isi){
        this.id_jenis.add(isi);
    }
    public ArrayList<Integer> getRecordId_jenis(){
        return this.id_jenis;
    }
    
    public void insertNama_mobil(String isi){
        this.Nama_mobil.add(isi);
    }
    public ArrayList<String> getRecordNama_mobil(){
        return this.Nama_mobil;
    }
    
    public void insertGambar(String isi){
        this.Gambar.add(isi);
    }
    public ArrayList<String> getRecordgetGambar(){
        return this.Gambar;
    }
    
    public void insertmobil(int Id_mobil, int Id_jenis, String Nama_mobil, String Gambar){
        this.id_mobil.add(Id_mobil);
        this.id_jenis.add(Id_jenis);
        this.Nama_mobil.add(Nama_mobil);
        this.Gambar.add(Gambar);
 
        
    }
}
