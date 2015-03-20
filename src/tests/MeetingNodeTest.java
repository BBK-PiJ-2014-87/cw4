package tests;

import static org.junit.Assert.*;
import interfaces.PastMeeting;
import logic.MeetingNode;

import org.junit.Before;
import org.junit.Test;

public class MeetingNodeTest {
	String note;
	
	@Before
	public void initialize(){
		note = "This is a note";
		PastMeeting newMeeting = new MeetingNode(null, null, note);
	}

	@Test
	public void testGetNotesDefault() {
		assertEquals(note, newMeeting.getNotes());
	}

}
