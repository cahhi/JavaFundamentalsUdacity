package creatingClass;

public class Dog {

    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog (String dogType, String dogName, String dogColor, int dogAge) {
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public String getDogType() {
        return dogType;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogColor() {
        return dogColor;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogType() {
        this.dogType = dogType;
    }

    public void setDogName() {
        this.dogName = dogName;
    }

    public void setDogColor() {
        this.dogColor = dogColor;
    }

    public void setDogAge() {
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "Dog Type: " + dogType + " Dog Name: " + dogName + " Dog Color: " + dogColor + " Dog Age: " + dogAge;
    }


}
