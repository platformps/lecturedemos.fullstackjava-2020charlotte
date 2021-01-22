package com.github.perscholas;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by leon on 9/15/2020.
 */
public class ControllerInterceptorMvcConfigurator implements WebMvcConfigurer {

    //    @Autowired
    private ControllerInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor)
                .addPathPatterns("/**/**/");
    }
}