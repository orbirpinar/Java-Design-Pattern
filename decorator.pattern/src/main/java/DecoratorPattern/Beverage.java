package DecoratorPattern;

public abstract class Beverage {

    public String description = "Unknown beverage";
    public Enum<Size> size;


    public String getDescription() {
        return description;
    }

    public Enum<Size> getSize() {
        return size;
    }

    public void setSize( Enum<Size> size) {
        this.size = size;
    }
    public abstract double cost();
}
