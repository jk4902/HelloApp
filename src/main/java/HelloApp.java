public class HelloApp {

    public static void main(String[] args) {

        // Check if command-line arguments were provided
        if (args.length > 0) {

            // Use StringBuilder to efficiently build the greeting message
            StringBuilder names = new StringBuilder();

            // Iterate through the args array using a for loop
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);

                // Add comma and space between names, but not after the last one
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            // Display single greeting with all names
            System.out.println("Hello, " + names.toString() + "!");

        } else {
            // No arguments provided — use default value "World"
            System.out.println("Hello, World!");
        }
    }
}
