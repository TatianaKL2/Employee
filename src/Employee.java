public abstract class Employee {
    private String fio;
    private int age;
    private int salary;
    private String dayOff;

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }

    public Employee() {
    }

    public Employee(String fio, int age, int salary, String dayOff) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
        this.dayOff = dayOff;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    void info (){
        System.out.println(getFio() + "\n" + getAge() + "\n" + getSalary() + " сом");
    }
    void meeting(){
        System.out.println("Меня зовут " + getFio() + ". Мне " + getAge() + " (года/лет)");
    }
    abstract void goToDayOff();
}
