module com.example.p32 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.p32 to javafx.fxml;
    exports com.example.p32;
}