class NamedCow extends Cow
{
	    private String myName;      
    public NamedCow(String type, String sound, String name)     
    {         
         myType = type;         
         mySound = sound; 
         myName = name;    
    }
    public NamedCow()
    {
    	myName = "The Cow";
    }

      
     public String getSound()
    {
     	return mySound;
    }     
     public String getType()
    {
     	return myType;
    }  

    public String getName()
    {
    	return myName;
    }
}