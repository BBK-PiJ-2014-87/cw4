package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContactImplTest {
	
	@Before
	public void initialize(){
		Contact contact = new ContactImpl(name, notes);
	}

	@Test
	public void testAddNotesDefault() {
		String note = "This is a note about this contact.";
		contact.addNotes(note);
		assertEquals(cont. contact.getNotes());
	}
	
	@Test
	public void testAddNotesEmptyString() {
		String note = "";
		contact.addNotes(note);
		assertEquals(cont.)
		assertEquals(note, contact.getNotes());
	}
	
	@Test
	public void testAddNotesNull() {
		String note = null;
		contact.addNotes(note);
		assertNull(contact.getNotes());
	}

}
