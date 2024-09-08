public class Singleton {
    private static volatile Singleton instance;

    /**
     * Private Constructor to restrict access within class
     */
    private Singleton(){}

    /**
     * Thread-safe optimized implementation to check whether instance
     * has been created.
     * @return Singleton instance
     */
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
