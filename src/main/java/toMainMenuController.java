import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class toMainMenuController {
    @FXML
    public Button backTMscreen2;
    public Button backTMscreen;

    public void main() throws IOException {
        Button g = backTMscreen != null ? backTMscreen : backTMscreen2;
        Stage stage1 =(Stage) g.getScene().getWindow();
        Minesweeper.openWindow(stage1, "mainScene.fxml" );
    }
}