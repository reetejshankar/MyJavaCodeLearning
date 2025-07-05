package JaVaProject;


import java.util.*;

public class ToDoList {

    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public ToDoList(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Task removed: " + tasks.get(index));
            tasks.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        System.out.println("To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        try (Scanner sc = new Scanner(System.in)) {
            String command;

            do {
                System.out.println("Enter a command (add, remove, display, exit):");
                command = sc.nextLine();

                switch (command) {
                    case "add" -> {
                        System.out.println("Enter task:");
                        String task = sc.nextLine();
                        toDoList.addTask(task);
                    }
                    case "remove" -> {
                        System.out.println("Enter task number to remove:");
                        int index = sc.nextInt() - 1;
                        sc.nextLine(); // consume newline
                        toDoList.removeTask(index);
                    }
                    case "display" ->
                            toDoList.displayTasks();
                    case "exit" ->
                            System.out.println("Exiting...");
                    default ->
                            System.out.println("Unknown command.");
                }
            } while (!command.equals("exit"));
        }
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }
}

