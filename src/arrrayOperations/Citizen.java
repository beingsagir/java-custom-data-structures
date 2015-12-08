package arrrayOperations;

public class Citizen implements Comparable<Citizen>  {
	
	private int citizenId;
	private String subjectOne;
	private String subjectTwo;
	 
	
	public Citizen(int rollNumber, String subjectOne, String subjectTwo){
		this.citizenId = rollNumber;
		this.subjectOne = subjectOne;
		this.subjectTwo = subjectTwo;
	}
	
	public int getRollNumber() {
		return citizenId;
	}
	public void setRollNumber(int rollNumber) {
		this.citizenId = rollNumber;
	}
	public String getSubjectOne() {
		return subjectOne;
	}
	public void setSubjectOne(String subjectOne) {
		this.subjectOne = subjectOne;
	}
	public String getSubjectTwo() {
		return subjectTwo;
	}
	public void setSubjectTwo(String subjectTwo) {
		this.subjectTwo = subjectTwo;
	}
	
	
	 	public int compareTo(Citizen comparestu) {
	        int compareage=((Citizen)comparestu).getRollNumber();
	        /* For Ascending order*/
	        return this.citizenId-compareage;
	
	        /* For Descending order do like this */
	        //return compareage-this.studentage;
	    }
	
	    @Override
	    public String toString() {
	        return "[ rollno=" + citizenId + ", subjectOne=" + subjectOne + ", subjectTwo=" + subjectTwo + "]";
	    }

	
}
