package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public boolean allowedToWatch(Content content) {
        if (getAge() == 0) {
            return false;
        } else {
            return content.getMaturityRating().getAge() <= getAge();
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        if (dateOfBirth == null) {
            return 0;
        } else {
            return Period.between(dateOfBirth, LocalDate.now()).getYears();
        }
    }
}
