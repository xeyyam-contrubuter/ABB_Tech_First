package az.abbtech.lesson_7;

public class Box {
    public String color;
    public int width;

    public Box(String color, int width) {
        this.color = color;
        this.width = width;
    };

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Box box) {
            boolean isEquals = this.color.equals(box.color) && this.width == box.width;
            return isEquals;

        }
        return false;
    }
}
