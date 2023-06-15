/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus
 */
public class tblmobil {
    private int id_mobil;
    private int id_jenis;
    private String Nama_mobil;
    private String Gambar;
    
    public tblmobil (){}
    
    public void setId_mobil(int Id_mobil) {
        this.id_mobil = id_mobil;
    }

    public int getId_mobil() {
        return id_mobil;
    }


    public void setId_jenis(int id_jenis) {
        this.id_jenis = id_jenis;
    }

    public int getId_jenis() {
        return id_jenis;
    }
   
    public void setNama_mobil(String Nama_mobil) {
        this.Nama_mobil = Nama_mobil;
    }
 public String getNama_mobil() {
        return Nama_mobil;
    }

    public void setGambar(String Gambar) {
        this.Gambar = Gambar;
    }
    
     public String getGambar() {
        return Gambar;
    }



    }

