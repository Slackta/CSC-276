package Package;

import java.util.Random;

public class TwitterTest {
    public static void main(String[] args) 
    {
        Person p1 = new Person("Reyna", "@reyna", 50);
        Person p2 = new Person("Nico", "@nico", 75);
        Person p3 = new Person("Naomi", "@naomi", 100);

        Person[] personsArray = {p1, p2, p3};
        Twitter twitter = new Twitter(personsArray);

        twitter.printAllUsers();
        System.out.println("Total Followers: " + twitter.calculateTotalFollowers() + "\n");

        String[] names = {"Reyna", "Nico", "Naomi", "Evangeline", "Callie", "Thalia", "Dante", "Minerva", "Finn", "Jordyn"};
        Random random = new Random();
        Person[] randomPersonsArray = new Person[20];

        for (int i = 0; i < 20; i++) 
        {
            String randomName = names[random.nextInt(names.length)];
            String username = "@" + randomName.toLowerCase();
            int followers = random.nextInt(100) + 1; // Random followers between 1 and 100

            randomPersonsArray[i] = new Person(randomName, username, followers);
        }

        Twitter randomTwitter = new Twitter(randomPersonsArray);
        randomTwitter.printAllUsers();
        System.out.println("Total Followers: " + randomTwitter.calculateTotalFollowers());
    }
}