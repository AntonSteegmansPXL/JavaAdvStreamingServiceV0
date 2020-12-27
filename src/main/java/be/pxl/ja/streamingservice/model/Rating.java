package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(0),
    OLDER_KIDS(7),
    TEENS(12),
    MATURE(16);

    private int minimumAge = 0;

    Rating(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    Rating() {
        this(0);
    }

    public int getMinimumAgeAge() {
        return minimumAge;
    }
}
