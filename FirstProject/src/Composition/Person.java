package Composition;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education edu;

	public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        edu = new Education();
    }
    public long getSalary() {
        return job.getSalary();
    }
    
    public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Education getEdu() {
		return edu;
	}
	public void setEdu(Education edu) {
		this.edu = edu;
	}
    
    @Override
    public String toString(){
    	return job.toString() + " " + edu.toString();
    }
}