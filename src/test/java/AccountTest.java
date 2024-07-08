import com.github.javafaker.Faker;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void trueAccountName ()

    {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));
        Account account = new Account(faker.letterify("????? ??????"));
        boolean result = account.checkNameToEmboss();
        assertEquals(result, true);
    }
    @Test
    public void lengthStrLessTree ()

    {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));
        Account account = new Account(faker.letterify("??"));
        boolean result = account.checkNameToEmboss();
        assertEquals(result, false);
    }
    @Test
    public void lengthStrMoreTwenty ()

    {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));
        Account account = new Account(faker.letterify("?????????? ???????????"));
        boolean result = account.checkNameToEmboss();
        assertEquals(result, false);
    }
    @Test
    public void countSpaseMoreOne ()

    {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));
        Account account = new Account(faker.letterify("???? ????? ????"));
        boolean result = account.checkNameToEmboss();
        assertEquals(result, false);
            }
    @Test
    public void spaseFirstStr ()

    {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));
        Account account = new Account(faker.letterify(" ???? ?????"));
        boolean result = account.checkNameToEmboss();
        assertEquals(result, false);
    }
    @Test
    public void spaseLastStr ()

    {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));
        Account account = new Account(faker.letterify("???? ????? "));
        boolean result = account.checkNameToEmboss();
        assertEquals(result, false);
    }
}
