package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class LabelController {
	@FXML
	Label NL;
	@FXML
	TextArea reminderdata;
	@FXML
	Button save;
	
	Controller T;
	
	@FXML
	public void save_reminder() throws IOException {
		String A=reminderdata.getText();
//		System.out.println(NL.getText());
		T.addremind(A,NL.getText());
		return;
	}
	
	public void initialize(){
		ChosenDay chosen = new ChosenDay();
		String toset = chosen.getDay();
//		System.out.println(toset);
		NL.setText(toset);
		String toset2 = chosen.getText();
		reminderdata.setText(toset2);
		ControlClass c = new ControlClass();
		T = c.getRes();
	}
}
