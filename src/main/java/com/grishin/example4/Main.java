package com.grishin.example4;

public class Main {

    private static final String DATABASE_ADDRESS = "some address";
    public static Database database;

    public static void main(String[] args) {
        // Надо гарантировать, что объект Database не будет создан второй раз.
        someMethod1();
        someMethod2();
        someMethod3();
    }

    public static void someMethod1() {
        if (database == null) {
            database = new Database(DATABASE_ADDRESS);
        }

        // что-то делает с database
    }

    public static void someMethod2() {
        if (database == null) {
            database = new Database(DATABASE_ADDRESS);
        }

        // что-то делает с database
    }

    public static void someMethod3() {
        if (database == null) {
            database = new Database(DATABASE_ADDRESS);
        }

        // что-то делает с database
    }
}
