import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> data = Conole.userData();
        double result = Logic.indexCount(data.get(0), data.get(1));
        Decorator.decorate(result);
    }
}
