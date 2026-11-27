import zero.ui.Label;
import zero.ui.Button;
import zero.ui.Column;
import zero.App;

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
        plus.onClick(() -> {
            count++;
            counterLabel.setText("Count: " + count);
        });

        show(new Column(10, counterLabel, plus));
    }
    public static void main(String[] args) { launch(args); }
}
