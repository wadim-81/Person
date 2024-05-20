import java.time.LocalDate;
import java.util.Random;

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

    public void goToWork() {
        Random random = new Random();

        int ran = random.nextInt();

        if (ran != 0) {
            System.out.println("Я вообще-то на пенсии");
        }
        else  {
            System.out.println("Ладно, немного поработаю");
        }
    }}