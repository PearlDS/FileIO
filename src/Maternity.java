import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Maternity {
    public static void main(String[] args) {


        Person person = new Person("An", "Pan", LocalDate.of(1896, 4, 1) );

        Path path = Path.of("..\\people");
        Path personPath = Path.of(path.toString()+"\\"+person.getFirstNameame()+person.getLastName());

        try {

            if(Files.notExists(path)){
                Files.createDirectory(path);
            }

        if (Files.notExists(personPath)){
            Files.createFile(personPath);
        }


        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(personPath.toString()))) {
            objectOutputStream.writeObject(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
