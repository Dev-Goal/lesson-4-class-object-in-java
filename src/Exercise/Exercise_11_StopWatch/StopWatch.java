package Exercise.Exercise_11_StopWatch;

import java.time.Instant;

public class StopWatch {
    Instant startTime;
    Instant endTime;

    public StopWatch() {
        this.startTime = Instant.now();
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = Instant.now();
    }

    public void stop() {
        this.endTime = Instant.now();
    }

    public long getElapsedTime() {
        return endTime.toEpochMilli() - startTime.toEpochMilli();
    }
}
