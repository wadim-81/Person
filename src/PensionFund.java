   public class PensionFund {

   public final double  PERCENT = 0.7;
//расчет средней пенсии
    public double calculationSalary(Person person) {
        return person.averageSalaryCalculation() * PERCENT;
    }


}

