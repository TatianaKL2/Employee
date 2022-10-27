public class Specialist extends Employee implements EmployeeVacation {
    private int levels;

    public Specialist(){;
    }

    public Specialist(String fio, int age, int salary, int levels, String dayOff) {
        super(fio, age, salary, dayOff);
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    void info (){
        super.info();
        System.out.println("Cпециалист " + getLevels() + " уровня" + "\n" + "Я работаю с клиентами" + "\n----------------");
    }

    @Override
    void meeting() {
        super.meeting();
        System.out.println("Я специалист " + getLevels() + " уровня. Работаю с клиентами. \n---------------");
    }

    @Override
    void goToDayOff() {
        System.out.println("Я " + getFio() + ", специалист " + getLevels() + " уровня. Мне нужен отгул, так как я " + getDayOff());
    }

    @Override
    public void goToVacation() {
        System.out.println("Я " + getFio() + ", специалист " + getLevels() + " уровня. Еду на Иссык-Куль.");
    }
}
