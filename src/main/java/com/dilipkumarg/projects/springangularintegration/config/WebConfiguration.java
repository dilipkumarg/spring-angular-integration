package com.dilipkumarg.projects.springangularintegration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/GeneralSpecifications.htm").addResourceLocations("/resources/GeneralSpecifications.htm");
        registry.addResourceHandler("/").addResourceLocations("classpath:/BOOT-INF/static/en/index.html");
        registry.addResourceHandler("/en/").addResourceLocations("classpath:/BOOT-INF/static/en/index.html");
        registry.addResourceHandler("/ar/").addResourceLocations("/ar/index.html");
        registry.addResourceHandler("/fr/").addResourceLocations("/fr/index.html");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/en/{spring:\\w+}")
                .setViewName("forward:/en/");
        registry.addViewController("/en/**/{spring:\\w+}")
                .setViewName("forward:/en/");
        registry.addViewController("/en/{spring:\\w+}/**{spring:?!(\\.js|\\.css)$}")
                .setViewName("forward:/en/");
    }
}
