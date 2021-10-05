import io.github.millij.poi.SpreadsheetReadException;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {

    @Test
    public void readFileTest() throws SpreadsheetReadException {
        ApachePOIExcelRead reader = new ApachePOIExcelRead();
        List<Person> personsFromFile = reader.getPersonsFromFile();
        assertThat(personsFromFile).isNotEmpty();
    }

    @Test
    public void readMyFileTest() throws SpreadsheetReadException {
        ApachePOIExcelRead reader = new ApachePOIExcelRead();
        List<MyPeople> myPeoples = reader.getMyPeopleFromFile();
        assertThat(myPeoples).isNotEmpty();
    }
}
