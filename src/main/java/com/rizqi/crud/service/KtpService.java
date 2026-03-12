package com.rizqi.crud.service;

import com.rizqi.crud.dto.KtpRequest;
import com.rizqi.crud.dto.KtpResponse;
import java.util.List;

public interface KtpService {
    KtpResponse create(KtpRequest request);
    List<KtpResponse> findAll();
    KtpResponse findById(Integer id);
    KtpResponse update(Integer id, KtpRequest request);
    void delete(Integer id);
}