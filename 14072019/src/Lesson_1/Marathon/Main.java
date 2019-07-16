package Lesson_1.Marathon;

import Lesson_1.Marathon.Athlete.Cat;
import Lesson_1.Marathon.Athlete.Competitor;
import Lesson_1.Marathon.Athlete.Dog;
import Lesson_1.Marathon.Athlete.Human;
import Lesson_1.Marathon.Obstacle.Cross;
import Lesson_1.Marathon.Obstacle.Obstacle;
import Lesson_1.Marathon.Obstacle.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
        for (Competitor c : competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}