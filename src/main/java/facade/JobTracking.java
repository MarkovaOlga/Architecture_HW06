package facade;

public class JobTracking {
    private boolean activeProject;
    public boolean isProjectActive(){
        return activeProject;
    }
    public void startProject(){
        System.out.println("Project is running");
        activeProject = true;
    }
    public void finishProject(){
        System.out.println("Project is finished");
        activeProject = false;
    }
}
