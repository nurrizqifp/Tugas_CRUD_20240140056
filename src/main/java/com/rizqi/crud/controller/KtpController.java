package com.rizqi.crud.controller;

import com.rizqi.crud.dto.KtpRequest;
import com.rizqi.crud.dto.KtpResponse;
import com.rizqi.crud.service.KtpService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ktp")
@CrossOrigin(origins = "*")
public class KtpController {

    private final KtpService service;

    public KtpController(KtpService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<KtpResponse> create(@Valid @RequestBody KtpRequest request) {
        KtpResponse resp = service.create(request);
        return ResponseEntity.status(201).body(resp);
    }

    @GetMapping
    public ResponseEntity<List<KtpResponse>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<KtpResponse> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<KtpResponse> update(@PathVariable Integer id, @Valid @RequestBody KtpRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.ok(Map.of("message", "Data berhasil dihapus"));
    }
}