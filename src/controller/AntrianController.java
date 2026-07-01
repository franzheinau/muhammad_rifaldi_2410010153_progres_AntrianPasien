/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;



import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import model.Antrian;

public class AntrianController {

    public void simpan(Antrian antrian) {

        try {

            Connection conn = Koneksi.getKoneksi();

            String sql = "INSERT INTO antrian(nomor_antrian,id_pasien,poli,status) VALUES (?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, antrian.getNomorAntrian());
            ps.setString(2, antrian.getIdPasien());
            ps.setString(3, antrian.getPoli());
            ps.setString(4, antrian.getStatus());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Antrian berhasil ditambahkan");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }
public void panggil(String idAntrian) {

    try {

        Connection conn = Koneksi.getKoneksi();

        String sql = "UPDATE antrian SET status='Dipanggil' WHERE id_antrian=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, idAntrian);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Pasien dipanggil");

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

    }

}



public void selesai(String idAntrian) {

    try {

        Connection conn = Koneksi.getKoneksi();

        String sql = "UPDATE antrian SET status='Selesai' WHERE id_antrian=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, idAntrian);

        ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "Antrian selesai");

    } catch (Exception e) {

        JOptionPane.showMessageDialog(null, e.getMessage());

    }

}
}
