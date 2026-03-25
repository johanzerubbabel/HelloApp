public class HelloApp {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            for (String nameArg : args) {
                nameBuilder.append(nameArg).append(", ");
            }
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        } else {
            name = "World";
        }
        System.out.println("Hello, " + name + "!");
    }
}