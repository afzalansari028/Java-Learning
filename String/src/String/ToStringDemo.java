package String;

public class ToStringDemo
{
	String name;
	int id;
    public ToStringDemo(String name,int id)
    {
    	this.name = name;
    	this.id = id;	
    }
    public String toString()
    {
  	return this.name+" "+this.id;  
    }
}
