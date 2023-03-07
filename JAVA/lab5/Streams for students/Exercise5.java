import java.util.Comparator;
import java.util.Objects;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import java.util.Optional;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
       //write your answer here 
	    List<City> AllCap= 
			countryDao.findAllCountries()
						.stream()
						.map(Country->Country.getCapital())
						.filter(Objects::nonNull)
						.map(cityDao::findCityById)
						.filter(Objects::nonNull)
						.collect(toList());	
						/*City maxpop=AllCap.get(0);
						for(int i=1;i<AllCap.size();i++)
						{
							if(AllPopCap.get(i).getPopulation()>maxpop.getPopulation())
								maxpop=HighestPopCap.get(i);
						}*/
			Optional<City> HighestPopCap= AllCap.stream()
											.max(Comparator.comparing(City-> City.getPopulation()));
						   
						   System.out.println("Highest populated capital: "+HighestPopCap.get());
    }
}