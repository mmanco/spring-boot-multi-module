package io.manco.maxim.sbmm.core;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

@Rollback
@Transactional
@ActiveProfiles({"embeddeddb"})
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners(TransactionalTestExecutionListener.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE, classes = CoreApplication.class)
public abstract class ContextAwareTest extends AbstractJUnit4SpringContextTests { } 
