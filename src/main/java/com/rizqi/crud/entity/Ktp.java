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

    // constructors, getters, setters
    public Ktp() {}
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNomorKtp() { return nomorKtp; }
    public void setNomorKtp(String nomorKtp) { this.nomorKtp = nomorKtp; }
    public String getNamaLengkap() { return namaLengkap; }
    public void setNamaLengkap(String namaLengkap) { this.namaLengkap = namaLengkap; }
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public LocalDate getTanggalLahir() { return tanggalLahir; }
    public void setTanggalLahir(LocalDate tanggalLahir) { this.tanggalLahir = tanggalLahir; }
    public String getJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(String jenisKelamin) { this.jenisKelamin = jenisKelamin; }
}