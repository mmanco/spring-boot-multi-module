package io.manco.maxim.sbmm.core.service;


import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import io.manco.maxim.sbmm.core.ContextAwareTest;
import io.manco.maxim.sbmm.core.domain.MyEntity;

public class EntityServiceIntegrationTest extends ContextAwareTest {

	@Autowired
	private EntityService service;
	
	@Test
	@Rollback
	@Transactional(readOnly = false)
	public void save() {
		MyEntity entity = new MyEntity("test", "test");
		assertThat(entity.getId(), nullValue());
		entity = service.save(entity);
		assertThat(entity.getId(), notNullValue());
	}
	
	@Test
	@Rollback
	@Transactional(readOnly = false)
	public void find() {
		MyEntity entity = service.save(new MyEntity("test", "test"));
		entity = service.find(entity.getId());
		assertThat(entity, notNullValue());
	}
	
	@Test
	@Rollback
	@Transactional(readOnly = false)
	public void findAll() {
		Collection<MyEntity> entities = new ArrayList<>();
		entities.add(service.save(new MyEntity("test", "test")));
		entities.add(service.save(new MyEntity("test2", "test")));
		entities.add(service.save(new MyEntity("test3", "test")));
		Collection<MyEntity> all = service.findAll();
		assertThat(all, equalTo(entities));
	}
	
}
