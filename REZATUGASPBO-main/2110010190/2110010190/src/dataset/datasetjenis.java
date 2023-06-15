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
public class datasetjenis {
  
    private ArrayList<Integer> id_jenis;
    private ArrayList<String> Nama_jenis;
 
    
    public datasetjenis(){
        id_jenis= new ArrayList<Integer>();
        Nama_jenis= new ArrayList<String>();
       
    }
    
    public void insertid_jenis(int isi){
        this.id_jenis.add(isi);
    }
    public ArrayList<Integer> getRecordid_jenis(){
        return this.id_jenis;
    }
    
    public void insertNama_jenis(String isi){
        this.Nama_jenis.add(isi);
    }
    public ArrayList<String> getNama_jenis(){
        return this.Nama_jenis;
    }
    
  
    public void insertadmin(int id_jenis, String Nama_jenis){ 
        this.id_jenis.add(id_jenis);
        this.Nama_jenis.add(Nama_jenis);
        
    }
}
