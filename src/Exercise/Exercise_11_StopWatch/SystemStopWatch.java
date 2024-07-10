package Exercise.Exercise_11_StopWatch;

public class SystemStopWatch {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        System.out.println("Start Time: " + sw.getStartTime());

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        sw.stop();
        System.out.println("End Time: " + sw.getEndTime());
        System.out.println("Elapsed Time " + sw.getElapsedTime() + " milisecond");
    }
}
