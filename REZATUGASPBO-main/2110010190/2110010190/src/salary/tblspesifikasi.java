/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author Asus
 */
public class tblspesifikasi {
    private int id_spek;
    private String id_mobil;
    private String  warna;
    private String jenis_mesin;
    private String silinder;
    private String katup;
    private String isi_silinder;
    private String kompresi;
    private String daya_maksimum;
    private String bahanbakar;
    private String kemudi;
    private String ban;
    private String duduk;
    private String tangki;
    private String panjang;
    private String lebar;
    private String tinggi;
    private String rpm;
    
    
public tblspesifikasi () {}
    

public void setId_spek(int id_spek) {
        this.id_spek = id_spek;
    }

public int getId_spek() {
        return id_spek;
    }
 public void setId_mobil(String id_mobil) {
        this.id_mobil = id_mobil;
    }


    public String getId_mobil() {
        return id_mobil;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

  public void setJenis_mesin(String jenis_mesin) {
        this.jenis_mesin = jenis_mesin;
    }

    public String getJenis_mesin() {
        return jenis_mesin;
    }

 public void setSilinder(String silinder) {
        this.silinder = silinder;
    }
    public String getSilinder() {
        return silinder;
    }

public void setKatup(String katup) {
      this.katup = katup;
    }
    public String getKatup() {
        return katup;
    }
 
     public void setIsi_silinder(String isi_silinder) {
        this.isi_silinder = isi_silinder;
    }
    
    public String getIsi_silinder() {
        return isi_silinder;
    }

   public void setKompresi(String kompresi) {
        this.kompresi= kompresi;
    } 
    public String getKompresi() {
        return kompresi;
    }
public void setDaya_maksimum(String daya_maksimum) {
        this.daya_maksimum = daya_maksimum;
    }
     public String getDaya_maksimum() {
        return daya_maksimum;
    }
 public void setBahanbakar(String bahanbakar) {
        this.bahanbakar = bahanbakar;
    }
     public String getBahanbakar() {
        return bahanbakar;
    }
public void setKemudi(String kemudi) {
        this.kemudi = kemudi;
    }
     public String getKemudi() {
        return kemudi;
    }
public void setBan(String ban) {
        this.ban = ban;
    }
     public String getBan() {
        return ban;
    }
public void setDuduk(String duduk) {
        this.duduk = duduk;
    }
     public String getDuduk() {
        return duduk;
    }
     public void setTangki(String tangki) {
        this.tangki= tangki;
    }
     public String getTangki() {
        return tangki;
    }
     public void setPanjang(String panjang) {
        this.panjang = panjang;
    }
     public String getPanjang() {
        return panjang;
    }
     public void setLebar(String lebar) {
        this.lebar = lebar;
    }
     public String getLebar() {
        return lebar;
    }
     public void setTinggi(String tinggi) {
        this.tinggi = tinggi;
    }
     public String getTinggi() {
        return tinggi;
    }
     public void setRpm(String rpm) {
        this.rpm = rpm;
    }
     public String getRpm() {
        return rpm;
    }

    
  
   

   

    public  tblspesifikasi(int id_spek, String id_mobil, String warna, String jenis_mesin, String silinder,
            String katup, String isi_silinder, String kompresi, String daya_maksimum, String bahanbakar,
            String kemudi, String ban, String duduk, String tangki, String panjang, String lebar,
            String tinggi, String rpm) {
        this.id_spek = id_spek;
        this.id_mobil = id_mobil;
        this.warna = warna;
        this.jenis_mesin = jenis_mesin;
        this.silinder = silinder;
        this.katup = katup;
        this.isi_silinder = isi_silinder;
        this.kompresi = kompresi;
        this.daya_maksimum = daya_maksimum;
        this.bahanbakar = bahanbakar;
        this.kemudi = kemudi;
        this.ban = ban;
        this.duduk = duduk;
        this.tangki = tangki;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.rpm = rpm;
    }

    // Getter and Setter methods
    // ...

    // Other methods
    // ...
}