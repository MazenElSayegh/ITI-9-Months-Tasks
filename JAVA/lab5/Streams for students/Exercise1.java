import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
     CountryDao countryDao= InMemoryWorldDao.getInstance(); 
		 CityDao cityDao = InMemoryWorldDao.getInstance();
		 
	 List<City>	HighestPop =
			 countryDao.findAllCountries().stream()
	  
	  .map( country -> country.getCities().stream().max ( Comparator.comparingInt(City::getPopulation) ) )
	  .filter(Optional::isPresent)
	  .map(Optional::get)
	  .collect( Collectors.toList() ); 
	  
	  HighestPop.forEach(value -> System.out.println(value));  
   
   }

}