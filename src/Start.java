import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        //Задание Номер 3.
         //точки для ломаных линий
        Point p6=new Point(1,5);
        Point p7=new Point(2,8);
        Point p8=new Point(5,3);
        Point p9=new Point(8,9);
        Point p10=new Point(7,3);
        Point p11=new Point(1,9);
        Point p12=new Point(6,12);
        Point p13=new Point(2,22);
        //1.Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        //Point[] arrCurve = new Point[]{p6,p7,p8,p9};
        Curve c1 = new Curve(p6,p7,p8,p9);
        //System.out.println(Arrays.toString(arrCurve));
        //Point[] arrCurve2 = new Point[]{p10,p11,p12,p13};
       //Curve c1=new Curve(arrCurve);
        System.out.println("Задание 1:  "+c1.Line(p6,p7,p8,p9));
        //2.Рассчитать длину Ломаной
        System.out.println("Задание 2. Длина ломаной: "+c1.getLength(p6,p7,p8,p9));
        //3. Получить у Ломаной массив Линий
        System.out.println("Задание 3:  " + Arrays.toString(c1.getAsLines(p6,p7,p8,p9)));
        //4. Рассчитать длину массива Линий
        Line l4=new Line(p6,p7);
        Line l5=new Line(p7,p8);
        Line l6=new Line(p8,p9);
        double SumStraightsOfCurve = l4.measureALine() + l5.measureALine() + l6.measureALine();
        System.out.println("Задание 4: Суммарная длина 3 прямых в ломаной линий: " + SumStraightsOfCurve);
        //5. Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.print("Задание 5: Сравнение длин: ");
        System.out.print(SumStraightsOfCurve==c1.getLength(new Point []{p6,p7,p8,p9}));

        //6. Сдвинуть координату Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}. Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
        //координату можно сдвинуть
        System.out.println("\nЗадание 6");
        p7.x=12;
        System.out.println("Точка "+p7);
        System.out.println(c1.toStringCurve(p6,p7,p8,p9));
        System.out.println("Линия 4 изменена: "+ (l4.toString()));
        System.out.println("Линия 5 изменена: "+ (l5.toString()));
    }
}
