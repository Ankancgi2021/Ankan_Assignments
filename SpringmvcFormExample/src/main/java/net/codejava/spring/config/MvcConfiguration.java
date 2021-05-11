package net.codejava.spring.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@ComponentScan(basePackages = "net.codejava.spring")
@EnableWebMvc
public class MvcConfiguration extendes WebMvcConfigurer{
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/**");
	}

}
