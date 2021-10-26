package world;

import com.kodilla.stream.sand.SandStorage;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        Country Polska = new Country("Polska",new BigDecimal(1));
        Country Ukraina = new Country("Ukraina",new BigDecimal(1));
        Country Niemcy = new Country("Niemcy",new BigDecimal(1));
        Country Nigeria = new Country("Nigeria",new BigDecimal(1));
        Country Maroko = new Country("Maroko",new BigDecimal(1));
        Country Nebraska = new Country("Nebraska",new BigDecimal(1));
        Country Wirginia = new Country("Wirginia",new BigDecimal(1));

        Continent Europa = new Continent("Europa");
        Continent Afryka = new Continent("Afryka");
        Continent USA = new Continent("USA");

        Europa.addCountry(Polska);
        Europa.addCountry(Ukraina);
        Europa.addCountry(Niemcy);
        Afryka.addCountry(Nigeria);
        Afryka.addCountry(Maroko);
        USA.addCountry(Nebraska);
        USA.addCountry(Wirginia);

        World world = new World();
        world.addContinent(Europa);
        world.addContinent(Afryka);
        world.addContinent(USA);

        //When
         BigDecimal all = world.getGetPeopleQuantityAll();

         //Then
         assertEquals(7,all);
    }
}
