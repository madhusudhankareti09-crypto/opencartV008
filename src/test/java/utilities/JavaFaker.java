package utilities;


import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {


    @Test
    public void generateFakeData() {

        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String company = faker.company().name();
        String address = faker.address().fullAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String country = faker.address().country();
        String pincode = faker.address().zipCode();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        String telephone = faker.phoneNumber().phoneNumber();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(company);
        System.out.println(address);
        System.out.println(city);
        System.out.println(state);
        System.out.println(country);
        System.out.println(pincode);
        System.out.println(email);

    }
}
