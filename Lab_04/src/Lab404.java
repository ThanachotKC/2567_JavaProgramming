import java.util.*;
public class Lab404 {
 
	public static void main(String[] args) {
		inputstudent();
	}
	public static void inputstudent() {
Scanner input = new Scanner(System.in);
		
		String StudentID ;
		String SubjectID ;
		boolean isStudentID, isSubjectID;
		
		while(true) {
			System.out.print("Enter student ID (10 digits): ");
			StudentID = input.nextLine();
			
			System.out.print("Enter Subject code (7 digits): ");
			SubjectID = input.nextLine();
			
			isStudentID = isLenght(StudentID, 10);
			isSubjectID = isLenght(SubjectID, 7);
			
			if(isStudentID&&isSubjectID) {
				boolean isITStudent = isITStudent(StudentID);
				boolean isITSubject = isITSubject(SubjectID);
				displayData(isITStudent,isITSubject,StudentID);
				break;
			} else {
				System.out.println("");
			}
		}
	}
		
	public static boolean isLenght(String ID,int digits) {
		return ID.length()==digits;
	}
	public static boolean isITStudent(String ID) {
		return ID.substring(3,6).equals("311")&&ID.charAt(2)=='1';		
	}
	public static boolean isITSubject(String ID) {
		return ID.substring(0,2).equals("21")&&ID.charAt(4)=='1';		
	}
	public static void displayData(boolean stu, boolean sub, String ID) {
		if(stu) {
			System.out.println("Student id: " + ID +" 1st year student in IT");
		}else {
			System.out.println("Student id: " + ID +" is not 1st year student in IT");
		}
		if(sub) {
			System.out.println("Enroll in courses for Year 1");
		}else {
			System.out.println("not enroll in courses for Year 1");
		}
	}
 
 
}