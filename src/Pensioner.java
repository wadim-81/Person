import java.time.LocalDate;

public class Pensioner extends Person{

 private  static final double  PENSION_FOR_ALL = 2000;

    public Pensioner(String name, int age, LocalDate birthDate, int numberOfChildren) {
        setName(name);
        setAge(age);
        setBirthDate(birthDate);
        setNumberOfChildren(numberOfChildren);

    }
    @Override
    public String toString() {
        return "Pensioner{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", birthDate=" + getBirthDate() +
                ", numberOfChildren=" + getNumberOfChildren() +
                '}';
    }
    @Override
    double averageSalaryCalculation() {
        return CalculatorUtils.averageForThree(getMinSelary(),getMaxSelary(),PENSION_FOR_ALL);
    }
}
