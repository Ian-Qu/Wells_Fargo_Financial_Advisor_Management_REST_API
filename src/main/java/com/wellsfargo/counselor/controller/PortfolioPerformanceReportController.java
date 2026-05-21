package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.PortfolioPerformanceReport;
import com.wellsfargo.counselor.service.PortfolioPerformanceReportService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/performance-reports")
public class PortfolioPerformanceReportController {
    private final PortfolioPerformanceReportService service;
    public PortfolioPerformanceReportController(PortfolioPerformanceReportService service) { this.service = service; }
    @GetMapping public List<PortfolioPerformanceReport> getAll() { return service.findAll(); }
    @GetMapping("/{id}") public PortfolioPerformanceReport getById(@PathVariable Long id) { return service.findById(id).orElse(null); }
    @GetMapping("/portfolio/{portfolioId}") public List<PortfolioPerformanceReport> getByPortfolio(@PathVariable Long portfolioId) { return service.findByPortfolioId(portfolioId); }
    @PostMapping public PortfolioPerformanceReport create(@RequestBody PortfolioPerformanceReport report) { return service.save(report); }
    @PutMapping("/{id}") public PortfolioPerformanceReport update(@PathVariable Long id, @RequestBody PortfolioPerformanceReport report) { return service.save(report); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.deleteById(id); }
}
