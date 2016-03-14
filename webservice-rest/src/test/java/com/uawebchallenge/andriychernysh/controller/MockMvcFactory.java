package com.uawebchallenge.andriychernysh.controller;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class MockMvcFactory {

    public static MockMvc createMockMvc(final Object controller) {
        return MockMvcBuilders.standaloneSetup(controller)
                //.setCustomArgumentResolvers(getPageableHandlerMethodArgumentResolver())
                //.setViewResolvers((viewName, locale) -> new MappingJackson2JsonView())
                //.setMessageConverters(new MappingJackson2HttpMessageConverter(buildObjectMapper()))
                .build();

    }

    private static ObjectMapper buildObjectMapper() {
        return new Jackson2ObjectMapperBuilder()
                .featuresToDisable(
                        MapperFeature.DEFAULT_VIEW_INCLUSION, SerializationFeature.WRITE_DATES_AS_TIMESTAMPS
                )
                .createXmlMapper(false)
                .build();
    }
}
