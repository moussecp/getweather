package com.github.moussecp.weather.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HermesWebAppInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    //the configuration classes for the root application context
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    //the configuration classes for the dispatcher servlet application context
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
