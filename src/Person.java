import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String firstNameame;
    private String lastName;
    private LocalDate birthDay;

    public Person(String firstNameame, String lastName, LocalDate birthDay) {
        this.firstNameame = firstNameame;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public String getFirstNameame() {
        return firstNameame;
    }

    public void setFirstNameame(String firstNameame) {
        this.firstNameame = firstNameame;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstNameame='" + firstNameame + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
