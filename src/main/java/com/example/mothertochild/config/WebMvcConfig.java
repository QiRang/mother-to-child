package com.example.mothertochild.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

//@EnableWebMvc
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

//    @Bean
//    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
//        RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
//
//        List<HttpMessageConverter<?>> converters = adapter.getMessageConverters();
//
//        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
//        List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
//        MediaType textMedia = new MediaType(MediaType.TEXT_PLAIN, Charset.forName("UTF-8"));
//        supportedMediaTypes.add(textMedia);
//        MediaType jsonMedia = new MediaType(MediaType.APPLICATION_JSON, Charset.forName("UTF-8"));
//        supportedMediaTypes.add(jsonMedia);jsonConverter.setSupportedMediaTypes(supportedMediaTypes);
//
//        converters.add(jsonConverter);
//
//
//        adapter.setMessageConverters(converters);
//
//        return adapter;
//    }

//    public void addCorsMappings(CorsRegistry registry) {
//        System.out.println("----------------------");
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowCredentials(true)
//                .allowedMethods("GET", "POST", "DELETE", "PUT")
//                .maxAge(3600);
//    }
}