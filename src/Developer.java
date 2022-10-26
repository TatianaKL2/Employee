public class Developer extends Employee {
    private String grades;

    public Developer() {
    }

    public Developer(String fio, int age, int salary, String grades, String dayOff) {
        super(fio, age, salary, dayOff);
        this.grades = grades;
    }


    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    @Override
    void info (){
        super.info();
        System.out.println(getGrades() + " разработчик" + "\n" + "Я пишу код" + "\n----------------");
    }

    @Override
    void meeting() {
        super.meeting();
        System.out.println("Я " + getGrades() + " разработчик. Пишу код. \n---------------");
    }

    @Override
    void goToDayOff() {
        System.out.println("Я " + getFio() + ", " + getGrades() + " разработчик. Мне нужен отгул, так как я " + getDayOff());
    }
}
