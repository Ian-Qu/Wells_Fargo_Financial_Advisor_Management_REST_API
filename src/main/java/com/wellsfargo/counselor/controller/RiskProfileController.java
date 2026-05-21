package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.RiskProfile;
import com.wellsfargo.counselor.service.RiskProfileService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/risk-profiles")
public class RiskProfileController {
    private final RiskProfileService service;
    public RiskProfileController(RiskProfileService service) { this.service = service; }
    @GetMapping public List<RiskProfile> getAll() { return service.findAll(); }
    @GetMapping("/{id}") public RiskProfile getById(@PathVariable Long id) { return service.findById(id).orElse(null); }
    @GetMapping("/client/{clientId}") public RiskProfile getByClient(@PathVariable Long clientId) { return service.findByClientId(clientId).orElse(null); }
    @PostMapping public RiskProfile create(@RequestBody RiskProfile riskProfile) { return service.save(riskProfile); }
    @PutMapping("/{id}") public RiskProfile update(@PathVariable Long id, @RequestBody RiskProfile riskProfile) { return service.save(riskProfile); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.deleteById(id); }
}
