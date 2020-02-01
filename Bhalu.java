package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Bhalu extends Composite {

	private static BhaluUiBinder uiBinder = GWT.create(BhaluUiBinder.class);

	interface BhaluUiBinder extends UiBinder<Widget, Bhalu> {
	}

	public Bhalu() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiField
	Button button;
	
	@UiField
	Button b2;
	
	public Bhalu(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	    button.setText(firstName);
	}
	
	@UiHandler("button")
	void onClick(ClickEvent e)
	{
		
		Window.alert("Hello");
	}
}
