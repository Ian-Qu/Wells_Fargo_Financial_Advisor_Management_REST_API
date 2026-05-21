package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.PortfolioPerformanceReport;
import com.wellsfargo.counselor.repository.PortfolioPerformanceReportRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PortfolioPerformanceReportService {
    private final PortfolioPerformanceReportRepository repository;
    public PortfolioPerformanceReportService(PortfolioPerformanceReportRepository repository) { this.repository = repository; }
    public List<PortfolioPerformanceReport> findAll() { return repository.findAll(); }
    public Optional<PortfolioPerformanceReport> findById(Long id) { return repository.findById(id); }
    public List<PortfolioPerformanceReport> findByPortfolioId(Long portfolioId) { return repository.findByPortfolio_PortfolioId(portfolioId); }
    public PortfolioPerformanceReport save(PortfolioPerformanceReport report) { return repository.save(report); }
    public void deleteById(Long id) { repository.deleteById(id); }
}
