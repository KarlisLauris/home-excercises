package io.codelex.classesandobjects.practice.videostore;

public class VideoStore {


    private Video[] videos = new Video[VideoStoreTest.COUNT_OF_MOVIES];
    private int counter = 0;

    public void addVideo(String title, double averageUserRating) {
        videos[counter] = new Video(title, averageUserRating);
        counter++;
    }

    public void checkOut(String title) {
        for (int i = 0; i < videos.length; i++) {
            if (videos[i].getTitle().equals(title) && !videos[i].isCheckedOut()) {
                videos[i].checkout();
                System.out.println("Rating: " + videos[i].getAverageRating());
                System.out.println("Video " + title + " is checked out");
                break;
            }else{
                System.out.println("Video " + title + " is not available");
            }
        }
    }

    public void returnVideo(String title,int rating) {
        for (int i = 0; i < videos.length; i++) {
            if (videos[i].getTitle().equals(title)) {
                videos[i].returned();
                videos[i].receiveRating(rating);
                System.out.println("Video " + title + " is returned");
                break;
            }
        }
    }
    public void listUncheckedVideos(){
        for (int i = 0; i < videos.length; i++) {
            if (!videos[i].isCheckedOut()) {
                System.out.println(videos[i].getTitle()+" Rating: "+videos[i].getAverageRating());
            }
        }
    }
    public void listInventory() {
        for (int i = 0; i < videos.length; i++) {
            System.out.println("Title: " + videos[i].getTitle() + " Average rating: " + videos[i].getAverageRating() + " Checked out: " + videos[i].isCheckedOut());
        }
    }

    public void setVideos(Video[] videos) {
        this.videos = videos;
    }
}
