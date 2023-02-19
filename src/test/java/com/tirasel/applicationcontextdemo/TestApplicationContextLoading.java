package com.tirasel.applicationcontextdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
public class TestApplicationContextLoading {

    @Autowired
    MyBean myBean;

    @Test
    public void getApplicationContext_ShouldReturnApplicationContext(){
        assertThat(myBean).isNotNull();
        ApplicationContext applicationContext = myBean.getApplicationContext();
        assertThat(applicationContext).isNotNull();

    }

    @Test
    void whenGetApplicationContext_thenReturnApplicationContext() {
        ApplicationContext context = ApplicationContextProvider.getApplicationContext();
        assertThat(context).isNotNull();
    }
}
