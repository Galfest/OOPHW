package abramyants.JobAgency;

import abramyants.Company.Vacancy;
import abramyants.Workers.Observer;

import java.util.List;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    List<Observer> sendOffer(Vacancy vacancy);


}