package Singleton;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();

        String result = foo.query("SELECT * from Database;");

        System.out.println("Result from foo: "+ result);

        Database bar = Database.getInstance();

        result = bar.query("SELECT id from Database;");

        System.out.println("Result from bar: "+ result);
    }
}
