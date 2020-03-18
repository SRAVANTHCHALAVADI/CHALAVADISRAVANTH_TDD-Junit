package com.epam;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveAInFirstTwoCharactersTest {

	@Test
	public void testRemoveA() {
		RemoveAInFirstTwoCharacters test1stchar =new RemoveAInFirstTwoCharacters();
		assertEquals("bad",test1stchar.removeA("abad"));
	}
	@Test
	public void testRemoveA1() {
		RemoveAInFirstTwoCharacters test2stchar =new RemoveAInFirstTwoCharacters();
		assertEquals("bd",test2stchar.removeA("bad"));
	}
	@Test
	public void testRemoveA2() {
		RemoveAInFirstTwoCharacters testbothchar =new RemoveAInFirstTwoCharacters();
		assertEquals("bda",testbothchar.removeA("AAbda"));
	}
	@Test
	public void testRemoveA3() {
		RemoveAInFirstTwoCharacters testnochar =new RemoveAInFirstTwoCharacters();
		assertEquals("bda",testnochar.removeA("bda"));
	}

}
