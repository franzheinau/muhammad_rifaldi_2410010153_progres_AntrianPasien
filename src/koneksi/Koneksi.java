/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    private static Connection koneksi;

    public static Connection getKoneksi() {

        if (koneksi == null) {

            try {

                String url = "jdbc:mysql://localhost:3306/antrianpasien";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

                koneksi = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi Berhasil");

            } catch (Exception e) {

                System.out.println("Koneksi Gagal");
                System.out.println(e.getMessage());

            }

        }

        return koneksi;
    }
}
