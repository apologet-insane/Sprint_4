package account;

public class Account {

    private final String name;


    public Account(String name) {

        this.name = name;
    }

    public boolean checkNameToEmboss(String name) {
        boolean check = true;

        if (name.matches("(?=[\\S]+\\s{1}+[\\S]+$)(.{3,19})")) {
            check = true;
        }
        else {
            check = false;
        }
       return check;

    }
}