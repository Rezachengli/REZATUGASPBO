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
public class datasetharga_kredit {
     
    private ArrayList<Integer> id_kredit;
    private ArrayList<Integer> id_mobil;
    private ArrayList<String> namaMobil;
    private ArrayList<Integer> uang_muka;
    private ArrayList<Integer> anggusuran_1;
    private ArrayList<String> anggusuran_2;
    private ArrayList<String> anggusuran_3;
    private ArrayList<String> anggusuran_4;
    
    public datasetharga_kredit(){
        id_kredit = new ArrayList<Integer>();
        id_mobil= new ArrayList<Integer>();
        namaMobil = new ArrayList<String>();                
        uang_muka= new ArrayList<Integer>();
        anggusuran_1 = new ArrayList<Integer>();
        anggusuran_2= new ArrayList<String>();
        anggusuran_3= new ArrayList<String>();
        anggusuran_4= new ArrayList<String>();
    }
    
    public void insertid_kredit(int isi){
        this.id_kredit.add(isi);
    }
    public ArrayList<Integer> getRecordid_kredit(){
        return this.id_kredit;
    }
    
    public void insertNamaMobil(String isi){
        this.namaMobil.add(isi);
    }
    
    public ArrayList<String> getRecordNamaMobil(){
        return this.namaMobil;
    }
    
    public void insertid_mobil(int isi){
        this.id_mobil.add(isi);
    }
    public ArrayList<Integer> getRecordid_mobil(){
        return this.id_mobil;
    }
    
    public void insertuang_muka(int isi){
        this.uang_muka.add(isi);
    }
    public ArrayList<Integer> getRecorduang_muka(){
        return this.uang_muka;
    }
    
    public void insertanggusuran_1(int isi){
        this.anggusuran_1.add(isi);
    }
    public ArrayList<Integer> getRecordanggusuran_1(){
        return this.anggusuran_1;
    }
    
    public void insertanggusuran_2(String isi){
        this.anggusuran_2.add(isi);
    }
    public ArrayList<String> getRecordanggusuran_2(){
        return this.anggusuran_2;
    }
    
    public void insertanggusuran_3(String isi){
        this.anggusuran_3.add(isi);
    }
    public ArrayList<String> getRegordanggusuran_3(){
        return this.anggusuran_3;
    }
    
    public void insertanggusuran_4(String isi){
        this.anggusuran_4.add(isi);
    }
    public ArrayList<String> getRecordanggusuran_4(){
        return this.anggusuran_4;
    }
      
    public void insertharg_kredit(int id_kredit, int id_mobil, int uang_muka, int anggusuran_1, String anggusuran_2, 
           String anggusuran_3, String anggusuran_4){
        this.id_kredit.add(id_kredit);
        this.id_mobil.add(id_mobil);
        this.uang_muka.add(uang_muka);
        this.anggusuran_1.add(anggusuran_1);
        this.anggusuran_2.add(anggusuran_2);
         this.anggusuran_3.add(anggusuran_3);
        this.anggusuran_4.add(anggusuran_4);
        
    }
    
}
