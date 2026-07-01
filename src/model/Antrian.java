/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Antrian {

    private String idAntrian;
    private String nomorAntrian;
    private String idPasien;
    private String poli;
    private String status;

    public Antrian() {
    }

    public Antrian(String nomorAntrian, String idPasien, String poli, String status) {
        this.nomorAntrian = nomorAntrian;
        this.idPasien = idPasien;
        this.poli = poli;
        this.status = status;
    }

    public String getIdAntrian() {
        return idAntrian;
    }

    public void setIdAntrian(String idAntrian) {
        this.idAntrian = idAntrian;
    }

    public String getNomorAntrian() {
        return nomorAntrian;
    }

    public void setNomorAntrian(String nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
    }

    public String getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public String getPoli() {
        return poli;
    }

    public void setPoli(String poli) {
        this.poli = poli;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
