package com.kmpx.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmpx.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
