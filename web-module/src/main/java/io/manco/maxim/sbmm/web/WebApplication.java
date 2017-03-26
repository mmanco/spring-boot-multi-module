package io.manco.maxim.sbmm.web;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import io.manco.maxim.sbmm.core.CoreApplication;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
			.bannerMode(Banner.Mode.CONSOLE)
			.sources(CoreApplication.class, WebApplication.class)
			.run(args);
	}

}
