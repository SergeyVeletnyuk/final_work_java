package final_task2.Task2;

public class Toy {

    int id;
    String name;
    double weight;

    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", название=" + name + ", масса=" + weight + "]";
    }
}