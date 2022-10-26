
public class Main {
    public static void main(String[] args) {
        Specialist one = new Specialist("Андрей", 32, 25000, 4, "заболел гриппом.");
        Specialist two = new Specialist();
        two.setFio("Мээрим");
        two.setAge(22);
        two.setSalary(150000);
        two.setLevels(5);
        two.setDayOff("ухожу в декрет.");
        Specialist three = new Specialist();
        three.setFio("Айнура");
        three.setAge(19);
        three.setSalary(50600);
        three.setLevels(4);
        three.setDayOff("уезжаю загород.");

        Developer oone = new Developer("Анастасия", 27, 54000, "Junior", "уезжаю на повышение квалификации.");
        Developer ttwo = new Developer("Кубатбек", 24, 65000, "Middle", "женюсь.");
        Developer tthree = new Developer();
        tthree.setFio("Айдар");
        tthree.setAge(34);
        tthree.setSalary(85000);
        tthree.setGrades("Middle");
        tthree.setDayOff("уезжаю на обучение.");
        Developer four = new Developer("Айканыш", 24, 70000, "Senior", "уезжаю на обучение.");

        Manager mng = new Manager("Искен", 45, 65000, true, "улетаю на отдых.");
        Manager mng1 = new Manager();
        mng1.setFio("Сезим");
        mng1.setAge(33);
        mng1.setSalary(63000);
        mng1.setHasStocks(false);
        mng1.setDayOff("выхожу замуж.");

        Ceo ceo = new Ceo("Владимир", 28, 120000, true, true, "слет CEO стран СНГ.");

//        one.info();
//        two.info();
//        three.info();
//
//        oone.info();
//        ttwo.info();
//        tthree.info();
//        four.info();
//
//        mng.info();
//        mng1.info();
//
//        System.out.println(ceo);
//        Employee[] employees = {one, two, three, oone, ttwo, tthree, four,mng, mng1};
//        for (Employee e : employees){
//            e.meeting();
//        }
//        System.out.println(ceo);
        one.goToDayOff();
        two.goToDayOff();
        three.goToDayOff();

        oone.goToDayOff();
        ttwo.goToDayOff();
        tthree.goToDayOff();
        four.goToDayOff();

        mng.goToDayOff();
        mng1.goToDayOff();

        ceo.goToDayOff();

    }
}