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
}