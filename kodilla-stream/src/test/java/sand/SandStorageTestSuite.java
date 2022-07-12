package sand;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SandStorageTestSuite {

    @Test
    void testGetSandTestSuiteQuantity() {

        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
//When
        BigDecimal totalSand = BigDecimal.ZERO;  //new BigDecimal("0");
        for (SandStorage continent : continents) {
            totalSand = totalSand.add(continent.getSandBeansQuantity());
        }

//Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");
        assertEquals(expectedSand, totalSand);
    }

    @Test
    void testGetSandBeansQuantityWithReduce() throws InterruptedException {
        //Given
        List<SandStorage> continents = new ArrayList<>();
        continents.add(new Europe());
        continents.add(new Asia());
        continents.add(new Africa());
        //When
        BigDecimal totalSand = continents.stream()
                .map(SandStorage::getSandBeansQuantity)

                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedSand = new BigDecimal("211111110903703703670");      // [4]
        assertEquals(expectedSand, totalSand);


        }

    }
