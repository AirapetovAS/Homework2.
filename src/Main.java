public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);

        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);

    }

    public static void task3 () {
        System.out.println("Задача 3");

        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);

    }

    public static void task4() {
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");

        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;

        var totalWeightBoxer = weightOneBoxer + weightSecondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeightBoxer + " кг." );

        totalWeightBoxer = weightOneBoxer - weightSecondBoxer;
        System.out.println("Разница между весами бойцв " + totalWeightBoxer + " кг.");

    }
    public static void task7() {
        System.out.println("Задача 7");

        var weightOneBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeightBoxer = 160.9;
        var differenceWeight = -4.7;

        totalWeightBoxer = weightSecondBoxer - weightOneBoxer;
        System.out.println("Разница весов: 1 способ: " + totalWeightBoxer + " кг. ");

        differenceWeight = (weightOneBoxer - weightSecondBoxer) % totalWeightBoxer;
        System.out.println("Разница весов: 2 способ: " + totalWeightBoxer + " кг. ");


    }
    public static void task8 () {
        System.out.println("Задача 8");

        var totalHours = 640;
        var oneEmployeeHours = 8;
        var moreEmployees = 94;

        var totalEmployees = totalHours / oneEmployeeHours;
        System.out.println("Всего работников в компании: " + totalEmployees + " человек ");

        var workingHouseBetweenEmployees = (totalEmployees + moreEmployees) * oneEmployeeHours;
        System.out.println("Если в компании рабоатет 80 человек, то всего " +
                workingHouseBetweenEmployees + " часов работы может быть поделено между сотрудниками");
    }

}