package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Transaction;
import com.wellsfargo.counselor.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    private final TransactionRepository repository;
    public TransactionService(TransactionRepository repository) { this.repository = repository; }
    public List<Transaction> findAll() { return repository.findAll(); }
    public Optional<Transaction> findById(Long id) { return repository.findById(id); }
    public Transaction save(Transaction transaction) { return repository.save(transaction); }
    public void deleteById(Long id) { repository.deleteById(id); }
    public List<Transaction> findByPortfolioId(Long portfolioId) { return repository.findByPortfolio_PortfolioId(portfolioId); }
}
