public class Rocket {
    private String name;
    private String color;
    private int rocketFuel;
    private static String outerShellMaterial;
    private static String secondShellMaterial;
    private static String thirdShellMaterial;
    private int maxPassengersSeats;


    public Rocket(){}

    public Rocket(String name, String color, String outerShellMaterial, String secondShellMaterial, String thirdShellMaterial, int maxPassengersSeats) {
        this.name = name;
        this.color = color;
        this.outerShellMaterial = outerShellMaterial;
        this.secondShellMaterial = secondShellMaterial;
        this.thirdShellMaterial = thirdShellMaterial;
        this.maxPassengersSeats = maxPassengersSeats;
    }


    public void checkTank() {
        class RocketTank {

            private int rocketFuel = 1500;

            public void getFuel() {
                System.out.println(this.rocketFuel + " литров топлива в топливном отсеке");
            }
        }
        RocketTank tank = new RocketTank();
        tank.getFuel();
        System.out.println("Двигатели готовы, ракета начинает взлет.");

    }

    public void getCondition() {
        if(City.getRocketsCount() > 0) {
            System.out.println("\n__________________________________________\nРакета установлена и готова к запуску! Ура!\n__________________________________________\n");
        }
    }

    public void rocketDescription() {
        System.out.println("Ракета стояла посреди Космического городка, возвышаясь над домами, как огромная сигара или как поставленный торчком дирижабль. \n" +
                "Для защиты от вредного влияния воздуха, водяных паров и других газов использовалась внешняя оболочка ракеты. \n" +
                "Под этой стальной оболочкой была вторая оболочка, назначение которой было защищать внутренность корабля от вредоносного действия космических лучей и радиоактивного излучения. \n" +
                "Наконец, внутри корабля имелась третья оболочка, способствовавшая сохранению внутри корабля необходимой температуры. \n" +
                "Техническая справка по материалам прилагается ниже\n");
    }

    public String getInfo() {
        return "Техническая информация Ракеты компании SunCityX: " + "\nНазвание модели: " + this.name + "\nЦвет корпуса: " + this.color + "\nКоличество посадочных мест: " + this.maxPassengersSeats;
    }


    public static class Draft {

        public static void getDraftInfo() {
            System.out.println("Техническая информация базовой ракеты: " + "\n\tМатериалы: \n\t\t•Внешная оболочка ракеты: " + outerShellMaterial + "\n\t\t•Вторая оболочка ракеты: " + secondShellMaterial
                    + "\n\t\t•Третья оболочка ракеты: " + thirdShellMaterial);
            System.out.println("\n Реактивные двигатели ракеты:" + "\n\t Главный двигатель: \n\t\t расположен в хвостовой части; Сопло этого двигателя было направлено вертикально вниз. При работе двигателя нагретые газы вырывались из сопла вниз, благодаря чему сила противодействия, или, как ее иначе называют, реактивная сила, толкала ракету вверх."
            + "\n\t Два запасных двигателя: \n\t\t расположены в хвостовой части по бокам от главного двигателя; Корректируют направление движения ракеты, а также служат запасными в случае выхода из строя главного двигателя по неопределенным причинам.\n");

        }
    }

}
