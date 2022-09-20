package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkedOut;
    private double averageUserRating;
    private int timesCheckedOut;
    public Video(String title, double averageUserRating) {
        this.title = title;
        this.averageUserRating = averageUserRating;
        this.timesCheckedOut = 1;
    }

    public void checkout() {
        checkedOut = true;
    }

    public void returned() {
        checkedOut = false;
    }

    public void receiveRating(int rating) {
        averageUserRating = (averageUserRating + rating) / (timesCheckedOut+1);
        timesCheckedOut++;
    }

    public double getAverageRating() {
        return averageUserRating;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void setAverageUserRating(int averageUserRating) {
        this.averageUserRating = averageUserRating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", checkedOut=" + checkedOut +
                ", averageUserRating=" + averageUserRating +
                '}';
    }
}
