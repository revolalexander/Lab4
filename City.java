public class City {
    private static int rocket;
    private String name;
    private int electricity;
    private int road;
    private int house;
    private boolean greenEnough;
    private int prestige;
    private int posX;
    private int posY;

    City(String name, int posX, int posY, int house, int electricity, int road, int prestige) {
        this.name = name;
        this.house = house;
        this.prestige = prestige;
        this.electricity = electricity;
        this.road = road;
        this.greenEnough = true;
        this.posX = posX;
        this.posY = posY;
        this.rocket = rocket;
    }

    public String getName() {
        return this.name;
    }

    public int getCordX() { return this.posX; }
    public int getCordY() { return this.posY; }

    public void getResult() {
        String greened;
        if(this.greenEnough) greened = "Да";
        else greened = "Нет";
        System.out.println("В локации " + this.name + " построено:\n\t• Дома: " + this.house + "\n\t• Дороги: " + this.road + "\n\t• Линии электропередач: " + this.electricity + "\n\t• Город озеленён: " + greened + "\n\t• Престиж города: " + this.prestige + "\n");
    }


    public void addRoad() {
        this.road += 1;
        this.prestige += 15;
        this.greenEnough = false;
    }

    public void addElectricity() {
        this.electricity += 1;
        this.prestige += 20;
    }

    public void addHouse() {
        this.house += 1;
        this.prestige += 50;
    }

    public void greenify() {
        if(greenEnough) return;
        this.greenEnough = true;
        this.prestige += 10;
    }

    public void addRocket() {
        this.rocket += 1;
    }

    public static int getRocketsCount() {
        return rocket;
    }


    public void inDoorDecoration() {
        this.prestige += 20;
    }

    public void paintWork() {
        this.prestige += 10;
    }



}

