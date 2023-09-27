/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.postes1;

import java.util.ArrayList;
/**
 *
 * @author Kalengkongan John Derby
 */


public class Postes1 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // Menambahkan mahasiswa ke ArrayList
        daftarMahasiswa.add(new Mahasiswa("Alice", "19012345", 2019));
        daftarMahasiswa.add(new Mahasiswa("Bob", "20023456", 2020));
        daftarMahasiswa.add(new Mahasiswa("Charlie", "21034567", 2021));
        daftarMahasiswa.add(new Mahasiswa("David", "22045678", 2022));
        daftarMahasiswa.add(new Mahasiswa("Eve", "23056789", 2023));

        // Menampilkan daftar mahasiswa
        System.out.println("Daftar Mahasiswa di Universitas:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa);
        }
    }
}

