package ucb.edu.bo.practicacontenedor.api;

@RestController
@RequestMapping("/api/v1/task")

public class TaskAPI {
    private TaskBl taskBl;

    TaskAPI(){
        taskBl = new TaskBl();
    }
    @GetMapping("/")
    public Map create(Task task) {
        taskBl.create(task);
        Map result = new HashMap();
        result.put("code","TASK-0000");
    }
}