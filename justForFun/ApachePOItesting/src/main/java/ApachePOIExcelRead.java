import io.github.millij.poi.SpreadsheetReadException;
import io.github.millij.poi.ss.reader.XlsReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ApachePOIExcelRead {


    //need to use type of file Microsoft Excel 97-2003 Worksheet (.xls)
    private static final String FILE_PERSONS = "C:\\Users\\Veranika_Pekhtserava\\Documents\\projects\\IdeaProjects\\justForFun\\ApachePOItesting\\src\\main\\resources\\xlsx_sample_single_sheet.xls";
    private static final String FILE_MY = "C:\\Users\\Veranika_Pekhtserava\\Documents\\projects\\IdeaProjects\\justForFun\\ApachePOItesting\\src\\main\\resources\\AddressBook.xls";
    private List<Person> people = new ArrayList();
    private List<MyPeople> my = new ArrayList();

    public List<Person> getPersonsFromFile() throws SpreadsheetReadException {
        final XlsReader reader = new XlsReader();
        people = reader.read(Person.class, new File(FILE_PERSONS));
        return people;
    }

    public List<MyPeople> getMyPeopleFromFile() throws SpreadsheetReadException {
        final XlsReader reader = new XlsReader();
        my = reader.read(MyPeople.class, new File(FILE_MY));
        return my;
    }
}
