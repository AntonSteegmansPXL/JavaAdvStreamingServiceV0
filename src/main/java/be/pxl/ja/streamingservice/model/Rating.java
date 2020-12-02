package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS("Little kids", 0),
    OLDER_KIDS("Older kids", 7),
    TEENS("Teens", 12),
    MATURE("Mature", 16);

    private String displayName;
    private int age;

    Rating(String displayName, int minimumAge) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }
}
