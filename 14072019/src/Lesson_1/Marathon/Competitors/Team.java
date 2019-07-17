package Lesson_1.Marathon.Competitors;

public class Team {
    private static String teamName;
    private boolean active;
    private Competitor[] team = {new Human("Боб"),new Cat("Барсик"),new Cat("Мурзик"),new Dog("Бобик")};

    public Team(String teamName){
        this.teamName = teamName;
    }

    public Competitor[] getTeam() {
        Competitor[] currentMass = new Competitor[team.length];

        for (int i = 0; i < team.length; i++) {
            currentMass[i] = team[i];
        }
        return currentMass;
    }

    public void showResult(Competitor[] c){
        System.out.println("Результаты команды " + teamName + ":");
        for (int i = 0; i < c.length; i++) {
            c[i].info();
        }
    }
}


