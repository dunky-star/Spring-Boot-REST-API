package com.dunky.api.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //return new Class[0];
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //return new Class[0];
        return new Class[] {DemoAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // return new String[0];
        return new String[] {"/"};
    }
}
