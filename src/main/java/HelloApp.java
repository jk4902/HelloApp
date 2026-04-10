public class HelloApp {

    public static void main(String[] args) {

        String names;

        // Default case
        if (args.length == 0) {
            names = "World";
        } else {
            // Join all names with ", "
            names = String.join(", ", args);
        }

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}