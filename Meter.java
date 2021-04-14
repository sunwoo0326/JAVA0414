public interface Meter {
    public int BASE_FARE = 3000;    
    public abstract void start();
    public abstract int stop(int distance);
}
