public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age=12;
        if(age>=18){
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        }else{
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int t=-7;
        if(t<=5){
            System.out.println("На улице "+t+" градусов, нужно надеть шапку");
        }else {
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int v=140;
        if(v>60){
            System.out.println("Если скорость "+v+", то придется заплатить штраф");
        }else {
            System.out.println("Если скорость "+v+", то можно ездить спокойно");
        }


    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age=28;
        if(age>=2&&age<=6){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
        }
        if(age>=7&&age<=18){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
        }
        if(age>18&&age<24){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет");
        }
        if(age>=24){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу");
        }


    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age=14;
        if(age<5){
            System.out.println("Если возраст ребенка равен "+age+", нельзя кататься на аттракционе");
        }
        if(age>=5&&age<14){
            System.out.println("Если возраст ребенка равен "+age+", можно кататься на аттракционе в сопровождении взрослого");
        }
        if(age>=14){
            System.out.println("Если возраст ребенка равен "+age+", можно кататься на аттракционе без сопровождения взрослого");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int people=10;
        if(people>102){
            System.out.println("Вагон уже полностью забит, мест нет");
        }else {
            System.out.println("В вагоне есть свободные места,");
        }
        if(people<=60){
            System.out.println("Вы можете присесть");
        }
        if(people>60&&people<=102){
            System.out.println("но Вам придется постоять, сидячие места заняты");
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one=500;
        int two=50;
        int three=40;
        if(one>two&&one>three){
            System.out.println("Наибольшее число равно "+one);
        }
        if(two>one&&two>three){
            System.out.println("Наибольшее число равно "+two);
        }
        if(three>one&&three>two){
            System.out.println("Наибольшее число равно "+three);
        }

    }
}