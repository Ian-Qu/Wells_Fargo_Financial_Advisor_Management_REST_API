package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.PortfolioPerformanceReport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PortfolioPerformanceReportRepository extends JpaRepository<PortfolioPerformanceReport, Long> {
    List<PortfolioPerformanceReport> findByPortfolio_PortfolioId(Long portfolioId);
}
