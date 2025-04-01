public class ShapeTransformation {
    public void shapeTransformation() {
        double shapeValue = 42.75;
        int intShape = (int)shapeValue;
        long longShape = (long)shapeValue;
        float floatShape = (float)shapeValue;
        byte byteShape = (byte)shapeValue;
        short shortShape = (short)shapeValue;

        System.out.println("Current Shape (double): " + shapeValue);

        System.out.println("Transforming shapes...");
        System.out.println("Transformed into int: " + intShape);
        System.out.println("Transformed into long: " + longShape);
        System.out.println("Transformed into float: " + floatShape);
        System.out.println("Transformed into byte: " + byteShape);
        System.out.println("Transformed into short: " + shortShape);
    }
}
