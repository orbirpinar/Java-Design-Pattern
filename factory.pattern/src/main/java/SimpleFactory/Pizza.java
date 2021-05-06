package SimpleFactory;

public abstract class Pizza {

    public String prepare() { return "Default prepare";}

    public String bake() {return "Default bake";}

    public String cut() {return "Default cut";}

    public String box() {return "Default box";}
}
