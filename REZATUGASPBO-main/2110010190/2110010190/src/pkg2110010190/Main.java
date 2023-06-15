/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2110010190;

import salary.*;
import dataset.*;
import form.formDatasetSpesifikasi;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        tbljenis jenis = new tbljenis();
        tblmobil mobil = new tblmobil();
        tblspesifikasi spesifikasi = new tblspesifikasi();
        tblharga_tunai hargatunai = new tblharga_tunai();
        tblharga_kredit hargakredit = new tblharga_kredit();
        tbladmin admin = new tbladmin();

        //Set
        jenis.setIdjenis(100);
        jenis.setNama_jenis("toyota");

        mobil.setId_mobil(100);
        mobil.setId_jenis(100);
        mobil.setNama_mobil("kijang");
        mobil.setGambar("mobilkijang");

        //Get
        System.out.println("id jenis   : " + jenis.getIdjenis());
        System.out.println("Nama jenis : " + jenis.getNama_jenis());
        System.out.println("Id mobil : " + mobil.getId_mobil());
        System.out.println("Id jenis : " + mobil.getId_jenis());
        System.out.println("Nama mobil : " + mobil.getNama_mobil());
        System.out.println("Gambar : " + mobil.getGambar());

        //Memasukkan Array List kedalam Object
        datasetjenis Jenis = new datasetjenis();
        datasetmobil Mobil = new datasetmobil();
        datasetSpesifikasi Spesifikasi = new datasetSpesifikasi();
        datasetharga_tunai harga_tunai = new datasetharga_tunai();
        datasetharga_kredit harga_kredit = new datasetharga_kredit();

//  
        //Menginput data ArrayList pada masing-masing tabel
        Jenis.insertid_jenis(001);
        Jenis.insertNama_jenis("Toyota");

        Mobil.insertid_mobil(101);
        Mobil.insertId_jenis(200);
        Mobil.insertNama_mobil("Kijang");
        Mobil.insertGambar("mobilkijang");

        Spesifikasi.insertid_spek(100);
        Spesifikasi.insertid_mobil("152");
        Spesifikasi.insertwarna("merah");
        Spesifikasi.insertjenis_mesin("intel");
        Spesifikasi.insertsilinder("suzuki");
        Spesifikasi.insertkatup("valve lifter");
        Spesifikasi.insertisi_silinder("200");
        Spesifikasi.insertkompresi("100");
        Spesifikasi.insertdaya_maksimum("40");
        Spesifikasi.insertbahanbakar("turbo");
        Spesifikasi.insertkemudi("Streering");
        Spesifikasi.insertban("mobil");
        Spesifikasi.insertduduk("duduk");
        Spesifikasi.inserttangki("tangki");
        Spesifikasi.insertpanjang("20");
        Spesifikasi.insertlebar("20");
        Spesifikasi.inserttinggi("20");
        Spesifikasi.insertrpm("20");

        harga_tunai.insertid_harga(200);
        harga_tunai.insertid_mobil("100");
        harga_tunai.insertharga_tunai(150000);

        harga_kredit.insertid_kredit(200);
        harga_kredit.insertid_mobil(100);
        harga_kredit.insertuang_muka(45000000);
        harga_kredit.insertanggusuran_1(200000);
        harga_kredit.insertanggusuran_2("85000000");
        harga_kredit.insertanggusuran_3("150000000");
        harga_kredit.insertanggusuran_4("200000000");

        datasetadmin datasetAdmin = new datasetadmin();
        datasetAdmin.insertNama("kijang");
        datasetAdmin.insertKunci("mobil");
       

        //Menampilkan data ArrayList
        System.out.println("===============DATA Jenis ==============");
        System.out.println(jenis.getIdjenis());
        System.out.println(jenis.getNama_jenis());

        System.out.println("\t");
        System.out.println("===============DATA Mobil ==============");
        System.out.println(Mobil.getRecordid_mobil());
        System.out.println(Mobil.getRecordId_jenis());
        System.out.println(Mobil.getRecordNama_mobil());
        System.out.println(Mobil.getRecordgetGambar());

        System.out.println("\t");
        System.out.println("===============DATA Spesifikasi ==============");
        System.out.println(Spesifikasi.getRecordid_spek());
        System.out.println(Spesifikasi.getRecordid_mobil());
        System.out.println(Spesifikasi.getRecordwarna());
        System.out.println(Spesifikasi.getRecordjenis_mesin());
        System.out.println(Spesifikasi.getRecordsilinder());
        System.out.println(Spesifikasi.getRecordKatup());
        System.out.println(Spesifikasi.getRecordisi_silinder());
        System.out.println(Spesifikasi.getRecordkompresi());
        System.out.println(Spesifikasi.getRecorddaya_maksimum());
        System.out.println(Spesifikasi.getRecordbahanbakar());
        System.out.println(Spesifikasi.getRecordkemudi());
        System.out.println(Spesifikasi.getRecordBan());
        System.out.println(Spesifikasi.getRecorduduk());
        System.out.println(Spesifikasi.getRecordtangki());
        System.out.println(Spesifikasi.getRecordpanjang());
        System.out.println(Spesifikasi.getRecordlebar());
        System.out.println(Spesifikasi.getRecordtinggi());
        System.out.println(Spesifikasi.getRecordrpm());

        System.out.println("\t");
        System.out.println("===============DATA harga_tunai==============");
        System.out.println(harga_tunai.getRecordid_harga());
        System.out.println(harga_tunai.getRecordid_mobil());
        System.out.println(harga_tunai.getRecordharga_tunai());

        System.out.println("\t");
        System.out.println("===============Data harga_kredit==============");
        System.out.println(harga_kredit.getRecordid_kredit());
        System.out.println(harga_kredit.getRecordid_mobil());
        System.out.println(harga_kredit.getRecorduang_muka());
        System.out.println(harga_kredit.getRecordanggusuran_1());
        System.out.println(harga_kredit.getRecordanggusuran_2());
        System.out.println(harga_kredit.getRegordanggusuran_3());
        System.out.println(harga_kredit.getRecordanggusuran_4());

        System.out.println("\t");
        System.out.println("===============DATA admin==============");
        System.out.println(admin.getNama());
        System.out.println(admin.getNama());
    }

}
