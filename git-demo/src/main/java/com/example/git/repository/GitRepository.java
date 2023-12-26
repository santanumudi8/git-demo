package com.example.git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.git.entity.GitEntity;

public interface GitRepository extends JpaRepository<GitEntity, Long>{

}
