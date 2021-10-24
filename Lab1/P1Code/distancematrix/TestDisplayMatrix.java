package distancematrix;

public class TestDisplayMatrix {
    DistanceMatrix matrix = new DistanceMatrix();
    DisplayMatrix display = new DisplayMatrix( matrix );
    display.@setVisible( true );
}