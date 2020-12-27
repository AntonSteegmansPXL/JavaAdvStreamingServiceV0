package be.pxl.ja.streamingservice.model;

import javax.print.Doc;
import java.lang.management.MonitorInfo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContentDemo {
    public static void main(String[] args) {
        List<Content> contentList = new ArrayList<>();

        Movie the_incredibles = new Movie("The Incredibles", Rating.LITTLE_KIDS);
        the_incredibles.setReleaseDate(LocalDate.of(2004, 10, 27));
        contentList.add(the_incredibles);

        Movie iron_fist = new Movie("Iron Fist", Rating.MATURE);
        contentList.add(iron_fist);

        TVShow eigen_kweek = new TVShow("Eigen Kweek", Rating.TEENS, 3);
        contentList.add(eigen_kweek);

        Documentary geen_idee = new Documentary("Geen Idee", Rating.MATURE);
        contentList.add(geen_idee);

        for (Content content : contentList) {
            System.out.println(content);
            if (content instanceof Playable) {
                ((Playable) content).play();
            }
            if (content instanceof Movie) {
                ((Movie) content).pause();
            }
            if (content instanceof Documentary) {
                System.out.println(((Documentary) content).getTopic());
            }
        }
    }
}
