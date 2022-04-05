module ru.gb.chathw {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.chathw to javafx.fxml;
    exports ru.gb.chathw;
}