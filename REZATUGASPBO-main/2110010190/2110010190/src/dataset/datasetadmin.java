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
public class datasetadmin {
    private ArrayList<String> Nama;
    private ArrayList<String> Kunci;

    public datasetadmin(){
        Nama = new ArrayList<String>();
        Kunci = new ArrayList<String>();
    }
    
    public void insertNama(String isi){
        this.Nama.add(isi);
    }
    public ArrayList<String> getRecordNama(){
        return this.Nama;
    }
    
    public void insertKunci(String isi){
        this.Kunci.add(isi);
    }
    public ArrayList<String> getKunci(){
        return this.Kunci;
    }
    
    
    public void insertadmin(String Nama, String Kunci){
        this.Nama.add(Nama);
        this.Kunci.add(Kunci);
    }
}
