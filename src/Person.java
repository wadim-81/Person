import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {


    private String name;
    private int age;
    private LocalDate birthDate;
    private int height;
    private int numberOfChildren;

    private double maxSelery;
    private double minSelery;



    private static final int MINIMAL_WORK_AGE = 18;

    public  double averageSalary(double minSelery, double maxSelery){
        return CalculatorUtils.averageForTwo(this.minSelery, this.maxSelery);

    }
    abstract double averageSalaryCalculation();

    public void greetings() {
        System.out.println("Привет меня зовут  " + name);
    }

    public void info() {
        System.out.println("Мне " + age + " лет, я родился " + birthDate + ", мой рост " + height + " см, у меня " + numberOfChildren + " детей.");
    }

    public int getExperience() {
        int experience = age - MINIMAL_WORK_AGE;
        return experience;
    }






    public double getMaxSelary() {
        return maxSelery;
    }

    public void setMaxSelery(double maxSelery) {
        this.maxSelery = maxSelery;
    }

    public double getMinSelary() {
        return minSelery;
    }

    public void setMinSelery(double minSelery) {
        this.minSelery = minSelery;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && numberOfChildren == person.numberOfChildren && Double.compare(maxSelery, person.maxSelery) == 0 && Double.compare(minSelery, person.minSelery) == 0 && Objects.equals(name, person.name) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthDate, height, numberOfChildren, maxSelery, minSelery);
    }

}