package main.java.duke.task;

import main.java.duke.task.Task;

public class Todo extends Task {
    public Todo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String saveToFile() {
        return "T/" + super.saveToFile();
    }
}