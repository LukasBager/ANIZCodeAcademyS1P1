package Lesson07.Array.MiniPojects.Flower;

public class Flower {

    private String sort;
    private String color;

    public Flower() {
        this.sort = "unknown";
        this.color = "unknown";
    }

    public Flower(String sort, String color) {
        this.sort = sort;
        this.color = color;
    }


    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Flower [sort=" + sort + ", color=" + color + "]";
    }

}
