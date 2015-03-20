package tests;

import static org.junit.Assert.*;
import interfaces.ContactManager;
import interfaces.FutureMeeting;
import interfaces.Meeting;
import interfaces.PastMeeting;

import java.util.Calendar;
import java.util.List;
import java.util.Set;

import logic.ContactManagerImpl;

import org.junit.Before;
import org.junit.Test;

public class ContactManagerImplTest {
	PastMeeting pastM;
	FutureMeeting futureM;
	Contact contact;
	Calendar date;
	

	@Before
	public void initialize(){
		ContactManager manager = new ContactManagerImpl();
		contact = new ContactImpl(name, notes);
		date = Calendar.getInstance();
		pastM = new MeetingNode(contact, date, notes);
		futureM = new MeetingNode(contact, date);
	}

	@Test
	public void testAddFutureMeetingDefault() {
		manager.addFutureMeeting(contacts, date);
	}
	
	@Test
	public void testGetPastMeeting() {
		int meetingId = 1;
		PastMeeting result = manager.getPastMeeting(meetingId);
		assertEquals(pastM, result);
	}
	
	@Test
	public void testGetFutureMeeting() {
		int meetingId = 2;
		PastMeeting result = manager.getPastMeeting(meetingId);
		assertEquals(futureM, result);
	}
	
	@Test
	public void testGetMeeting() {
		int meetingId = 2;
		Meeting result = manager.getMeeting(meetingId);
		assertEquals(futureM, result);
	}
	
	@Test
	public void testGetFutureMeetingList() {
		int meetingId = 2;
		List<Meeting> result = manager.getFutureMeetingList(contact);
		assertEquals(futureM, result);
	}

}
