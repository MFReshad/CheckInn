/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkinn;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class AdminController implements Initializable {

    @FXML
    private Label AdminTitle;

    @FXML
    private Label activeUser;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            Parent pane = FXMLLoader.load(getClass().getResource("DashboardAdmin.fxml"));
            adminMain.setCenter(pane);
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
    @FXML
    private BorderPane adminMain;
  

    @FXML
    void checkIn(ActionEvent event) throws IOException {

        //System.out.println("Hi");
        /*
        AdminScreenLoader object = new AdminScreenLoader();
        Pane view = object.getPage("Dashboard.fxml");
        adminMain.setCenter(view); */
        Parent pane = FXMLLoader.load(getClass().getResource("CheckInAdmin.fxml"));
        adminMain.setCenter(pane);
        AdminTitle.setText(" Check In");
        
    }
    
    @FXML
    void dashboard(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("DashboardAdmin.fxml"));
        adminMain.setCenter(pane);
        AdminTitle.setText("Dashboard");
        
    }
    @FXML
    void employee(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("EmployeeList.fxml"));
        adminMain.setCenter(pane);
        AdminTitle.setText("Employees");
    }

    @FXML
    void foodItem(ActionEvent event) throws IOException {

        AdminTitle.setText("Food Items");
        Parent pane = FXMLLoader.load(getClass().getResource("FoodItems.fxml"));
        adminMain.setCenter(pane);
    }

    @FXML
    void rooms(ActionEvent event) throws IOException {

        AdminTitle.setText("    Rooms");
        Parent pane = FXMLLoader.load(getClass().getResource("Rooms.fxml"));
        adminMain.setCenter(pane);
    }

    @FXML
    void stocks(ActionEvent event) throws IOException {

        AdminTitle.setText("    Stocks");
        Parent pane = FXMLLoader.load(getClass().getResource("Stocks.fxml"));
        adminMain.setCenter(pane);
    }
    
    @FXML
    void logOut(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("LogInFXML.fxml"));
        Scene scene = new Scene(pane);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
}
