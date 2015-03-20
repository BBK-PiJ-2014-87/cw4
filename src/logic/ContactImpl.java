package logic;

import interfaces.Contact;

public class ContactImpl implements Contact{
	private static int count;
	private int id;
	private String name;
	private String notes;
	
	/**
	 * Creates a contact with a unique id, which is equals to
	 * instance total count on the moment of creation.
	 * 
	 * @param name of the contact
	 * @param notes about the contact
	 */
	public ContactImpl(String name,String notes){
		this.name = name;
		this.notes = notes;
		count++;
		id = count;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	/* Returns empty string if notes are null.
	 * @see interfaces.Contact#getNotes()
	 */
	@Override
	public String getNotes() {
		if(notes == null)
			notes = "";
		return notes;
	}

	@Override
	public void addNotes(String note) {
		notes = note;
	}

}
