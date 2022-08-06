package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        Object [] competitors = new Object[] {
                new Cat("Барсик", 3,5),
                new Human("Вася",8,9),
                new Robot("Роберт",12,23)
        };

        Object [] competition = new Object[] {
                new RunWay(2),
                new Wall(5),
                new RunWay(6),
                new Wall(5),
                new RunWay(13),
                new Wall(15)
        };

        for (Object competitor: competitors
             ) {
            Boolean fail = false;

            for (Object compete: competition
                 ) {
                if(!fail)
                switch (compete.getClass().getName().substring(8)) {
                    case "RunWay": {
                        switch (competitor.getClass().getName().substring(8)) {
                            case "Cat": fail = ((Cat) competitor).run(((RunWay)compete).getLength());
                            break;
                            case "Human": fail =((Human) competitor).run(((RunWay)compete).getLength());
                            break;
                            case "Robot": fail =((Robot) competitor).run(((RunWay)compete).getLength());
                            break;
                        }
                        break;
                    }
                    case "Wall": {
                        switch (competitor.getClass().getName().substring(8)) {
                            case "Cat": fail = ((Cat) competitor).jump(((Wall)compete).getHight());
                                break;
                            case "Human": fail = ((Human) competitor).jump(((Wall)compete).getHight());
                                break;
                            case "Robot": fail =((Robot) competitor).jump(((Wall)compete).getHight());
                                break;
                        }
                        break;
                    }
                }
                else System.out.println("Сошел с дистанции");
            }
        }
    }
}
