package main.java.task;
import main.java.task.Task;

public class Event extends Task {
    protected String at;

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }

    @Override
    public String saveToFile() {
        return "E/" + super.saveToFile() + "/" + at;
    }
}
