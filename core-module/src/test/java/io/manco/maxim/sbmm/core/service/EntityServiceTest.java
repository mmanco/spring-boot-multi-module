package io.manco.maxim.sbmm.core.service;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import io.manco.maxim.sbmm.core.domain.MyEntity;
import io.manco.maxim.sbmm.core.repository.MyEntityRepository;

public class EntityServiceTest {

	@Mock
	private MyEntityRepository repository;
	
	@InjectMocks
	private MyEntityServiceImpl service;
	
	@Before
	public void initialize() {
		initMocks(this);
	}
	
	@Test
	public void save() {
		MyEntity entity = new MyEntity("test", "test");
		service.save(entity);
		verify(repository).save(entity);
	}
	
	@Test
	public void find() {
		Long id = 1L;
		service.find(id);
		verify(repository).findOne(id);
	}
	
	@Test
	public void findAll() {
		service.findAll();
		verify(repository).findAll();		
	}
	
}
