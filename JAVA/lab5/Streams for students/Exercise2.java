import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collection;



public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();

		Map<String, Optional<City>> highCityCont = countryDao.findAllCountries()
                .stream()
                .flatMap(country -> country.getCities().stream())
                .collect(Collectors.groupingBy(city -> countryDao.findCountryByCode(city.getCountryCode())
						.getContinent(),Collectors.maxBy(Comparator.comparing(City::getPopulation))));


				for(String key : highCityCont.keySet())
				{
					System.out.println(key+" "+highCityCont.get(key).get());
				}
				
	}

    }
	
	
