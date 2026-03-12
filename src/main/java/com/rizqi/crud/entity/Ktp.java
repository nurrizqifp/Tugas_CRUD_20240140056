package com.rizqi.crud.entity;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ktp", uniqueConstraints = {@UniqueConstraint(columnNames = "nomor_ktp")})
public class Ktp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nomor_ktp", nullable = false, unique = true, length = 50)
    private String nomorKtp;

    @Column(name = "nama_lengkap", nullable = false, length = 255)
    private String namaLengkap;

    @Column(name = "alamat", length = 500)
    private String alamat;

    @Column(name = "tanggal_lahir")
    private LocalDate tanggalLahir;

    @Column(name = "jenis_kelamin", length = 20)
    private String jenisKelamin;
}