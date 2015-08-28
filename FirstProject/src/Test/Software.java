package Test;

public class Software extends Product
{
    private String version;

    public Software()
    {
    	code = "";
    	description = "";
    	price = 0.0;
    	version = "";
        count++;
    }
    
    public Software(String c, String d, double p, String a){
    	code = c;
    	description = d;
    	price = p;
    	version = a;
    	count++;
    }

    public String getVersion()
    {
        return version;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Version:     " +
            version + "\n";
    }
    
    public String toString(String s){
    	if(s.equals("simple"))
    		return super.toString();
    	else if(s.equals("detail")){
    		return this.toString();
    	}
    	return null;
    }
}