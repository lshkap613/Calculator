module MCON364_JavaFX_Week2 {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.xml;
	requires org.junit.jupiter.api;
	
	

	opens calculator to javafx.graphics, javafx.fxml;

}
