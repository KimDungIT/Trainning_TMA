package design_pattern.singleton;

public class StaticBlockInitialization {
    private static final StaticBlockInitialization INSTANCE;

    private StaticBlockInitialization() {};

    static {
        try {
            INSTANCE = new StaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitialization getInstance() {
        return INSTANCE;
    }

}
