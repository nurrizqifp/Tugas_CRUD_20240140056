package com.rizqi.crud.service.impl;

import com.rizqi.crud.dto.KtpRequest;
import com.rizqi.crud.dto.KtpResponse;
import com.rizqi.crud.entity.Ktp;
import com.rizqi.crud.mapper.KtpMapper;
import com.rizqi.crud.repository.KtpRepository;
import com.rizqi.crud.service.KtpService;
import com.rizqi.crud.exception.BadRequestException;
import com.rizqi.crud.exception.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class KtpServiceImpl implements KtpService {

    private final KtpRepository repository;

    public KtpServiceImpl(KtpRepository repository) {
        this.repository = repository;
    }

    @Override
    public KtpResponse create(KtpRequest request) {
        if (repository.existsByNomorKtp(request.getNomorKtp())) {
            throw new BadRequestException("nomorKtp sudah terdaftar");
        }
        Ktp entity = KtpMapper.toEntity(request);
        Ktp saved = repository.save(entity);
        return KtpMapper.toResponse(saved);
    }

    @Override
    public List<KtpResponse> findAll() {
        return repository.findAll().stream().map(KtpMapper::toResponse).collect(Collectors.toList());
    }

    @Override
    public KtpResponse findById(Integer id) {
        Ktp k = repository.findById(id).orElseThrow(() -> new NotFoundException("Data KTP tidak ditemukan"));
        return KtpMapper.toResponse(k);
    }

    @Override
    public KtpResponse update(Integer id, KtpRequest request) {
        Ktp existing = repository.findById(id).orElseThrow(() -> new NotFoundException("Data KTP tidak ditemukan"));
        // cek uniqueness nomorKtp jika diubah
        if (!existing.getNomorKtp().equals(request.getNomorKtp()) && repository.existsByNomorKtp(request.getNomorKtp())) {
            throw new BadRequestException("nomorKtp sudah dipakai oleh data lain");
        }
        KtpMapper.updateEntity(existing, request);
        Ktp saved = repository.save(existing);
        return KtpMapper.toResponse(saved);
    }

    @Override
    public void delete(Integer id) {
        Ktp existing = repository.findById(id).orElseThrow(() -> new NotFoundException("Data KTP tidak ditemukan"));
        repository.delete(existing);
    }
}