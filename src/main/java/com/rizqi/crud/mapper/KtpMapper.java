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

    public static Ktp toEntity(KtpRequest req) {
        if (req == null) return null;
        Ktp k = new Ktp();
        k.setNomorKtp(req.getNomorKtp());
        k.setNamaLengkap(req.getNamaLengkap());
        k.setAlamat(req.getAlamat());
        k.setTanggalLahir(req.getTanggalLahir());
        k.setJenisKelamin(req.getJenisKelamin());
        return k;
    }


}