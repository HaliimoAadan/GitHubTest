module dk.haliimo.githubtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.haliimo.githubtest to javafx.fxml;
    exports dk.haliimo.githubtest;
}