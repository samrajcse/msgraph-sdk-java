package com.microsoft.graph.functional;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.gson.JsonObject;
import com.microsoft.graph.models.extensions.User;

/**
 * Tests for sending custom requests using the SDK
 */
@Ignore
public class CustomRequestTests {
	private TestBase testBase;

	@Before
	public void setUp() {
		testBase = new TestBase();
	}

	/**
	 * Test GET with a custom request for both serialized and JSON content
	 */
	@Test
	public void testCustomGet() {
		User meOriginal = testBase.graphClient.me().buildRequest().get();

		User meGraphService = testBase.graphClient
				.customRequest("/me", User.class)
				.buildRequest()
				.get();

		JsonObject meJson = testBase.graphClient
				.customRequest("/me")
				.buildRequest()
				.get();

		assertEquals(meGraphService.displayName, meOriginal.displayName);
		assertEquals(meJson.get("displayName").getAsString(), meOriginal.displayName);
	}
}
