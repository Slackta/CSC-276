package Package;

public class Person {
    private String name;
    private String username;
    private int numFollowers;

    public Person(String name, String username, int numFollowers) 
    {
        this.name = name;
        this.username = username;
        this.numFollowers = numFollowers;
    }

    public String getName() 
    {
        return name;
    }

    public String getUsername() 
    {
        return username;
    }

    public int getNumFollowers() 
    {
        return numFollowers;
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + "     Username: " + username + "     Followers: " + numFollowers;
    }
}