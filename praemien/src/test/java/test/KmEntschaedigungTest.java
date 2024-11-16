package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import praemien.KmEntschaedigung;

class KmEntschaedigungTest {

	
	@Test
	void testKmEntschaedigung() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		assertNotNull(kmEntschaedigung);
		assertEquals(0, kmEntschaedigung.getKmEndschId());
		assertEquals(0, kmEntschaedigung.getKmEntschEinzelRennenId());
		assertEquals(0, kmEntschaedigung.getKmEntschPersonId());
		assertEquals(0, kmEntschaedigung.getKmEntschAnzahlFahrer());
		assertEquals(0.0, kmEntschaedigung.getKmEntschKmGeld(), 0.01);
		assertEquals(0, kmEntschaedigung.getKmEntschKm());
	}

	@Test
	void testKmEntschaedigungIntIntIntIntDoubleInt() {
		int kmEndschId = 1;
		int kmEntschEinzelRennenId = 101;
		int kmEntschPersonId = 202;
		int kmEntschAnzahlFahrer = 3;
		double kmEntschKmGeld = 50.0;
		int kmEntschKm = 100;
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung(kmEndschId, kmEntschEinzelRennenId, kmEntschPersonId,
				kmEntschAnzahlFahrer, kmEntschKmGeld, kmEntschKm);
		assertEquals(kmEndschId, kmEntschaedigung.getKmEndschId());
		assertEquals(kmEntschEinzelRennenId, kmEntschaedigung.getKmEntschEinzelRennenId());
		assertEquals(kmEntschPersonId, kmEntschaedigung.getKmEntschPersonId());
		assertEquals(kmEntschAnzahlFahrer, kmEntschaedigung.getKmEntschAnzahlFahrer());
		assertEquals(kmEntschKmGeld, kmEntschaedigung.getKmEntschKmGeld(), 0.01);
		assertEquals(kmEntschKm, kmEntschaedigung.getKmEntschKm());
	}

	@Test
	void testGetKmEndschId() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEndschId(1);
		assertEquals(1, kmEntschaedigung.getKmEndschId());
	}

	@Test
	void testSetKmEndschId() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEndschId(2);
		assertEquals(2, kmEntschaedigung.getKmEndschId());
	}

	@Test
	void testGetKmEntschEinzelRennenId() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschEinzelRennenId(101);
		assertEquals(101, kmEntschaedigung.getKmEntschEinzelRennenId());
	}

	@Test
	void testSetKmEntschEinzelRennenId() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschEinzelRennenId(102);
		assertEquals(102, kmEntschaedigung.getKmEntschEinzelRennenId());
	}

	@Test
	void testGetKmEntschPersonId() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschPersonId(202);
		assertEquals(202, kmEntschaedigung.getKmEntschPersonId());
	}

	@Test
	void testSetKmEntschPersonId() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschPersonId(203);
		assertEquals(203, kmEntschaedigung.getKmEntschPersonId());
	}

	@Test
	void testGetKmEntschAnzahlFahrer() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschAnzahlFahrer(3);
		assertEquals(3, kmEntschaedigung.getKmEntschAnzahlFahrer());
	}

	@Test
	void testSetKmEntschAnzahlFahrer() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschAnzahlFahrer(4);
		assertEquals(4, kmEntschaedigung.getKmEntschAnzahlFahrer());
	}

	@Test
	void testGetKmEntschKmGeld() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschKmGeld(50.0);
		assertEquals(50.0, kmEntschaedigung.getKmEntschKmGeld(), 0.01);
	}

	@Test
	void testSetKmEntschKmGeld() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschKmGeld(60.0);
		assertEquals(60.0, kmEntschaedigung.getKmEntschKmGeld(), 0.01);
	}

	@Test
	void testGetKmEntschKm() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschKm(100);
		assertEquals(100, kmEntschaedigung.getKmEntschKm());
	}

	@Test
	void testSetKmEntschKm() {
		KmEntschaedigung kmEntschaedigung = new KmEntschaedigung();
		kmEntschaedigung.setKmEntschKm(120);
		assertEquals(120, kmEntschaedigung.getKmEntschKm());
	}
}