package dev.hrpayroll.services;

import org.springframework.stereotype.Service;

import dev.hrpayroll.entities.Payment;

@Service
public class PaymentService {
    
    public Payment getPayment(long workerId, int days) {
        // Buscar o Id do trabalhador no banco de dados
        // Inicialmente dado mockado
        return new Payment("Bob", 200.0, days);
    }
}
