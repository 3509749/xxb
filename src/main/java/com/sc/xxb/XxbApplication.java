package com.sc.xxb;

import com.github.pagehelper.PageHelper;
import com.sc.xxb.base.mapper.JsonObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.Properties;

@SpringBootApplication
public class XxbApplication {

	public static void main(String[] args) {
		SpringApplication.run(XxbApplication.class, args);
	}

	@Bean
	public PageHelper pageHelper(){
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum","true");
		properties.setProperty("rowBoundsWithCount","true");
		properties.setProperty("reasonable","true");
		properties.setProperty("dialect","oracle");
		pageHelper.setProperties(properties);
		return pageHelper;
	}
	@Bean
	public MappingJackson2HttpMessageConverter mappingJacksonHttpMessageConverter() {
		final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		JsonObjectMapper mapper = new JsonObjectMapper();
		converter.setObjectMapper(mapper);
		return converter;
	}
}
