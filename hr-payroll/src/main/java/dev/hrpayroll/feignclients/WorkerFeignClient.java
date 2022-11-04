package dev.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dev.hrpayroll.entities.Worker;

// Parâmetros do FeignClient
//      Name -> Nome do projeto que iremos comunicar
//      Path -> Caminho do endpoint que iremos comunicar
@Component
@FeignClient(name = "hr-worker", url= "localhost:8001", path = "/workers") 
public interface WorkerFeignClient {

    // GET /workers/{id}
    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id);
}
