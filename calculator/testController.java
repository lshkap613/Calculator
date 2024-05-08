import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class testController {
    
    private CalculatorController calculatorController;
    private String display;
    
    @BeforeEach
    public void setUp() {
        calculatorController = new CalculatorController();
        display = "";
        calculatorController.setDisplay(display);
    }
    
    @Test
    public void testHandleNumberButtonClick() {
        // Given
        ActionEvent event = mock(ActionEvent.class);
        Button button = new Button("5");
        when(event.getSource()).thenReturn(button);
        
        // When
        calculatorController.handleNumberButtonClick(event);
        
        // Then
        assertEquals("5", calculatorController.getDisplay());
    }
}
