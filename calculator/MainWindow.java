package calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class MainWindow extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Calc.fxml"));
        loader.setController(new CalculatorController());
		Scene scene = new Scene(loader.load());
		scene.getStylesheets().add(getClass().getResource("calc.css").toExternalForm());
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Calculator");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
