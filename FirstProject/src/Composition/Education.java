package Composition;

public class Education {
	String[] schools;
	
	public Education(){
		schools = new String[10];
	}
	
	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		str.append("last 10 schools attended: ");
		for(String s : schools){
			str.append(s).append(" ");
		}
		return str.toString().trim();
	}
}
