package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Home {
	private String owner;
	private int doorNo;
	
	@Autowired
	@Qualifier("a")
	private InternetConnection modem;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public void connect()
	{
		modem.switchOn();
		System.out.println("*** Connecting to Internet ***");
	}

}
