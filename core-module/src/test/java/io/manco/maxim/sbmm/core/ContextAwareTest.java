package io.manco.maxim.sbmm.core;

import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

@Rollback
@Transactional
@IntegrationTest
@ActiveProfiles({"core", "core-test"})
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(CoreApplication.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
public abstract class ContextAwareTest extends AbstractJUnit4SpringContextTests { } 
