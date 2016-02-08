package io.manco.maxim.sbmm.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.manco.maxim.sbmm.core.domain.MyEntity;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {

	
	
}
