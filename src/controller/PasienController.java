/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.ArrayList;
import model.Pasien;
/**
 *
 * @author LENOVO
 */
public class PasienController {

    private ArrayList<Pasien> listPasien = new ArrayList<>();

    public void simpan(Pasien pasien) {

        listPasien.add(pasien);

    }

    public ArrayList<Pasien> getListPasien() {

        return listPasien;

    }
    
    public void edit(int index, Pasien pasien) {

    listPasien.set(index, pasien);

}
    
    public void hapus(int index) {

    listPasien.remove(index);

}

}
