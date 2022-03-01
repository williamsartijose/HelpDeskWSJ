package com.williamsarti.WsjHelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamsarti.WsjHelpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
