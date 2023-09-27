/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.postes1;

/**
 *
 * @author Kalengkongan John Derby
 */
public class Mahasiswa {
    private final String nama;
    private final String nim;
    private final int angkatan;

    public Mahasiswa(String nama, String nim, int angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", angkatan=" + angkatan +
                '}';
    }
}
