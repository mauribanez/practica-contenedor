package ucb.edu.bo.practicacontenedor.bl;
import ucb.edu.bo.practicacontenedor.dto.Task;
import java.util.*;
public class taskNI {

    List<Task> database = new ArrayList();
    public void create(Task task){
        database.add(task);

    }
    public List<Task> listaAll(){
        return database;
    }
    public void delete(int taskId){
        
    }
}