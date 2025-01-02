module praemien {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive org.eclipse.jface.databinding;
    requires transitive org.eclipse.swt;

    opens application to javafx.fxml;
    exports application;
}