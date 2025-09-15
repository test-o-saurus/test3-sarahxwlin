public class Test {
    public static void main(String[] args) {
        class InfoAboutJava {
            // Create a variable called language
            String language = "Java";

            // Create a variable called yearOfOrigin
            int yearOfOrigin = 1995;
        }
        
        // Create an instance of InfoAboutJava to access its variables
        InfoAboutJava info = new InfoAboutJava();
        System.out.println(info.language + " was created in " + info.yearOfOrigin);
    }
}
