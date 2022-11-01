package Patterns.Strategy;

/**
 * Created by Nikasan
 */
public class Worker {

    public void doJob(IJob job){
        job.doJob();
    }

}
