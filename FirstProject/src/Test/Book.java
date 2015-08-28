package Test;

public class Book extends Product
{
    private String author;

    public Book()
    {
    	code = "";
    	description = "";
    	price = 0.0;
    	author = "";
        count++;
    }
    
    public Book(String c, String d, double p, String a){
    	code = c;
    	description = d;
    	price = p;
    	author = a;
    	count++;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Author:      " +
            author + "\n";
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
