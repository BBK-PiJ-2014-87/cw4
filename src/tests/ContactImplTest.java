package tests;

import static org.junit.Assert.*;
import interfaces.Contact;

import org.junit.Before;
import org.junit.Test;

public class ContactImplTest {
	Contact person1;
	Contact person2;
	Contact person3;
	String note1;
	String note2;
	
	@Before
	public void initialize(){
		String name = "Jhon Jhonson"; 	//name of the person
		note1 = "";						//empty string comment
		note2 = "Test note";			//normal comment
		person1 = new ContactImpl(name, note1);
		person2 = new ContactImpl(name, note2);
		person3 = new ContactImpl(name, null);	//comment is set to Null
	}

	/**
	 * Tests default behavior of the method.
	 */
	@Test
	public void testGetNotesDefault() {
		assertEquals(note1, person1.getNotes());
		assertEquals(note2, person2.getNotes());
	}
	
	/**
	 * Tests if method returns empty string if notes are set to null.
	 */
	@Test
	public void testGetNotesNull() {
		assertNotNull(person3.getNotes());
		assertEquals(note1, person3.getNotes());
	}
	
	/**
	 * Tests if IDs of contacts are set correctly.
	 * Unique ID of the contact equals to a total count number value on the moment
	 * of creating it.
	 */
	@Test
	public void testGetId() {
		assertEquals(1, person1.getId());
		assertEquals(2, person1.getId());
		assertEquals(3, person3.getId());
		
	}
}