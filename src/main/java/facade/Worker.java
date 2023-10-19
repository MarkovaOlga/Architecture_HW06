package facade;

public class Worker {
    public void workBeforeDeadline(JobTracking jobTracking){
        if(jobTracking.isProjectActive()) {
            System.out.println("Worker is doing project");
        }else{
            System.out.println("Worker is learning");
        }
    }
}
