package com.rizqi.crud.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

public class KtpRequest {
    @NotBlank(message = "nomorKtp wajib diisi")
    @Size(max = 50)
    private String nomorKtp;

    @NotBlank(message = "namaLengkap wajib diisi")
    @Size(max = 255)
    private String namaLengkap;

    private String alamat;

    @NotNull(message = "tanggalLahir wajib diisi")
    private LocalDate tanggalLahir;

    @NotBlank(message = "jenisKelamin wajib diisi")
    private String jenisKelamin;

    // getters & setters
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