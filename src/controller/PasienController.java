/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import model.Pasien;

public class PasienController {

    public void simpan(Pasien pasien) {

        try {

            Connection conn = Koneksi.getKoneksi();

            String sql = "INSERT INTO pasien(no_rm,nama,tgl_lahir,kelamin,telepon,alamat_jalan,no_identitas) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, pasien.getNoRM());
            ps.setString(2, pasien.getNama());
            ps.setString(3, pasien.getTglLahir());
            ps.setString(4, pasien.getKelamin());
            ps.setString(5, pasien.getTelepon());
            ps.setString(6, pasien.getAlamat());
            ps.setString(7, pasien.getNoIdentitas());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    
    public void edit(Pasien pasien, String idPasien) {

    try {

        Connection conn = Koneksi.getKoneksi();

        String sql = "UPDATE pasien SET no_rm=?, nama=?, tgl_lahir=?, kelamin=?, telepon=?, alamat_jalan=?, no_identitas=? WHERE id_pasien=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, pasien.getNoRM());
        ps.setString(2, pasien.getNama());
        ps.setString(3, pasien.getTglLahir());
        ps.setString(4, pasien.getKelamin());
        ps.setString(5, pasien.getTelepon());
        ps.setString(6, pasien.getAlamat());
        ps.setString(7, pasien.getNoIdentitas());
        ps.setString(8, idPasien);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data berhasil diupdate");

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

    }

}
    
    public void hapus(String idPasien) {

    try {

        Connection conn = Koneksi.getKoneksi();

        String sql = "DELETE FROM pasien WHERE id_pasien=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, idPasien);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

    }

}
}
