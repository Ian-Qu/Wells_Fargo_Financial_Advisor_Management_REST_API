package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.RiskProfile;
import com.wellsfargo.counselor.repository.RiskProfileRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RiskProfileService {
    private final RiskProfileRepository repository;
    public RiskProfileService(RiskProfileRepository repository) { this.repository = repository; }
    public List<RiskProfile> findAll() { return repository.findAll(); }
    public Optional<RiskProfile> findById(Long id) { return repository.findById(id); }
    public Optional<RiskProfile> findByClientId(Long clientId) { return repository.findByClient_ClientId(clientId); }
    public RiskProfile save(RiskProfile riskProfile) { return repository.save(riskProfile); }
    public void deleteById(Long id) { repository.deleteById(id); }
}
