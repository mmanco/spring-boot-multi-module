package io.manco.maxim.sbmm.core.service;

import java.util.Collection;

import io.manco.maxim.sbmm.core.domain.MyEntity;

public interface EntityService {

	MyEntity save(MyEntity entity);
	
	MyEntity find(Long id);
	
	Collection<MyEntity> findAll();
	
}
