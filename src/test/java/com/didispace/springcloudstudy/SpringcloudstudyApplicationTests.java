package com.didispace.springcloudstudy;

import com.didispace.springcloudstudy.web.HelloController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class SpringcloudstudyApplicationTests {
	private MockMvc mvc;

	@BeforeEach
	/**
	 * @Before, @BeforeClass, @BeforeEach 和 @BeforeAll之间的不同
	 * https://blog.csdn.net/iexploration/article/details/82023893
	 */
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	@Test
	public void hello() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/hello") .accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello World1")));
	}

}
