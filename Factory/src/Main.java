// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Factory Pattern\n");

        ShapeFactory shapeFactory = new ShapeFactory();
        // Notice that the overriding is happening here
        // Because shape1 is of Type shape, but it is a Circle Object
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        System.out.printf("\n");

        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();

        System.out.printf("\n");
        Shape shape3 = shapeFactory.getShape("CIRCLE");
        shape3.draw();
    }
}