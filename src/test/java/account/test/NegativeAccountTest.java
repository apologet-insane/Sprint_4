package account.test;

import account.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class NegativeAccountTest {
    private String name;

    public NegativeAccountTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {" Иван Кулябякин"},
                {"Иван Кулебякин "},
                {"Иван  Кулебякин"},
                {"ИванКулебякин"},
                {""},
                {"   "},
                {"Иван Куле Бякин"},
                {"12"},
                {"1234 56789012345678902"}
        };
    }
    @Test
    public void accountCheck() {
        Account account = new Account(name);
        boolean check = account.checkNameToEmboss(name);
        assertEquals(false, check) ;
    }
}



