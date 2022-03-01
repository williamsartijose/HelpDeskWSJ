package com.williamsarti.WsjHelpdesk.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.williamsarti.WsjHelpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
