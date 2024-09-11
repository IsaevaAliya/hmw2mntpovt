public class Main {
    public static void main(String[] args) {
        ComplexType complexType = new ComplexType("Example", 123);

        SecondLevel objectA = new SecondLevel(1, MyEnum.VALUE1, complexType, "Object A");
        ThirdLevel objectB = new ThirdLevel(2, MyEnum.VALUE2, complexType, "Object B", "Description B");
        ThirdLevel objectC = new ThirdLevel(3, MyEnum.VALUE3, complexType, "Object C", "Description C");

        System.out.println(objectA);
        objectA.printDetails();
        objectA.printDetails("Prefix: ");
        objectA.printDetails(2);

        System.out.println(objectB);
        objectB.printDetails();
        objectB.printDetails("Prefix: ");
        objectB.printDetails(3);

        System.out.println(objectC);
        objectC.printDetails();
        objectC.printDetails("Prefix: ");
        objectC.printDetails(4);
    }
}