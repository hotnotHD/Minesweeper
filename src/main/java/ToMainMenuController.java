import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ToMainMenuController {
    @FXML
    public Button backTMmenu2;
    public Button backTMmenu;

    public void main() throws IOException {
        Generator.flag.stage.close();
        Button g = backTMmenu != null ? backTMmenu : backTMmenu2;
        Stage stage1 =(Stage) g.getScene().getWindow();
        Minesweeper.openWindow(stage1, "mainMenu.fxml");
    }
}