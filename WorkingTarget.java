public class WorkingTarget extends Item {
    private String worker;
    private City location;
    private boolean done;
    
    WorkingTarget(String name, City city) {
        super(name);
        this.worker = null;
        this.location = city;
    }

    public void targetDone(String person, City location) {
        this.done = true;
        this.worker = person;

        switch(getName()) {
            case "Домик":
                location.addHouse();
                break;
            case "Дорога":
                location.addRoad();
                break;
            case "Линия электропередач":
                location.addElectricity();
                break;
            case "Цветы":
            case "Деревья":
            case "Озеленение":
                location.greenify();
                break;
            case "Внутренняя отделка дома":
                location.inDoorDecoration();
                break;
            case "Малярные работы":
                location.paintWork();
                break;
            case "Ракета: нижняя часть":
            case "Ракета: верхняя часть":
                location.addRocket();
                break;
        }

        System.out.println(this.getName() + " - работу выполнил " + this.worker + "\n");

    }

}
