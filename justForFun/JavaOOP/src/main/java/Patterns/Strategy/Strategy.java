package Patterns.Strategy;

/**
 * Created by Nikasan
 */
public class Strategy {

    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.doJob(new Job1());
        worker.doJob(new Job2());
    }
}

class Job1 implements IJob{

    @Override
    public void doJob() {
        System.out.println("I do job 1");
    }
}

class Job2 implements IJob {

    @Override
    public void doJob() {
        System.out.println("I do job 2");
    }
}