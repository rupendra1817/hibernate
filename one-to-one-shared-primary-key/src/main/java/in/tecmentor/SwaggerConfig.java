package in.tecmentor;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SwaggerConfig.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	/**
	 * Api.
	 *
	 * @return the docket
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("in.tecmentor")).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());
	}

	/**
	 * Api info.
	 *
	 * @return the api info
	 */
	private ApiInfo apiInfo() {
		return new ApiInfo("one-to-one shared primary key", "API related to one-to-one shared primary key example.",
				"Spring Boot Simple Demo", "Terms of service",
				new Contact("Deepak Mishra", "https://www.tecmentor.in", "deepakrock786@gmail.com"), "License of API",
				"API license URL", Collections.emptyList());
	}
}