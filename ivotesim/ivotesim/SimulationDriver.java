package ivotesim;
import java.util.Random; 

public class SimulationDriver{

	public static void main(String[] args) {

    	iVoteService vote = new iVoteService();
    	Question q = new Question();
    	Student s = new Student();
		
		System.out.println("Welcome to iVote Simulator - Sean Zahrae");	
		//generate a random question type
		System.out.println("SIM: Generating Random Question Type");	
		Random rand = new Random();
		q.setQuestionType(rand.nextInt(2));
		
		//Generate a random number of students
		System.out.println("SIM: Generating Random Number of students");	
		s.setNumStudents(rand.nextInt(20)+5);
		
		//set student's answers
		System.out.println("SIM: Setting Random student names and answers");	
	    for(int i = 0; i < s.getNumStudents(); i++){
	    	s.setStudentID();
	    	s.setStudentAnswer(q.getQuestionType());
	    	vote.setTable(s.getStudentID(), s.getStudentAnswer());
	    }
	    System.out.print("\n- Student Answers -");
	    vote.printStore();
	    
	    System.out.println("\n\n- Totals -");
	    vote.calculateTotals();
	}

}
