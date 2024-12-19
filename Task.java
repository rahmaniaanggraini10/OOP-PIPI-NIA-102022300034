import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final LocalDate dueDate;
    private String title, priority, status;

    
    public Task(LocalDate dueDate, String title, String priority, String status) {
        this.dueDate = dueDate;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }


    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getTitle() {
        return title;
    }


    public String getPriority() {
        return priority;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String Status){
        this.status = status; 
    }
    
}
