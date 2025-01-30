//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Task2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Task3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Task4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
        //Task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Task6
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        var differentWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Общая масса бойцов " + totalWeight + " кг");
        System.out.println("Разница между массами бойцов " + differentWeight + " кг");
        //Task7
        var overWeight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Остаток между массами бойцов " + overWeight + " кг");
        //Task8-1
        var totalHours = 640;
        var hoursPerWoker = 8;
        var totalWokersInCompany = totalHours / hoursPerWoker;
        System.out.println("Всего работников в компании — " + totalWokersInCompany + " человек");
        //Task8-2
        totalWokersInCompany = totalWokersInCompany + 94;
        totalHours = totalWokersInCompany * hoursPerWoker;
        System.out.println("Если в компании работает " + totalWokersInCompany + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками" );
    }
}