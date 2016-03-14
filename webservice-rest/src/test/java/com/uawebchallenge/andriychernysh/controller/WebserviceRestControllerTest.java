package com.uawebchallenge.andriychernysh.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(MockitoJUnitRunner.class)
public class WebserviceRestControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    private WebserviceRestController webserviceRestController;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(webserviceRestController).build();
    }

    @Test
    public void testHelloWorld() throws Exception {
        mockMvc.perform(get("/WebserviceRest/helloWorld"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World"));
    }
}
