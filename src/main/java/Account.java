public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss () {

        if ( name.length()>=3 & name.length()<=19 & name.charAt(0)!=' ' & name.charAt(name.length()-1) != ' ' )
        {
            String[] split = name.split(" ");
            if (split.length == 2) {return true;} }
        return false;

    }
}

