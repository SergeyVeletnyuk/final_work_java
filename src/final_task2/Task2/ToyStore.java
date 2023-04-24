package final_task2.Task2;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyStore {
    private static List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }

    public Toy getToyForPrice() {
        RandomToyChooser random = new RandomToyChooser();
        Toy toy = random.chooseOnWeight(toys);
        System.out.println(toy);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("src/final_task2/Task2/Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}


