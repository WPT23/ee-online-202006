package com.wpt.jpa.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RelationshipTest {
static EntityManagerFactory emf;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	emf=Persistence.createEntityManagerFactory("relationships");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	emf.close();
	}

	@Test
	void test() {
	
	}

}
