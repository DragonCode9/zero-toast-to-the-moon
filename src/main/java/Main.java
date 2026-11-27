import zero.App;
import zero.ui.Label;
import zero.ui.Button;
import zero.ui.Row;
import zero.ui.Column;

public class Main extends App {

    private int count = 0;
    @Override public void settings() {
        title("Counter App");
        size(400, 250);
        padding(20); 
    }

    public void setup() {
        Label counterLabel = new Label("Count: 0");

        Button plus = new Button("+");
        Button minus = new Button("-");
        Button reset = new Button("Reset");

        plus.onClick(() -> {
            count++;
            counterLabel.setText("Count: " + count);
        });

        minus.onClick(() -> {
            count--;
            counterLabel.setText("Count: " + count);
        });

        reset.onClick(() -> {
            count = 0;
            counterLabel.setText("Count: " + count);
        });

        Row buttons = new Row(10, minus, reset, plus);

        show(new Column(10, counterLabel, buttons));
    }
    public static void main(String[] args) { launch(args); }
}
