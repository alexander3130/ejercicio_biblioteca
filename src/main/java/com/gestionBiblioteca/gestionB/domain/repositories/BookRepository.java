package com.gestionBiblioteca.gestionB.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionBiblioteca.gestionB.domain.entities.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>{
  
}
