import java.io.*;
import java.nio.file.Path;

public class CivilService {

    public static void main(String[] args) {


        Path path = Path.of("..\\people");

        File peopleDirectory = path.toFile();
        File [] files = peopleDirectory.listFiles();

        for (File file : files){

            if (file.isFile()){

                try (ObjectInputStream objectInputStream = new ObjectInputStream( new FileInputStream(file.getAbsoluteFile()))){

                    Person person = (Person) objectInputStream.readObject();
                    System.out.println(person);


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }


            }



        }




    }
}
