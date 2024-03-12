public class Main {
    public static void main(String[] args) {

        //Первое задание
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Второе задание
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Третье задание
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Четвертое задание
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        //Пятое задание
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +  4;
        System.out.println(frog);
        System.out.println();

        //Шестое задание
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalWeight);
        var differenceBetweenWeights = boxerWeight2 - boxerWeight1;
        System.out.println(differenceBetweenWeights);
        System.out.println();

        //Седьмое задание
        var remainderOfDivision = boxerWeight2 % boxerWeight1;
        System.out.println(remainderOfDivision);
        System.out.println();

        //Восьмое задание
        var generalWorkHours = 640;
        var personWorkHours = 8;
        var workers = generalWorkHours / personWorkHours;
        System.out.println("Всего работников компании " + workers + " человек");
        workers = workers + 94;
        generalWorkHours = workers * personWorkHours;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + generalWorkHours + " часов работы может быть поделено между сотрудниками");

    }
}