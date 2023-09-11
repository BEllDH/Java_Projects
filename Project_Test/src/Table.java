public class Table {
    public int width;
    public int height;

    public Table(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int area(){
        return width * height;
    }

    public static void main(String[] args) {
        Table t = new Table(3, 7);

        System.out.println(t.area());
    }
}
