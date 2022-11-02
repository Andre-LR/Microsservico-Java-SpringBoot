package dev.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    
}
