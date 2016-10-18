package ivotesim;

import java.util.HashSet;
import java.util.Random; 

public class Student{
	
	private int numStudents;
	private String studentID;
	private String studentAnswer;
	Random rand = new Random();

	 public void setNumStudents(int number){
		this.numStudents = number;
	}

	 public int getNumStudents(){
		return numStudents;
	}
	
	 HashSet<String> hash = new HashSet<>(getNumStudents());
	
	//Generate random ID for student
	public void setStudentID(){
		studentID = "Student " + "008061" + rand.nextInt(9);
	}
	
	public String getStudentID(){
		return studentID;
	}
	
	//Generate student answer
 	public void setStudentAnswer(int i){
 		if(i == 0){
 			//generate abcd answer
 			String[] abcdanswers = {"A", "B", "C", "D"};
 	 		studentAnswer = abcdanswers[rand.nextInt(abcdanswers.length)];
 		} 			
 		else{
 			//generate single choice answer
 			String[] singleanswers = {"R", "W"};
 	 		studentAnswer = singleanswers[rand.nextInt(singleanswers.length)];
 		}
 	}

 	public String getStudentAnswer(){
 		return studentAnswer;
 	}	
}






