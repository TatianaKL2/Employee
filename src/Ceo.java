public class Ceo extends Manager{
    private boolean hasCompanyCar;

    public Ceo() {
    }

    public Ceo (String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar, String dayOff) {
        super(fio, age, salary, hasStocks, dayOff);
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

//    public String toString(){
//        return getFio() + "\n" +
//                getAge() + "\n" +
//                getSalary() + " сом" + "\n"+
//                isHasStocks() + "\n" +
//                isHasCompanyCar() + "\n" + "Я работаю над IPO";
//    }

    public String toString(){
        return "Меня зовут " + getFio() + ". Мне " + getAge() + " (года/лет). Я CEO, работаю над IPO";
    }
    void goToDayOff(){
        System.out.println("Я " + getFio() + ". Мне нужен отгул, так как " + getDayOff());
    }
}
