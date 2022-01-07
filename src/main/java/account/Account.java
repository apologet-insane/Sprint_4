package account;

public class Account {

    private final String name;


    public Account(String name) {

        this.name = name;
    }


    public boolean checkNameToEmboss(String name) {
        boolean check = true;
        if(name.matches("[\\S]+\\s{1}+[\\S]+$")) {
            if(name.length()<=19){
                if(name.length()>=3) {
                    check = true;
                }else {check = false;}
            }else {check = false;}
        } else {check = false;}

        return  check;

    }
}