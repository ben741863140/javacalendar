package sample;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
//        Parent root = FXMLLoader.load(getClass().getResource("/rl.fxml"));
        URL location = getClass().getResource("/rl.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(location);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
        Parent root = (javafx.scene.Parent) fxmlLoader.load(location.openStream());
        Controller control=(Controller)fxmlLoader.getController();
        ControlClass cc = new ControlClass();
        cc.setRes(control);
        primaryStage.setTitle("ÍòÄêÀú");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
