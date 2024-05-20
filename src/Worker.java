import java.time.LocalDate;

public class Worker extends Person {

    public Worker(String name, int age, LocalDate birthDate, int numberOfChildren) {
        setName(name);
        setAge(age);
        setBirthDate(birthDate);
        setNumberOfChildren(numberOfChildren);
    }



    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", birthDate=" + getBirthDate() +
                ", numberOfChildren=" +getNumberOfChildren() +
                '}';

    }




    @Override
double averageSalaryCalculation(){

    return CalculatorUtils.averageForTwo(getMinSelary(), getMaxSelary());


}
public void goToWork(){
    System.out.println("Я счастливо шагаю на работу");
}


    }






