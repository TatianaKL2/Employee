public class Manager extends Employee implements EmployeeVacation {
    private boolean hasStocks;

    public Manager() {
    }

    public Manager(String fio, int age, int salary, boolean hasStocks, String dayOff) {
        super(fio, age, salary, dayOff);
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    @Override
    void info (){
        super.info();
        System.out.println(isHasStocks() + "\n" + "Я разрабатываю процедуры" + "\n----------------");
    }

    @Override
    void meeting() {
        super.meeting();
        System.out.println("Я менеджер. Разрабатываю процедуры. \n---------------");
    }

    @Override
    void goToDayOff() {
        System.out.println("Я " + getFio() + ", менеджер. Мне нужен отгул, так как я " + getDayOff());
    }

    @Override
    public void goToVacation() {
        System.out.println("Я " + getFio() + ", менеджер. Еду на дачу");
    }
}
