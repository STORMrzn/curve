public class Line {
    private Point p1, p2;
    public Line(Point p1, Point p2) {
        this.p1=p1;
        this.p2=p2;
        //тут раньше создавал объекты. правда не понял как теперь работает если я не создаю объекты в конструкторе. долго думал как можно создать несколько конструкторов - один создает, другой присваивает
    }

    @Override
    public String toString() {
        return "Линия от " + p1.toString() + " до "
                + p2.toString();
    }

    public double measureALine() {
        double length;
        int katet1;
        int katet2;
        katet1= p2.x - p1.x;
        katet1*=katet1;
        katet2= p2.y - p1.y;
        katet2*=katet2;
        length = Math.sqrt(katet1+katet2);
        String textLength = "Длина гипотенузы= "+length;
        return length;
    }
}

