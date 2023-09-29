public class Wilder {
    private String firstname;
    private boolean aware;

    //Constructor
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //Setter
    public void setFirstname(String firstname){this.firstname = firstname;}
    public void setAware(boolean aware){this.aware = aware;}

    //Getter
    public String getFirstname() {return firstname;}
    public boolean getAware() {return aware;}

    public String whoAmI() {
        if (aware) {
            return "Je m'appelle " + firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + firstname + " et je ne suis pas aware";
        }
    }
}
