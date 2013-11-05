package ConsoleTester;


public class ConsoleTestApp extends IOFactory
{
    public static void main (String args[])
    {
        ConsoleIO console = IOFactory.getConsoleIO();

        console.println("Welcome to the Console Tester application");
        console.println();

        console.println("Int Test");
        console.getIntWithinRange("Enter a integer between -100 and 100: ", + -100, 100);
        console.println();

        console.println("Double Test");
        console.getDoubleWithinRange("Enter any number between -100 and 100: ", + -100, 100);
        console.println();

        console.println("Required String Test");
        console.getRequiredString("Enter your email address: ");
        console.println();

//        console.println("String Choice Test");
//        console.getChoiceString("Select one (x/y): ", "x", "y");
//        console.println();

    }
}