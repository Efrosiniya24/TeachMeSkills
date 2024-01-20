package homework30Pattern.FactoryMethod;

public class CountriesFactory {
    public Countries getContries(String country) {
        switch (country.toLowerCase()) {
            case "belarus" -> {
                return new Belarus();
            }
            case "germany" -> {
                return new Germany();
            }
            case "france" -> {
                return new France();
            }
        }
        return null;
    }
}
