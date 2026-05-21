package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class RiskProfile {

    @Id
    @GeneratedValue
    private Long riskProfileId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false, unique = true)
    private Client client;

    @Column(nullable = false)
    private String riskTolerance;

    @Column(nullable = false)
    private String investmentHorizon;

    @Column(nullable = false)
    private String liquidityNeeds;

    protected RiskProfile() {
    }

    public RiskProfile(Client client, String riskTolerance, String investmentHorizon, String liquidityNeeds) {
        this.client = client;
        this.riskTolerance = riskTolerance;
        this.investmentHorizon = investmentHorizon;
        this.liquidityNeeds = liquidityNeeds;
    }

    public Long getRiskProfileId() {
        return riskProfileId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getRiskTolerance() {
        return riskTolerance;
    }

    public void setRiskTolerance(String riskTolerance) {
        this.riskTolerance = riskTolerance;
    }

    public String getInvestmentHorizon() {
        return investmentHorizon;
    }

    public void setInvestmentHorizon(String investmentHorizon) {
        this.investmentHorizon = investmentHorizon;
    }

    public String getLiquidityNeeds() {
        return liquidityNeeds;
    }

    public void setLiquidityNeeds(String liquidityNeeds) {
        this.liquidityNeeds = liquidityNeeds;
    }
}