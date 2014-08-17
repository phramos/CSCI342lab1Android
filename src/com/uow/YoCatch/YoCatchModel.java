package com.uow.YoCatch;

import java.util.ArrayList;

public class YoCatchModel {
	String username;
	private ArrayList<String> historyArray;

	public YoCatchModel() {
		super();
		historyArray = new ArrayList<String>();
	}

	public YoCatchModel(String username) {
		super();
		this.username = username;
		historyArray = new ArrayList<String>();
	}

	public String defaultYoMessage() {
		return "Yo " + this.username;
	}

	public void addToHistory(String word){
		this.historyArray.add(word);
	}
	
	public ArrayList<String > getHistoryArray(){
		return (ArrayList<String>) this.historyArray.clone();
	}
}
