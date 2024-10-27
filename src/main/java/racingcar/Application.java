package racingcar;

public class Application {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        RaceController raceController = new RaceController(inputView, outputView);
        raceController.start();
    }
}
