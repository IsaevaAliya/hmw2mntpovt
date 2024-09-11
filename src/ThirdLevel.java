public final class ThirdLevel extends SecondLevel {
    private final String description;

    public ThirdLevel(int id, MyEnum myEnum, ComplexType complexType, String name, String description) {
        super(id, myEnum, complexType, name);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void printDetails() {
        System.out.println("ThirdLevel details: " + toString());
    }

    @Override
    public String toString() {
        return "ThirdLevel{description='" + description + "', " + super.toString() + "}";
    }
}
