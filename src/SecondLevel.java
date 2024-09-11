public class SecondLevel extends FirstLevel {
    private final String name;

    public SecondLevel(int id, MyEnum myEnum, ComplexType complexType, String name) {
        super(id, myEnum, complexType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println("SecondLevel details: " + toString());
    }

    public void printDetails(String prefix) {
        System.out.println(prefix + "SecondLevel details: " + toString());
    }

    public final void printDetails(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("SecondLevel details: " + toString());
        }
    }

    @Override
    public String toString() {
        return "SecondLevel{name='" + name + "', " + super.toString() + "}";
    }
}
