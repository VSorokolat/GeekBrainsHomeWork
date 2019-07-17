package Lesson_1.Marathon.Obstacle;

import Lesson_1.Marathon.Competitors.Competitor;

 public class Course  {
    private Obstacle[] courses = {new Water(100), new Wall(3), new Cross(200),new Cross(1200)};

    public void doIt(Competitor[] competitor) {
        for (int i = 0; i < competitor.length ; i++)
            for (int j = 0; j < courses.length; j++) {
                courses[j].doIt(competitor[i]);
                if (!competitor[i].isOnDistance()) break;
            }
    }
}
