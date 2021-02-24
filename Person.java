public class Person implements IPerson {
    private String name;
    private int energy;
    private TypeOfWork work;
    private City location;
    private Enginery type;
    private ToolSet tool;

    Person(String name, City location) {
        this.name = name;
        this.energy = 30;
        this.work = TypeOfWork.NOTHING;
        this.location = location;
        this.type = type;
        this.tool = null;

    }


    public void changeLocation(City city) {
        try {
            if(this.location == city) throw new SameLocationException(this.name + " уже находится в этом городе");
            this.location = city;
            System.out.println(this.name + " пришел в " + this.location.getName() + "\n");
        } catch (SameLocationException e) {
            System.out.println(e);
        }

    }

    public void noticed() {
        System.out.println(this.name + " заметил какое-то строительство\n");
    }

    public void see() {
        System.out.println(this.name + " увидел среди работавших коротышек Винтика со Шпунтиком");
    }

    public void supervision() {
        System.out.println(this.name + " пристально следит за правильностью и качеством сборки ракеты");
    }

    public void changeWork(TypeOfWork newWork, WorkingTarget target) {
        this.work = newWork;
        if(this.work == TypeOfWork.RELAXING) {
            this.energy = 100;
            System.out.println(this.name + " отдохнул, можно за работу");
        } else {
            if(this.energy < 30){
                System.out.println(this.name + " устал, ушел отдыхать");
                WorkingTarget relax = new WorkingTarget("Отдых", null);
                changeWork(TypeOfWork.RELAXING, relax);
            } else {
                this.energy -= 30;
                System.out.println(getWork());
                if(this.energy == 0) {
                    System.out.println(this.name + " устал, ушел отдыхать");
                    WorkingTarget relax = new WorkingTarget("Отдых", null);
                    changeWork(TypeOfWork.RELAXING, relax);
                }
                target.targetDone(this.name, this.location);
            }


        }
    }

    public void takeTool(ToolSet tool) {
        this.tool = tool;
        System.out.println(this.name + " берет в руки " + this.tool.getToolName());
    }


    public String getWork() {
        switch (this.work) {
            case ROAD_BUILDING:
                return this.name + " пошел прокладывать дорогу";
            case ELECTRICITY_BUILDING:
                return this.name + " пошел устанавливать столбы электролиний";
            case FLOWERS_PLANTING:
                return this.name + " и пошел сажать цветы";
            case INDOOR_DECORATION:
                return this.name + " пошел заниматься внутренней отделкой дома";
            case PAINTING_WORKS:
                return this.name + " руководит малярными работами:\n\t-Составляет краски \n\t-Указывает, в какие цвета красить стены и крыши домов";
            case RELAXING:
                return this.name + " бросил все и пошел отдыхать";
            case HOUSE_BUILDING:
                return this.name + " собирает небольшой, уютный одноэтажный домик";
            case ROCKET_DETAIL_BUILDING:
                return this.name + " создает детали для частей ракеты";
            case ROCKET_PARTS_BUILDING:
                return this.name + " собирает из изготовленных деталей части ракеты";
            case ROCKET_LOWER_INSTALLING:
                return this.name + " строит нижнюю часть ракеты c помощью Башенного крана";
            case ROCKET_UPPER_INSTALLING:
                return this.name + " строит верхнюю часть ракеты с помощью Вертолета";
            default:
                return "";
        }

    }



}
