//package Pedersen.sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

public class SudokuGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane sudoku = new GridPane();

        sudoku.setStyle("-fx-background-color: #000000;");

        for(int i = 0; i < 9; i++) {
            for(int i2 = 0; i2 < 9; i2++) {

                TextField textfield = new TextField();
                textfield.setPrefWidth(30.0);
                sudoku.setRowIndex(textfield, i);
                sudoku.setColumnIndex(textfield, i2);
                sudoku.getChildren().add(textfield);
            }
        }
        Scene scene = new Scene(sudoku);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
