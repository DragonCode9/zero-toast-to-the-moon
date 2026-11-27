import zero.App;
import zero.ui.Label;
import zero.ui.Button;
import zero.ui.Row;
import zero.ui.Column;

public class Main extends App {

    private long count = 0;
    @Override public void settings() {
        title("Counter App");
        size(400, 250);
        padding(20); 
    }

    public void setup() {
        Label counterLabel = new Label("Count: 0");
        Label textNote = new Label("Press - to minus 1 | Press + to add 1 | Press x2 to multiply 2");
        Label textNote2 = new Label("Press Reset to change counter to 0");

        Button plus = new Button("+");
        Button minus = new Button("-");
        Button reset = new Button("Reset");
        Button multiplyTwo = new Button("x2");

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

        multiplyTwo.onClick(() -> {
            count *= 2;
            counterLabel.setText("Count: " + count);
        });

        Row buttons = new Row(10, minus, reset, plus, multiplyTwo);

        show(new Column(10, counterLabel, buttons, textNote, textNote2));
    }
    public static void main(String[] args) { launch(args); }
}
