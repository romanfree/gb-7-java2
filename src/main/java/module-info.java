module ru.gb.gb7java2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.gb7java2 to javafx.fxml;
    exports ru.gb.gb7java2;
}