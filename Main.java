
public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");
            //Города
        City flowerCity = new City("Цветочный город",1000,2000, 5,3,4, 370);
        City spaceCity = new City("Космический городок", 500,2100, 0,0,0, 0);
        City sunCity = new City("Солнечный город", 0,0,6,4,4, 440);
            //Виды работ
        WorkingTarget road = new WorkingTarget("Дорога", spaceCity);
        WorkingTarget electricity = new WorkingTarget("Линия электропередач", spaceCity);
        WorkingTarget flowers = new WorkingTarget("Цветы", spaceCity);
        WorkingTarget decoration = new WorkingTarget("Внутренняя отделка дома", spaceCity);
        WorkingTarget paint = new WorkingTarget("Малярные работы", spaceCity);
        WorkingTarget house = new WorkingTarget("Домик", spaceCity);
        WorkingTarget rocketDetail = new WorkingTarget("Детали ракеты", sunCity);
        WorkingTarget rocketParts = new WorkingTarget("Части ракеты", sunCity);
        WorkingTarget rocketFinalLower = new WorkingTarget("Ракета: нижняя часть", spaceCity);
        WorkingTarget rocketFinalUpper = new WorkingTarget("Ракета: верхняя часть", spaceCity);
            //Наборы инструментов
        ToolSet decorationTool = new ToolSet("Набор инструментов для декоративных работ", TypeOfWork.INDOOR_DECORATION);
        ToolSet roadTool = new ToolSet("Набор инструментов для дорожных работ", TypeOfWork.ROAD_BUILDING);
        ToolSet electricityTool = new ToolSet("Набор инструментов для электромонтажных работ", TypeOfWork.ELECTRICITY_BUILDING);
        ToolSet paintTool = new ToolSet("Набор инструментов для покрасочных работ", TypeOfWork.PAINTING_WORKS);
        ToolSet flowersTool = new ToolSet("Набор инструментов для посадки растений", TypeOfWork.FLOWERS_PLANTING);
        ToolSet houseTool = new ToolSet("Набор инструментов для строительных работ", TypeOfWork.HOUSE_BUILDING);
        ToolSet rocketTool = new ToolSet("Набор инструментов для ракетостроительных работ", TypeOfWork.ROCKET_DETAIL_BUILDING);
        ToolSet lowerInstallTool = new ToolSet("Набор ключей зажигания для строительных авто", TypeOfWork.ROCKET_LOWER_INSTALLING);
        ToolSet upperInstallTool = new ToolSet("Набор ключей зажигания для строительных авто", TypeOfWork.ROCKET_UPPER_INSTALLING);
            //Грузовой транспорт
        Enginery truckKamaz = new Enginery("Грузовик Камаз", 150, sunCity);
        Enginery truckUral = new Enginery("Грузовик Урал", 150, sunCity);
        Enginery trackСarrierModel1 = new Enginery("Гусеничный транспортер №1", 275, sunCity);
        Enginery trackCarrierModel2 = new Enginery("Гусеничный транспортер №2", 275, sunCity);
        Enginery towerCrane = new Enginery("Башенный кран", 350, sunCity);
        Enginery helicopter = new Enginery("Вертолет", 600, spaceCity);
            //Персонажи
        Person knownothing = new Person("Незнайка", flowerCity);
        Person citizenNikita = new Person("Житель Цветочного города Никита", flowerCity);
        Person citizenAlexey = new Person("Житель Цветочного города Леха", flowerCity);
        Person citizenArseniy = new Person("Житель Цветочного города Сеня", flowerCity);
        Person citizenLesya = new Person("Житель Цветочного города Леся", flowerCity);
        Person tubik = new Person("Тюбик", flowerCity);
        Person toropizhka = new Person("Торопыжка", flowerCity);
        Person vintik = new Person("Винтик", spaceCity);
        Person shpuntik = new Person("Шпунтик", spaceCity);
        Person fuksiya = new Person("Фуксия", spaceCity);
        Person seledochka = new Person("Селедочка", spaceCity);
        Person spaceWorkerPetya = new Person("Космический сотрудник Петя в голубом комбинезоне", spaceCity);
        Person spaceWorkerMax = new Person("Космический сотрудник Максим в голубом комбинезоне", spaceCity);
        Person citizenSonya = new Person("Житель Солнечного города Соня", sunCity);
        Person citizenTimur = new Person("Житель Солнечного города Тимур", sunCity);
        Person citizenArtem = new Person("Житель Солнечного города Тема", sunCity);
        Person spaceWorkerDanila = new Person("Космический сотруднк Даня", sunCity);
            //Ракета
        Rocket rocketFinal = new Rocket("1-SunRocket46-1391","Светло синий", "Сверхпрочная нержавеющая сталь", "Космопластмасса",
                "Теплоизоляционная оболочка из термопластмассы", 46);

        IRocket engine = new IRocket() {
            @Override
            public void startEngine() {
                System.out.println("Двигатели запущены и начали прогреваться\n\t");
            }
        };

        toropizhka.noticed();

        truckKamaz.move(spaceCity);
        truckKamaz.getCarInfo();
        truckUral.move(spaceCity);
        truckUral.getCarInfo();

        spaceWorkerPetya.takeTool(houseTool);
        spaceWorkerPetya.changeWork(TypeOfWork.HOUSE_BUILDING, house);
        spaceWorkerMax.takeTool(houseTool);
        spaceWorkerMax.changeWork(TypeOfWork.HOUSE_BUILDING, house);
        spaceCity.getResult();

        toropizhka.changeLocation(spaceCity);
        toropizhka.see();

        knownothing.changeLocation(spaceCity);
        System.out.println("У Незнайки был такой вид, будто он всю жизнь только тем и занимался, что строил космические городки\n");

        citizenNikita.changeLocation(spaceCity);
        citizenNikita.takeTool(roadTool);
        citizenNikita.changeWork(TypeOfWork.ROAD_BUILDING, road);
        citizenAlexey.changeLocation(spaceCity);
        citizenAlexey.takeTool(electricityTool);
        citizenAlexey.changeWork(TypeOfWork.ELECTRICITY_BUILDING, electricity);
        citizenArseniy.changeLocation(spaceCity);
        citizenArseniy.takeTool(flowersTool);
        citizenArseniy.changeWork(TypeOfWork.FLOWERS_PLANTING, flowers);
        citizenLesya.changeLocation(spaceCity);
        citizenLesya.takeTool(decorationTool);
        citizenLesya.changeWork(TypeOfWork.INDOOR_DECORATION, decoration);
        tubik.changeLocation(spaceCity);
        tubik.takeTool(paintTool);
        tubik.changeWork(TypeOfWork.PAINTING_WORKS, paint);
        spaceCity.getResult();


        citizenSonya.takeTool(rocketTool);
        citizenSonya.changeWork(TypeOfWork.ROCKET_DETAIL_BUILDING, rocketDetail);
        citizenTimur.takeTool(rocketTool);
        citizenTimur.changeWork(TypeOfWork.ROCKET_DETAIL_BUILDING, rocketDetail);
        citizenArtem.takeTool(rocketTool);
        citizenArtem.changeWork(TypeOfWork.ROCKET_DETAIL_BUILDING, rocketDetail);
        spaceWorkerDanila.takeTool(rocketTool);
        spaceWorkerDanila.changeWork(TypeOfWork.ROCKET_PARTS_BUILDING, rocketParts);
        sunCity.getResult();

        trackСarrierModel1.move(spaceCity);
        trackСarrierModel1.getCarInfo();

        trackCarrierModel2.move(spaceCity);
        trackCarrierModel2.getCarInfo();


        vintik.takeTool(lowerInstallTool);
        vintik.changeWork(TypeOfWork.ROCKET_LOWER_INSTALLING, rocketFinalLower);
        towerCrane.move(spaceCity);
        fuksiya.supervision();
        towerCrane.getCarInfo();

        System.out.println("________________**Прошло несколько дней**________________");

        shpuntik.takeTool(upperInstallTool);
        shpuntik.changeWork(TypeOfWork.ROCKET_UPPER_INSTALLING, rocketFinalUpper);
        helicopter.move(spaceCity);
        helicopter.getCarInfo();
        seledochka.supervision();
        rocketFinal.getCondition();
        
        rocketFinal.rocketDescription();
        Rocket.Draft.getDraftInfo();

        engine.startEngine();
        rocketFinal.checkTank();



    }
}