import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

/**
 * Maaz Karim - 24503
 * Design pattern Assignment to create N-ton (similar to the singleton pattern)
 * Description - Define a number 'N' (you may hard-code this or dynamically ask for it from the user), which represents
 * the number of objects to be created. Only create 'N' objects and reuse them as needed. Implement a system where
 * objects are managed in a pool and a queue tracks the availability of each object. When an object is needed,
 * it is requested from the pool, and once it is no longer in use, it is returned to the queue for reuse.
 */
public class Nton {
    private static final int N = 3;
    private static int currCount = 0;
    private static Queue<Nton> instances;
    private static final Semaphore semaphore = new Semaphore(N);
    private Nton(){}
    /**
     * first check if N instances have already been made, handle that using handleInstances function
     * acquire a semaphore to ensure only N-threads access objects at of this class at the same time
     *
     * @return Nton instance
     */
    public static Nton getInstance() throws InterruptedException {
        handleInstances();
        semaphore.acquire();            // Did not manually handle exception because we want
                                        // Java to throw this exception if encountered
        return instances.poll();
    }
    /**
     * Called whenever getInstance is called, handles whether a new object must be created or not
     */
    private static synchronized void handleInstances() {
        if (currCount < N) {
            if(currCount == 0) instances = new ConcurrentLinkedQueue<>();
            instances.add(new Nton());
            currCount++;
        }
    }
    /**
     * To be called when a consumer wants to relinquish control over their object
     */
    public void releaseInstance() {
        instances.add(this);
        semaphore.release();
    }
}