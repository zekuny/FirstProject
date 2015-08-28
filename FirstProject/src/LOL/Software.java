package LOL;

public final class Software extends Product {
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os; 
    private String name;
    
	public String getProgrammer() {
		return programmer;
	}
	public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    @Override
    public boolean equals(Object obj){
    	if(!(obj instanceof Software)){
    		return false;
    	}
    	if(obj == this){
    		return true;
    	}
    	Software s = (Software)obj;
    	return name.equals(s.getName());
    }
    
}