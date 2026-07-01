package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import koneksi.Koneksi;

public class LoginController {

    public boolean login(String username, String password) {

        try {

            Connection conn = Koneksi.getKoneksi();

            String sql = "SELECT * FROM admin WHERE username=? AND password=?";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (Exception e) {

            System.out.println(e.getMessage());

            return false;

        }

    }

}
