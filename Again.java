package com.client;

import com.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Again implements EntryPoint {
	@Override
	public void onModuleLoad() {
		TextBox a = new TextBox();
		TextBox b = new TextBox();
		TextBox c = new TextBox();
		
		RootPanel.get("a").add(a);
		RootPanel.get("b").add(b);
		RootPanel.get("c").add(c);
		
		Button b1=new Button("Jadu");
		Button b2=new Button("Bhalu");
		
     	RootPanel.get("t1").add(b1);
     	RootPanel.get("t1").add(b2);
     	
     	b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("t2").clear();
				Jadu aa1= new Jadu();
				RootPanel.get("t2").add(aa1);		}
		});
		
     	
	b2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("t2").clear();
				Bhalu aa2= new Bhalu();
				RootPanel.get("t2").add(aa2);	  }
		});
     	
	}
  
}
