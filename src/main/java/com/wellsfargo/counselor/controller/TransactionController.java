package com.wellsfargo.counselor.controller;

import com.wellsfargo.counselor.entity.Transaction;
import com.wellsfargo.counselor.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService service;
    public TransactionController(TransactionService service) { this.service = service; }
    @GetMapping public List<Transaction> getAll() { return service.findAll(); }
    @GetMapping("/{id}") public Transaction getById(@PathVariable Long id) { return service.findById(id).orElse(null); }
    @GetMapping("/portfolio/{portfolioId}") public List<Transaction> getByPortfolio(@PathVariable Long portfolioId) { return service.findByPortfolioId(portfolioId); }
    @PostMapping public Transaction create(@RequestBody Transaction transaction) { return service.save(transaction); }
    @PutMapping("/{id}") public Transaction update(@PathVariable Long id, @RequestBody Transaction transaction) { transaction.setTransactionDate(transaction.getTransactionDate()); return service.save(transaction); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.deleteById(id); }
}
