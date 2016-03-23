import java.util.Objects;

/**
 * Created by bogdan on 23.03.2016.
 */
public class User {
    private String name;
    private String city;
    private int years;

    public User(String name, String city, int years) {
        this.name = name;
        this.city = city;
        this.years = years;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User otherObj = (User) obj;

        return (Objects.equals(name, otherObj.name)) && (Objects.equals(city, otherObj.city)) && (years == otherObj.years);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, years);
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Город: " + city + " Возраст: " + years;
    }
}
