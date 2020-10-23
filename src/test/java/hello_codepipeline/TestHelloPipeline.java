package hello_codepipeline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hello.pipeline.HelloPipelineClass;

class TestHelloPipeline {

	@Test
	void testHello() {
		HelloPipelineClass instance = new HelloPipelineClass();
		String helloStr = instance.sayHello("World");
		assertEquals("Hello World", helloStr);
	}

}
