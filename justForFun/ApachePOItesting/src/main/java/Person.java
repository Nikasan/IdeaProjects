import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;
import lombok.Data;

@Data
@Sheet
public class Person {

    @SheetColumn("ID")
    private String id;
    @SheetColumn("Name")
    private String name;
    @SheetColumn("Age")
    private String age;
    @SheetColumn("Gender")
    private String gender;
    @SheetColumn("Height (mts)")
    private String height;
    @SheetColumn("Address")
    private String address;
}
