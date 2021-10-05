import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
import lombok.Data;

@Data
@Sheet
public class MyPeople {

    @SheetColumn("Name")
    private String name;
    @SheetColumn("Surname")
    private String surname;
    @SheetColumn("Date of birth")
    private String dob;
    @SheetColumn("Adress")
    private String address;
}
