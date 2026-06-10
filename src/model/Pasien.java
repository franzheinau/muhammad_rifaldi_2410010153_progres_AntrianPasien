/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Pasien {

    private String noRM;
    private String nama;
    private String kelamin;
    private String telepon;
    
    public Pasien(String noRM, String nama, String kelamin, String telepon) {

    this.noRM = noRM;
    this.nama = nama;
    this.kelamin = kelamin;
    this.telepon = telepon;

}
    
    public Pasien() {

}
    public String getNoRM() {
        return noRM;
    }

    public void setNoRM(String noRM) {
        this.noRM = noRM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

}
