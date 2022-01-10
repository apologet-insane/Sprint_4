package account.test;

import account.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AccountTest {
    private String name;
    private boolean expectedCheck;

    public AccountTest(String name, boolean expectedCheck) {
        this.name = name;
        this.expectedCheck = expectedCheck;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {" Иван Кулябякин", false},
                {"Иван Кулебякин ", false},
                {"Иван  Кулебякин", false},
                {"ИванКулебякин", false},
                {"", false},
                {"   ", false},
                {"Иван Куле Бякин", false},
                {"12", false},
                {"1234 56789012345678902", false},
                {"И И", true},
                {"Иван Кулебякин", true},
                {"1234567 89123456789", true},
                {"ёROP! >_~#$%^^&&", true}
        };
    }
    @Test
    public void accountCheck() {
        Account account = new Account(name);
        boolean check = account.checkNameToEmboss(name);
        assertEquals(expectedCheck, check);
    }
}



