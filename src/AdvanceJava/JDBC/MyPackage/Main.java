package AdvanceJava.JDBC.MyPackage;

public class Main {
    public static void main(String[] args) {

        University university = new University();
        university.createDatabase();
        university.createTable();
        university.createData();
        university.readData();
        university.updateData();
        university.deleteData();


    }
}
