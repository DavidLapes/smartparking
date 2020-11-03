package org.dlj.smartparking;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SmartBoot.class)
abstract class AbstractTestConfig {

}
