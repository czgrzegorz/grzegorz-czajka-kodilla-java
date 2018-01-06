package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void addFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape sqr = new Square(2.5);
        //Shape trn = new Triangle(2.5, 3.5);
        //Shape crc = new Circle(3.5);

        //When
        collector.addFigure(sqr);


        //Then
        Assert.assertEquals(1, collector.getTheList().size());
    }

    @Test
    public void removeFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square sqr = new Square(2.5);
        collector.addFigure(sqr);

        //When
        boolean result = collector.removeFigure(sqr);


        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.getTheList().size());
    }

    @Test
    public void getFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape sqr = new Square(2.5);
        Shape trn = new Triangle(2.5, 3.5);
        collector.addFigure(sqr);
        collector.addFigure(trn);

        //When
        Shape retrievedShape = collector.getFigure(1);


        //Then
        Assert.assertEquals(trn, retrievedShape);
    }
}
