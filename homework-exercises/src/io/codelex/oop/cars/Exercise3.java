package io.codelex.oop.cars;

public class Exercise3 {
    public static void main(String[] args) {
        //Test all methods from CarService- adding, removing, searching etc. (or add testing to previously created class in the first part)

        //Create a new CarService
        CarService carService = new CarService();
        Manufacturer manufacturer = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("Audi", 1910, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Volkswagen", 1937, "Germany");
        Manufacturer manufacturer4 = new Manufacturer("Mercedes-Benz", 1926, "Germany");
        //Add 3 cars to the service
        carService.addCar(new Car("BMW", "M5", 100000,2019 , manufacturer, EngineType.V12));
        carService.addCar(new Car("Audi", "A8", 90000,2018 , manufacturer2, EngineType.V8));
        carService.addCar(new Car("Volkswagen", "Golf", 50000,2017 , manufacturer3, EngineType.V6));
        carService.addCar(new Car("Mercedes-Benz", "S-Class", 80000,2016 , manufacturer4, EngineType.S6));
        carService.addCar(new Car("BMW", "M3", 70000,2015 , manufacturer, EngineType.S4));
        carService.addCar(new Car("Audi", "A6", 60000,2014 , manufacturer2, EngineType.S3));
        carService.addCar(new Car("Volkswagen", "Passat", 50000,2013 , manufacturer3, EngineType.V12));
        carService.addCar(new Car("Mercedes-Benz", "E-Class", 40000,2012 , manufacturer4, EngineType.V8));
        carService.addCar(new Car("BMW", "M2", 30000,2011 , manufacturer, EngineType.V6));
        carService.addCar(new Car("Audi", "A4", 20000,2010 , manufacturer2, EngineType.S6));
        carService.addCar(new Car("Volkswagen", "Polo", 10000,2009 , manufacturer3, EngineType.S4));
        carService.addCar(new Car("Mercedes-Benz", "C-Class", 5000,2008 , manufacturer4, EngineType.S3));
        carService.addCar(new Car("BMW", "M1", 4000,2007 , manufacturer, EngineType.V12));
        carService.addCar(new Car("Audi", "A3", 3000,2006 , manufacturer2, EngineType.V8));
        carService.addCar(new Car("Volkswagen", "Golf", 2000,2005 , manufacturer3, EngineType.V6));
        carService.addCar(new Car("Mercedes-Benz", "B-Class", 1000,2004 , manufacturer4, EngineType.S6));
        carService.addCar(new Car("BMW", "M4", 500,2003 , manufacturer, EngineType.S4));
        carService.addCar(new Car("Audi", "A2", 400,2002 , manufacturer2, EngineType.S3));
        carService.addCar(new Car("Volkswagen", "Golf", 300,2001 , manufacturer3, EngineType.V12));
        carService.addCar(new Car("Mercedes-Benz", "A-Class", 200,2000 , manufacturer4, EngineType.V8));
        carService.addCar(new Car("BMW", "M6", 100,1999 , manufacturer, EngineType.V6));
        carService.addCar(new Car("Audi", "A1", 50,1998 , manufacturer2, EngineType.S6));
        carService.addCar(new Car("Volkswagen", "Golf", 25,1997 , manufacturer3, EngineType.S4));
        carService.addCar(new Car("Mercedes-Benz", "GLA-Class", 10,1996 , manufacturer4, EngineType.S3));
        carService.addCar(new Car("BMW", "M5", 5,1995 , manufacturer, EngineType.V12));
        carService.addCar(new Car("Audi", "A8", 4,1994 , manufacturer2, EngineType.V8));
        carService.addCar(new Car("Volkswagen", "Golf", 3,1993 , manufacturer3, EngineType.V6));
        carService.addCar(new Car("Mercedes-Benz", "S-Class", 2,1992 , manufacturer4, EngineType.S6));



        //Print all cars
        System.out.println("All cars:"+carService.getCars());
        System.out.println("All cars with V12 engine:"+carService.getCarsWithV12Engine());

        System.out.println("All cars produced before 1999:"+carService.getCarsProducedBefore1999());


        System.out.println("The most expensive car:"+carService.getMostExpensiveCar());


        System.out.println("The cheapest car:"+carService.getCheapestCar());

        System.out.println("All cars sorted by price ascending:"+carService.getCarsSortedByPrice(true));
        System.out.println("All cars sorted by price descending:"+carService.getCarsSortedByPrice(false));
        System.out.println("Is BMW M5 on the list:"+carService.isCarOnTheList(new Car("BMW", "M5", 2019, 100000, manufacturer, EngineType.V12)));
        System.out.println("All cars manufactured by BMW:"+carService.getCarsByManufacturer(manufacturer));
        System.out.println("All cars manufactured by manufacturers with year of establishment < 1920:"+carService.getCarsByManufacturerYearOfEstablishment(manufacturer));


    }
}
