package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class PortfolioPerformanceReport {

    @Id
    @GeneratedValue
    private Long reportId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private LocalDate reportDate;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal totalValue;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal totalGainLoss;

    @Column(nullable = false, precision = 10, scale = 4)
    private BigDecimal returnPercentage;

    protected PortfolioPerformanceReport() {
    }

    public PortfolioPerformanceReport(Portfolio portfolio, LocalDate reportDate, BigDecimal totalValue, BigDecimal totalGainLoss, BigDecimal returnPercentage) {
        this.portfolio = portfolio;
        this.reportDate = reportDate;
        this.totalValue = totalValue;
        this.totalGainLoss = totalGainLoss;
        this.returnPercentage = returnPercentage;
    }

    public Long getReportId() {
        return reportId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public BigDecimal getTotalGainLoss() {
        return totalGainLoss;
    }

    public void setTotalGainLoss(BigDecimal totalGainLoss) {
        this.totalGainLoss = totalGainLoss;
    }

    public BigDecimal getReturnPercentage() {
        return returnPercentage;
    }

    public void setReturnPercentage(BigDecimal returnPercentage) {
        this.returnPercentage = returnPercentage;
    }
}