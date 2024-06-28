package org.jsp.springDI;

public class Person {

	private PanCard pancard;
	
	public Person() {
		
	}

	public Person(PanCard pancard) {
		this.pancard = pancard;
	}

	public PanCard getPancard() {
		return pancard;
	}

	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}
	
	
	
}
