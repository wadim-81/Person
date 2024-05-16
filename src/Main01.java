import java.time.LocalDate;

public class Main01 {
    public static void main(String[] args) {

        Worker worker = new Worker("Vasili", 37, LocalDate.of(1987, 10, 1),3);
        System.out.println(worker.toString());

    Pensioner pensioner = new Pensioner("Vitali",71,LocalDate.of(1953,11,3),2);
        System.out.println(pensioner.toString());
            }}
