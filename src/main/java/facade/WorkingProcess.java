package facade;

public class WorkingProcess {
    Worker worker = new Worker();
    Job job = new Job();
    JobTracking jobTracking = new JobTracking();

    public void workflow(){
        job.work();
        jobTracking.startProject();
        worker.workBeforeDeadline(jobTracking);
        jobTracking.finishProject();
        worker.workBeforeDeadline(jobTracking);
    }
}
