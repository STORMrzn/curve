class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        String result="{"+x+";"+y +"}";
        return result;
    }
}
