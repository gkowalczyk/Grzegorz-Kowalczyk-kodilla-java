public class LazyLoading {

    private static LazyLoading instance = null;

    public static LazyLoading getInstance() {
        if (instance == null) {
            instance = new LazyLoading();
        }

        return instance;
    }
}