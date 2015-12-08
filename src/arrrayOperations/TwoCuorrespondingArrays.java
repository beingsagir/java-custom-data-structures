package arrrayOperations;

import java.util.ArrayList;
import java.util.Collections;

public class TwoCuorrespondingArrays {

	public static void main(String[] args) {
		
		ArrayList<Citizen> studentList = new ArrayList<Citizen>();
		
		studentList.add(new Citizen(25, "New York", "New Jersey"));
		studentList.add(new Citizen(20, "Detroit", "Atlanta"));
		studentList.add(new Citizen(50, "Chicago", "Los Angeles"));
		studentList.add(new Citizen(30, "Kolkata", "Delhi"));
		studentList.add(new Citizen(12, "Munmbai", "Baranasi"));
		studentList.add(new Citizen(11, "Bangalore", "Goa"));
		
		   
		   
		Collections.sort(studentList);
		   for(Citizen student: studentList){
				System.out.println(student);
		   }
	}

}
