public class HelloWorld
{
    public static void main(String[] args)
    {
        String name = "Bert";
        System.out.println("Hello " + name + "!");

        // Assign numeric variables and mathematical operations
        int yearBorn = 1986;
        int currentYear = 2023;
        System.out.println(name + ", you are approximately " + (currentYear - yearBorn) + " years old!");

        // Decide whether you're old
        int age = currentYear - yearBorn;
        if (age <= 25)
        {
            System.out.println("You are young!");
        } else if (age < 50)
        {
            System.out.println("You are middle-aged!");
        } else
        {
            System.out.println("You are old!");
        }

        // loops
        System.out.println("I will now count to 10 before exiting...");
        for (int position = 1; position <= 10; position++)
        {
            System.out.println(position);
        }
    }
}
