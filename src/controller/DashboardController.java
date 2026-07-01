/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import koneksi.Koneksi;

public class DashboardController {

    public String totalPasien() {

        try {

            Connection conn = Koneksi.getKoneksi();

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS total FROM pasien");

            if (rs.next()) {
                return rs.getString("total");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return "0";

    }

    public String totalAntrian() {

        try {

            Connection conn = Koneksi.getKoneksi();

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS total FROM antrian WHERE status='Menunggu'");

            if (rs.next()) {
                return rs.getString("total");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return "0";

    }

    public String totalDipanggil() {

        try {

            Connection conn = Koneksi.getKoneksi();

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS total FROM antrian WHERE status='Dipanggil'");

            if (rs.next()) {
                return rs.getString("total");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return "0";

    }

    public String totalSelesai() {

        try {

            Connection conn = Koneksi.getKoneksi();

            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS total FROM antrian WHERE status='Selesai'");

            if (rs.next()) {
                return rs.getString("total");
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return "0";

    }

}
