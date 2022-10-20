package com.alkemy.ong;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.alkemy.ong.security.configuration.SecurityConfiguration;
import com.alkemy.ong.utils.OpenAPISecurityConfiguration;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.context.annotation.Import;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(OngApplication.class)
@Import({SecurityConfiguration.class, BCryptPasswordEncoder.class, OpenAPISecurityConfiguration.class})
class OngApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

}
