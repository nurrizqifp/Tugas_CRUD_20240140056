package com.rizqi.crud.mapper;

import com.rizqi.crud.entity.Ktp;
import com.rizqi.crud.dto.KtpRequest;
import com.rizqi.crud.dto.KtpResponse;

public class KtpMapper {
    public static KtpResponse toResponse(Ktp ktp) {
        if (ktp == null) return null;
        KtpResponse r = new KtpResponse();
        r.setId(ktp.getId());
        r.setNomorKtp(ktp.getNomorKtp());
        r.setNamaLengkap(ktp.getNamaLengkap());
        r.setAlamat(ktp.getAlamat());
        r.setTanggalLahir(ktp.getTanggalLahir());
        r.setJenisKelamin(ktp.getJenisKelamin());
        return r;
    }
}