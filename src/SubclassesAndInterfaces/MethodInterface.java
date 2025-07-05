package SubclassesAndInterfaces;

public class MethodInterface {

    public interface ILog {
        String MYSQL_DB_NAME = "MySQLDb";

        // abstract method
        void logMsg(String message);

        // default methods
        default void logWarning(String message) {
            System.out.println("Logging Warning: " + message);

            // connect to DB
            // Log Warning
            // Close Database connection
        }

        default void logFatalError(String message) {
            System.out.println("Logging Fatal Error: " + message);

            // connect to DB
            // Log Fatal Error
            // Close DB connection
        }

        // static method
        static boolean checkNull(String str) {
            System.out.println("Interface check for NULL");
            return str == null;
        }
    }

    public static class DBTransaction implements ILog {

        @Override
        public void logMsg(String message) {
            System.out.println(message);
        }

    }

    public static void main(String[] args) {

        System.out.println("Connecting to: " + ILog.MYSQL_DB_NAME);
        DBTransaction obj = new DBTransaction();
        obj.logMsg("Database Connected Successfullt");
        obj.logFatalError("Fatal Error while closing DB");
        System.out.println("Null check: " + ILog.checkNull("Hello"));

    }
}
