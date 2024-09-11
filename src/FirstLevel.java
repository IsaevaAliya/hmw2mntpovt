public class FirstLevel {
    private final int id;
    private final MyEnum myEnum;
    private final ComplexType complexType;

    public FirstLevel(int id, MyEnum myEnum, ComplexType complexType) {
        this.id = id;
        this.myEnum = myEnum;
        this.complexType = complexType;
    }

    public int getId() {
        return id;
    }

    public MyEnum getMyEnum() {
        return myEnum;
    }

    public ComplexType getComplexType() {
        return complexType;
    }

    @Override
    public String toString() {
        return "FirstLeve{id=" + id + ", myEnum=" + myEnum + ", complexType=" + complexType + "}";
    }
}