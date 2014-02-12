package studentbooking;

import java.util.ArrayList;

public class Session {

	private int sessionID;
	private String courseName;
	private String lecturerName;
	private String startTime;
	private String endTime;
	private String venue;
	private String compulsory;
	
	ArrayList<Session> sessionList;
	
	
	
	public Session(int sessionID, String courseName, String lecturerName,
			String startTime, String endTime, String venue, String compulsory) {
		super();
		this.sessionID = sessionID;
		this.courseName = courseName;
		this.lecturerName = lecturerName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.venue = venue;
		this.compulsory = compulsory;
	}

	public int getSessionID() {
		return sessionID;
	}

	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLecturerName() {
		return lecturerName;
	}

	public void setLecturerName(String lecturerName) {
		this.lecturerName = lecturerName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getCompulsory() {
		return compulsory;
	}

	public void setCompulsory(String compulsory) {
		this.compulsory = compulsory;
	}
	
	
}
