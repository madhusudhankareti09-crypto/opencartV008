package utilities;

import org.apache.commons.lang3.RandomStringUtils;


public class TestDataFactory {
    public static String randomString() {
        String genaratedstring = RandomStringUtils.randomAlphabetic(5);
        return genaratedstring;
    }

    public static String randomNumber() {
        String genaratednumber = RandomStringUtils.randomNumeric(10);
        return genaratednumber;
    }

    public static String randomeAlfaNumberic() {
        String genaratedstring = RandomStringUtils.randomAlphabetic(3);
        String genaratednumber = RandomStringUtils.randomNumeric(3);

        return (genaratedstring + "$" + genaratednumber);
    }

}
