import java.lang.reflect.Type;

public class Enginery{
    private String type;
    private int fuel;
    private int fuelLost;
    private TypeOfEnginery typeOfEnginery;
    private City location;

    Enginery(String type, int fuel, City location) {
        this.type = type;
        this.fuel = fuel;
        this.typeOfEnginery = TypeOfEnginery.NONE;
        this.location = location;
        this.fuelLost = 0;
    }


    public void move(City newLocation) {
        if(this.type.equals("Грузовик Камаз")) {
            this.typeOfEnginery = TypeOfEnginery.TRUCK_KAMAZ;
        } else if(this.type.equals("Грузовик Урал")) {
            this.typeOfEnginery = TypeOfEnginery.TRUCK_URAL;
        } else if(this.type.equals("Гусеничный транспортер №1")) {
            this.typeOfEnginery = TypeOfEnginery.TRACK_CARRIER_MODEL1;
        } else if(this.type.equals("Гусеничный транспортер №2")) {
            this.typeOfEnginery = TypeOfEnginery.TRACK_CARRIER_MODEL2;
        } else if(this.type.equals("Башенный кран")) {
            this.typeOfEnginery = TypeOfEnginery.TOWER_CRANE;
        } else if(this.type.equals("Вертолет")) {
            this.typeOfEnginery = TypeOfEnginery.HELICOPTER;
        }
        this.location = location;
        if(this.typeOfEnginery == TypeOfEnginery.TRUCK_KAMAZ || this.typeOfEnginery == TypeOfEnginery.TRUCK_URAL)
            this.fuelLost = (Math.abs(location.getCordX() - newLocation.getCordX()) + Math.abs(location.getCordY() - newLocation.getCordY())) / 100;
        if(this.typeOfEnginery == TypeOfEnginery.TRACK_CARRIER_MODEL1 || this.typeOfEnginery == TypeOfEnginery.TRACK_CARRIER_MODEL2)
            this.fuelLost =  3 * (Math.abs(location.getCordX() - newLocation.getCordX()) + Math.abs(location.getCordY() - newLocation.getCordY())) / 100;
        if(this.typeOfEnginery == TypeOfEnginery.TOWER_CRANE)
            this.fuelLost =  0;
        if (this.fuel < fuelLost) throw new NotEnoughFuelException("Машина не поехала в другой город, из-за недостатка топлива");
        this.fuel -= this.fuelLost;
        this.location = newLocation;
        if(this.typeOfEnginery == TypeOfEnginery.TOWER_CRANE)
            this.fuelLost = 120;
        if(this.typeOfEnginery == TypeOfEnginery.HELICOPTER)
            this.fuelLost = 300;
        this.fuel -= this.fuelLost;
    }


    public int refuel() {
        return this.fuel = fuel;
    }

    public void getCarInfo() {
        if (this.typeOfEnginery == TypeOfEnginery.TRUCK_KAMAZ || this.typeOfEnginery == TypeOfEnginery.TRUCK_URAL) {
            System.out.println(this.type + " прибыл в " + this.location.getName() + "\n\t•Осталось топлива: " + this.fuel + "\n\t•Привез строительные блоки легкой пенопластмассы\n");
        } else if(this.typeOfEnginery == TypeOfEnginery.TRACK_CARRIER_MODEL1) {
            System.out.println(this.type + " прибыл в " + this.location.getName() + "\n\t•Осталось топлива: " + this.fuel +"\n\t•Привез части ракеты для ее постройки\n");
        } else if(this.typeOfEnginery == TypeOfEnginery.TRACK_CARRIER_MODEL2) {
            System.out.println(this.type + " прибыл в " + this.location.getName() + "\n\t•Осталось топлива: " + this.fuel +"\n\t•Привез Башенный кран\n");
        } else if(this.typeOfEnginery == TypeOfEnginery.TOWER_CRANE) {
            System.out.println("При помощи " + this.type + " построил нижнюю часть ракеты " + "\n\t•Осталось топлива: " + this.fuel + "\n");
        } else if(this.typeOfEnginery == TypeOfEnginery.HELICOPTER) {
            System.out.println("При помощи " + this.type + " построили верхнюю часть ракеты " + "\n\t•Осталось топлива: " + this.fuel + "\n");
        }

    }


    }

