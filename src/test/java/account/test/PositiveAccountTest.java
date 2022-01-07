package account.test;

import account.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class PositiveAccountTest {
    private String name;

    public PositiveAccountTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {"И И"},
                {"Иван Кулебякин"},
                {"1234567 89123456789"},
                {"ёROP! >_~#$%^^&&"}
        };
    }
    @Test
    public void accountCheck() {
        Account account = new Account(name);
        boolean check = account.checkNameToEmboss(name);
        assertEquals(true, check) ;
    }
}



