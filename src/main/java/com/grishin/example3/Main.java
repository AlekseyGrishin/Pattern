package com.grishin.example3;

public class Main {

    public static void main(String[] args) {
        // Нужно применить шаблон, благодаря которому можно было бы использовать этот же код с другим транспоритным средством
        // например Ship или Aircraft и при добавлении нового класса транспортного средства этот код не нужно было бы изменять

        LogisticSystem logisticSystem = new LogisticSystem();

        Point departure = new Point("Moscow");
        Point destination = new Point("Saint-Petersburg");
        Truck truck = new Truck();

        Route route = logisticSystem.createRoute(truck, departure, destination);
        truck.setRoute(route);
        truck.go();


    }
}

