package ucb.edu.bo.practicacontenedor.dto;
import java.util.Date;
public record Task (
     int taskId,
     String name,
     Date dueDate,
     String status
){}

    
    

