import com.kodilla.exception.io.FileReader1;
import com.kodilla.exception.io.FileReader2;
import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FileReaderTestSuite {

    @Test
    void testReadSuite() {
        //Given
        FileReader1 fileReader1 = new FileReader1();
        //When and Then
        assertDoesNotThrow(() -> fileReader1.readFile());
    }
    @Test
    void whenFileDosentExistsReadFileShouldThrowException() {
// Given
        FileReader2 fileReader2 =  new FileReader2();
        String fileName = "nie ma pliku";
        //When and Then
        assertThrows(FileReaderException.class,() -> fileReader2.readFile(fileName));
    }
    @Test
    void testRealFileWithName() {
        FileReader2 fileReader2 = new FileReader2();
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader2.readFile("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader2.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader2.readFile("names.txt"))
        );
    }
}
