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
public class datasetharga_tunai {
     private ArrayList<Integer> id_harga;
    private ArrayList<String> id_mobil;
    private ArrayList<Integer> harga_tunai;
   
    public datasetharga_tunai(){
        id_harga = new ArrayList<Integer>();
        id_mobil= new ArrayList<String>();
        harga_tunai= new ArrayList<Integer>();
    }
    
    public void insertid_harga(Integer isi){
        this.id_harga.add(isi);
    }
    public ArrayList<Integer> getRecordid_harga(){
        return this.id_harga;
    }
    
    public void insertid_mobil(String isi){
        this.id_mobil.add(isi);
    }
    public ArrayList<String> getRecordid_mobil(){
        return this.id_mobil;
    }
    
    public void insertharga_tunai(Integer isi){
        this.harga_tunai.add(isi);
    }
    public ArrayList<Integer> getRecordharga_tunai(){
        return this.harga_tunai;
    }
    
    public void insertharga_tunai(int id_harga, String id_mobil, int harga_tunai) {
        this.id_harga.add(id_harga);
        this.id_mobil.add(id_mobil);
        this.harga_tunai.add(harga_tunai);
    }
}
