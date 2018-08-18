package Chapter1.javagames.util;
/* This example uses technique called passive rendering
* the application redraws itself in the paint() method, this is for normal
* applications, it is not recommended for games. */

public class FrameRate {
    // 1-1-1 Declaring variables
    private String frameRate;
    private long lastTime;
    private long delta;
    private int frameCount;

    public void initialize() {
        lastTime = System.currentTimeMillis(); // store current time
        frameRate = "FPS 0";
    }

    public void calculate() {
        long current = System.currentTimeMillis();
        delta += current - lastTime;
        lastTime = current;
        frameCount++;
        if (delta > 1000) {
            delta -= 1000;
            frameRate = String.format("FPS %s", frameCount);
            frameCount = 0;
        }
    }
    public String getFrameRate() {
        return frameRate;
    }
}

