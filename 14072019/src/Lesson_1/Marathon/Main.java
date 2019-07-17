package Lesson_1.Marathon;

import Lesson_1.Marathon.Competitors.*;
import Lesson_1.Marathon.Obstacle.Course;


public class Main {
    public static void main(String[] args) {
        Team team = new Team("Червяки");
        Course course = new Course();
        course.doIt(team.getTeam());
        team.showResult(team.getTeam());
    }

}
