import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Student{
	String name;
	String grade;
	String gender;
	String major;
	String state;
	public Student(String n, String g, String ge, String m, String s){
		name = n;
		grade = g;
		gender = ge;
		major = m;
		state = s;
	}
}

public class LOL {
	public static void main(String[] args){
		System.out.println("Enter: ");
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, ArrayList<Double>> genderGPA = new HashMap<String, ArrayList<Double>>();
		HashMap<String, ArrayList<Double>> majorGPA = new HashMap<String, ArrayList<Double>>();
		HashMap<String, ArrayList<Double>> stateGPA = new HashMap<String, ArrayList<Double>>();
		int sum = 0;
		double totalGPA = 0;
		
		List<Student> list = new ArrayList<Student>();
		String name = "";
		String grade = "";
		String gender = "";
		String major = "";
		String state = "";
		String res = "";
		int count = 0;
		while(sc.hasNext()){
			res = sc.next();
			if(res.equalsIgnoreCase("y")){
				System.out.println("Finish entering.");
				break;
			}
			if(count == 0){
				name = res;
			}else if(count == 1){
				grade = res;
			}else if(count == 2){
				gender = res;
			}else if(count == 3){
				 major = res;
			}else if(count == 4){
				state = res;
			}
			
			count++;
			if(count ==5){
				// to store student information
				Student s = new Student(name, grade, gender, major, state);
				list.add(s);
				count = 0;
				
				// to count overall gpa, gender gpa, major gpa and state gpa
				double gpa = countGPA(grade);
				sum++;
				totalGPA += gpa;
				if(genderGPA.containsKey(gender)){
					genderGPA.get(gender).add(gpa);
				}else{
					ArrayList<Double> tmp = new ArrayList<Double>();
					tmp.add(gpa);
					genderGPA.put(gender, tmp);
				}
				
				if(majorGPA.containsKey(major)){
					majorGPA.get(major).add(gpa);
				}else{
					ArrayList<Double> tmp = new ArrayList<Double>();
					tmp.add(gpa);
					majorGPA.put(major, tmp);
				}
				
				if(stateGPA.containsKey(state)){
					stateGPA.get(state).add(gpa);
				}else{
					ArrayList<Double> tmp = new ArrayList<Double>();
					tmp.add(gpa);
					stateGPA.put(state, tmp);
				}
			}
		}
		sc.close();
		
		System.out.println("Printing students information: ");
		for(int i = 0; i < list.size(); i++){
			Student s = list.get(i);
			System.out.println(s.name + " " + s.grade + " " + s.gender + " " + s.major + " " + s.state);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Printing GPA information: ");
		System.out.println("Overall Average: " + totalGPA / sum);
		for(String s : genderGPA.keySet()){
			double tmp = 0;
			for(Double d : genderGPA.get(s)){
				tmp += d;
			}
			System.out.println("Average for Gender: " + s + " is: " + tmp / genderGPA.get(s).size());
		}
		
		for(String s : majorGPA.keySet()){
			double tmp = 0;
			for(Double d : majorGPA.get(s)){
				tmp += d;
			}
			System.out.println("Average for Major: " + s + " is: " + tmp / majorGPA.get(s).size());
		}
		
		for(String s : stateGPA.keySet()){
			double tmp = 0;
			for(Double d : stateGPA.get(s)){
				tmp += d;
			}
			System.out.println("Average for State: " + s + " is: " + tmp / stateGPA.get(s).size());
		}
		
		System.out.println("Game Over.");
	}       
	
	
	private static double countGPA(String s){
		switch(s){
		case "A":
		case "a":
			return 4.0;
		case "B":
		case "b":
			return 3.0;
		case "C":
		case "c":
			return 2.0;
		default:
			return 1.0;
		}
	}
}