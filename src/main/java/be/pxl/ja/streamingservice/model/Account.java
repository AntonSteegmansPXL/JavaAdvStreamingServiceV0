package be.pxl.ja.streamingservice.model;

import be.pxl.ja.streamingservice.util.PasswordUtil;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String email;
    private String password;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles = new ArrayList<>();
    private PaymentInfo paymentInfo;

    public Account() {
        Profile profile1 = new Profile();
        addProfile(profile1);
    }

    public Account(String email, String password) {
        Profile profile1 = new Profile();
        addProfile(profile1);
        this.email = email;
        this.password = password;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public void addProfile(Profile profile) {
        this.profiles.add(profile);
    }

    public Profile getFirstProfile() {
        return this.profiles.get(0);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StreamingPlan getStreamingPlan() {
        return streamingPlan;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public boolean verifyPassword(String password) {
        return PasswordUtil.calculateStrength(password) >= 5;
    }
}
