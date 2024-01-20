package homework30Pattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        CountriesFactory countriesFactory = new CountriesFactory();
        Countries countries = countriesFactory.getContries("Belarus");
        countries.population();
        Countries countries2 = countriesFactory.getContries("France");
        countries2.population();
        Countries countries3 = countriesFactory.getContries("Germany");
        countries3.population();
    }
}
