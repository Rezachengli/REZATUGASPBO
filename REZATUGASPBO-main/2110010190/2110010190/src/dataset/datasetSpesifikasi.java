/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;
import form.*;


/**
 *
 * @author Asus
 */
public class datasetSpesifikasi {

    private ArrayList<Integer> id_spek;
    private ArrayList<String> id_mobil;
    private ArrayList<String> namaMobil;
    private ArrayList<String> warna;
    private ArrayList<String> jenis_mesin;
    private ArrayList<String> silinder;
    private ArrayList<String> katup;
    private ArrayList<String> isi_silinder;
    private ArrayList<String> kompresi;
    private ArrayList<String> daya_maksimum;
    private ArrayList<String> bahanbakar;
    private ArrayList<String> kemudi;
    private ArrayList<String> ban;
    private ArrayList<String> duduk;
    private ArrayList<String> tangki;
    private ArrayList<String> panjang;
    private ArrayList<String> lebar;
    private ArrayList<String> tinggi;
    private ArrayList<String> rpm;

    public datasetSpesifikasi() {
        id_spek = new ArrayList<Integer>();
        id_mobil = new ArrayList<String>();
        namaMobil = new ArrayList<String>();
        warna = new ArrayList<String>();
        jenis_mesin = new ArrayList<String>();
        silinder = new ArrayList<String>();
        katup = new ArrayList<String>();
        isi_silinder = new ArrayList<String>();
        kompresi = new ArrayList<String>();
        daya_maksimum = new ArrayList<String>();
        bahanbakar = new ArrayList<String>();
        kemudi = new ArrayList<String>();
        ban = new ArrayList<String>();
        duduk = new ArrayList<String>();
        tangki = new ArrayList<String>();
        panjang = new ArrayList<String>();
        lebar = new ArrayList<String>();
        tinggi = new ArrayList<String>();
        rpm = new ArrayList<String>();
    }

    public void insertid_spek(int isi) {
        this.id_spek.add(isi);
    }

    public ArrayList<Integer> getRecordid_spek() {
        return this.id_spek;
    }

    public void insertid_mobil(String isi) {
        this.id_mobil.add(isi);
    }

    public ArrayList<String> getRecordid_mobil() {
        return this.id_mobil;
    }
    
    public void insertNamaMobil (String isi){
        this.namaMobil.add(isi);
    }
    
    public ArrayList<String> getRecordNamaMobil(){
        return this.namaMobil;
    }

    public void insertwarna(String isi) {
        this.warna.add(isi);
    }

    public ArrayList<String> getRecordwarna() {
        return this.warna;
    }

    public void insertjenis_mesin(String isi) {
        this.jenis_mesin.add(isi);
    }

    public ArrayList<String> getRecordjenis_mesin() {
        return this.jenis_mesin;
    }

    public void insertsilinder(String isi) {
        this.silinder.add(isi);
    }

    public ArrayList<String> getRecordsilinder() {
        return this.silinder;
    }

    public void insertkatup(String isi) {
        this.katup.add(isi);
    }

    public ArrayList<String> getRecordKatup() {
        return this.katup;
    }

    public void insertisi_silinder(String isi) {
        this.isi_silinder.add(isi);
    }

    public ArrayList<String> getRecordisi_silinder() {
        return this.isi_silinder;
    }

    public void insertkompresi(String isi) {
        this.kompresi.add(isi);
    }

    public ArrayList<String> getRecordkompresi() {
        return this.kompresi;
    }

    public void insertdaya_maksimum(String isi) {
        this.daya_maksimum.add(isi);
    }

    public ArrayList<String> getRecorddaya_maksimum() {
        return this.daya_maksimum;
    }

    public void insertbahanbakar(String isi) {
        this.bahanbakar.add(isi);
    }

    public ArrayList<String> getRecordbahanbakar() {
        return this.bahanbakar;
    }

    public void insertkemudi(String isi) {
        this.kemudi.add(isi);
    }

    public ArrayList<String> getRecordkemudi() {
        return this.kemudi;
    }

    public void insertban(String isi) {
        this.ban.add(isi);
    }

    public ArrayList<String> getRecordBan() {
        return this.ban;
    }

    public void insertduduk(String isi) {
        this.duduk.add(isi);
    }

    public ArrayList<String> getRecorduduk() {
        return this.duduk;
    }

    public void inserttangki(String isi) {
        this.tangki.add(isi);
    }

    public ArrayList<String> getRecordtangki() {
        return this.tangki;
    }

    public void insertpanjang(String isi) {
        this.panjang.add(isi);
    }

    public ArrayList<String> getRecordpanjang() {
        return this.panjang;
    }

    public void insertlebar(String isi) {
        this.lebar.add(isi);
    }

    public ArrayList<String> getRecordlebar() {
        return this.lebar;
    }

    public void inserttinggi(String isi) {
        this.tinggi.add(isi);
    }

    public ArrayList<String> getRecordtinggi() {
        return this.tinggi;
    }

    public void insertrpm(String isi) {
        this.rpm.add(isi);
    }

    public ArrayList<String> getRecordrpm() {
        return this.rpm;
    }
//           new formUtama().setVisible(true);
    
    public void insertSpesifikasi(int id_spek, String id_mobil, String warna, String jenis_mesin,
            String silinder, String katup, String isi_silinder, String kompresi, String daya_maksimum, String bahanbakar,
            String kemudi, String ban, String duduk, String tangki, String panjang, String lebar, String tinggi, String rpm) {
        this.id_spek.add(id_spek);
        this.id_mobil.add(id_mobil);
        this.warna.add(warna);
        this.jenis_mesin.add(jenis_mesin);
        this.silinder.add(silinder);
        this.isi_silinder.add(isi_silinder);
        this.kompresi.add(kompresi);
        this.daya_maksimum.add(daya_maksimum);
        this.bahanbakar.add(bahanbakar);
        this.kemudi.add(kemudi);
        this.ban.add(ban);
        this.duduk.add(duduk);
        this.tangki.add(tangki);
        this.panjang.add(panjang);
        this.lebar.add(lebar);
        this.tinggi.add(tinggi);
        this.rpm.add(rpm);
    }

}
