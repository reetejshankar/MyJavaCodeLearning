package ExceptionsAndRegularExceptions;

class FileException extends Exception {

    public FileException() {

    }

    // overriding the getMessage() method
    @Override
    public String getMessage() {
        return "Could not open file";
    }
}

class FileManager {
    String filepath;
    String mode;

    public FileManager() {

    }

    public FileManager(String filepath, String mode) {
        this.filepath = filepath;
        this.mode = mode;
    }

    // creating a method that throws the custom exception
    public void openFile() throws FileException {

        if (filepath.equals("") || mode.equals("")) {
            throw new FileException();
        } else {
            System.out.println("Opening File....");
        }
    }
}

public class CustomException {
    public static void main(String[] args) {

        FileManager obj = new FileManager("", "");

        try {
            obj.openFile();
        } catch (FileException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

    }
}
