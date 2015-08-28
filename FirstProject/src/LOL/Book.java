package LOL;

public final class Book extends Product {
    private String author;
    private int pages;
    private String code;
    private String name;
    
    
    
    public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPages() {
		return pages;
	}



	public void setPages(int pages) {
		this.pages = pages;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


    @Override
    public boolean equals(Object obj){
    	if(!(obj instanceof Book)){
    		return false;
    	}
    	if(obj == this){
    		return true;
    	}
    	Book b = (Book)obj;
    	return name.equals(b.getName());
    }
}