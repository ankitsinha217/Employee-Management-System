package net.javaguides.springboot.dto;

import java.util.Date;

import org.h2.api.Interval;

import com.sun.el.parser.ParseException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserRegistrationDto {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
    private String starttime;
	private String endtime;
	private String interval;
	
	public String getStarttime() {
		Date date2 = (Date) Calendar.getInstance().getTime();  
		DateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String strDate2 = dateFormat2.format(date2);
		Date date1 = (Date) Calendar.getInstance().getTime();  
		DateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		String strDate1 = dateFormat1.format(date1);
		if(strDate1!=null)
		{
			//this.interval=(strDate2 - strDate1);
			//Interval interval = new Interval(strDate1, strDate2);
		}
		this.starttime=strDate1;
		System.out.println("strDate---:"+strDate1);
		return starttime;
	}
	public void setStarttime(String starttime) {
	
		this.starttime=starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime=endtime;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}
	
	

	public UserRegistrationDto(){
		
	}

	

	
	public UserRegistrationDto(String firstName, String lastName, String email, String password, String starttime,
			String endtime, String interval) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.starttime = starttime;
		this.endtime = endtime;
		this.interval = interval;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
