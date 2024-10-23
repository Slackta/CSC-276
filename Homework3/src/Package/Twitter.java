package Package;

public class Twitter {
    private Person[] persons;

    public Twitter(Person[] persons) 
    {
        this.persons = persons;
    }

    public void printAllUsers() 
    {
        for (Person person : persons) 
        {
            System.out.println(person);
        }
    }

    public int calculateTotalFollowers() 
    {
        int totalFollowers = 0;
        for (Person person : persons) 
        {
            totalFollowers += person.getNumFollowers();
        }
        return totalFollowers;
    }
}