package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Jadu extends Composite {

	private static JaduUiBinder uiBinder = GWT.create(JaduUiBinder.class);

	interface JaduUiBinder extends UiBinder<Widget, Jadu> {
	}

	public Jadu() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	@UiField
	TextBox t1;
	
	@UiField
	TextBox t2;
	
	@UiField
	TextBox t3;

	private Button button;

	
	
	
	public Jadu(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	
		button.setText("firstName");
		
	}
	
	
	@UiHandler("button")
    void onClick(ClickEvent e)
	{
		Window.alert("hello");
	}
	
	public void setText(String text)
	{
		button.setText(text);
	}
	
	public String getText()
	{
		return button.getText();
	}
}
