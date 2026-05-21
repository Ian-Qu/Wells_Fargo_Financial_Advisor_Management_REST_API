package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false)
    private LocalDate creationDate;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    @OneToMany(mappedBy = "portfolio")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "portfolio")
    private List<PortfolioPerformanceReport> performanceReports;

    protected Portfolio() {
    }

    public Portfolio(Client client, LocalDate creationDate, List<Security> securities, List<Transaction> transactions, List<PortfolioPerformanceReport> performanceReports) {
        this.client = client;
        this.creationDate = creationDate;
        this.securities = securities;
        this.transactions = transactions;
        this.performanceReports = performanceReports;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<PortfolioPerformanceReport> getPerformanceReports() {
        return performanceReports;
    }

    public void setPerformanceReports(List<PortfolioPerformanceReport> performanceReports) {
        this.performanceReports = performanceReports;
    }
}