package com.team2.usuarioservice.repository;

import com.team2.usuarioservice.entity.Coordinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinadorRepository extends JpaRepository <Coordinador, Long> {
}
