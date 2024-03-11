package abramyants.Workers;

import abramyants.Company.Vacancy;


public interface Observer {

    boolean receiveOffer(Vacancy vacancy);

    public String getName();

    public double getMinSalary();

    public int getGRADE();

}
