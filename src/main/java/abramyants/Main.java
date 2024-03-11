package abramyants;

import abramyants.Company.Company;
import abramyants.JobAgency.JobAgency;
import abramyants.Workers.Master;
import abramyants.Workers.Student;

public class Main {

    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 2; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
            System.out.println();
        }
    }
}