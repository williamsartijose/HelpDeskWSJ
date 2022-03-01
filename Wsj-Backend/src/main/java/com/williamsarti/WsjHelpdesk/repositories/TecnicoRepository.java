package com.williamsarti.WsjHelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamsarti.WsjHelpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
