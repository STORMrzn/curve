import java.util.Arrays;

public class Curve {
    private Point[] points;
    double length;


    public Curve(Point... points) {
            this.points = points;
    }

    public String Line(Point... points) {
        String result = "Линия " + Arrays.toString(points).replace(", ", ",");
        return result;
    }

    public String toStringCurve(Point... points) {
        String res="";
        for (Point i : points) {
            System.out.println(i);
           res+=i +" ";
        }
        return "Ломаная: " + res;
    }

    public Line[] getAsLines(Point... points) {
        Line[] resultOfLine = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            resultOfLine[i]=new Line(points[i],points[i+1]);
        }
        return resultOfLine;
    }

    public double getLength(Point... points) {
        double sCurveLenght = 0.0;
        for (int i = 0; i < points.length - 1; i++) {
            Line sCurve = new Line(points[i], points[i + 1]);
            sCurveLenght +=sCurve.measureALine();
        }
        return sCurveLenght;
    }

}
