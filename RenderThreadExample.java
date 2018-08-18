package Chapter1.javagames.render;

/* volatile : this keyword tells the compiler to always read the variable from memory
 * Without this keyword, the variable may be optimized with a cached value by the JVM,
 * and the thread would be unable to stop .*/

/* sleep() method slow the application down to a more reasonable speed */
import javax.swing.*;

public class RenderThreadExample extends JFrame implements Runnable {

    private volatile boolean running;
    private Thread gameThread;
    public RenderThreadExample(){
    }
    protected void CreateAndShowGUI(){
        setSize(320,240);
        setTitle("Render Thread");
    }
    @Override
    public void run() {

    }
}
