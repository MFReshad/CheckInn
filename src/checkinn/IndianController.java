/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkinn;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class IndianController implements Initializable {

    @FXML
    private Label food1;
    @FXML
    private Label food2;
    @FXML
    private Label food3;
    @FXML
    private Label food4;
    @FXML
    private Label food5;
    @FXML
    private Label food6;
    @FXML
    private Label food7;
    @FXML
    private Label food8;
    @FXML
    private Label food9;
    @FXML
    private Label pr1;
    @FXML
    private Label pr2;
    @FXML
    private Label pr3;
    @FXML
    private Label pr4;
    @FXML
    private Label pr5;
    @FXML
    private Label pr6;
    @FXML
    private Label pr9;
    @FXML
    private Label pr8;
    @FXML
    private Label pr7;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            loadP();
        } catch (SQLException ex) {
            Logger.getLogger(IndianController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void backbtn(ActionEvent event) throws IOException {
        Parent root4 = FXMLLoader.load(getClass().getResource("FoodItems.fxml"));
        Scene scene4 = new Scene(root4);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene4);
        window.centerOnScreen();
        window.show();
    }

    @FXML
    private void Dumaloo(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food1.getText(), pr1.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    @FXML
    private void dumoaneer(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food2.getText(), pr2.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    @FXML
    private void prawn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food3.getText(), pr3.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    @FXML
    private void samosa(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food4.getText(), pr4.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    @FXML
    private void biriani(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food5.getText(), pr5.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    @FXML
    private void aloogobi(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food6.getText(), pr6.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    @FXML
    private void buttterchicken(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food7.getText(), pr7.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    @FXML
    private void spicy(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food8.getText(), pr8.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    @FXML
    private void onion(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddProductDetails.fxml"));
        Parent root4 = (Parent) fxmlLoader.load();
        AddProductDetailsController scene2 = fxmlLoader.getController();
        scene2.showInformation(food9.getText(), pr9.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(root4));
        stage.show();
    }

    Connection conn = Javaconnect.ConnectDB();
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void loadP() throws SQLException {
        String sql1 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='19'";
        String sql2 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='20'";
        String sql3 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='21'";
        String sql4 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='22'";
        String sql5 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='23'";
        String sql6 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='24'";
        String sql7 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='25'";
        String sql8 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='26'";
        String sql9 = "SELECT `foodprice` FROM `foodadmin` WHERE Id='27'";
        pst = conn.prepareStatement(sql1);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm1 = rs.getString("foodprice");
            pr1.setText(itm1 + " BDT");
        }
        pst = conn.prepareStatement(sql2);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm2 = rs.getString("foodprice");
            pr2.setText(itm2 + " BDT");
        }
        pst = conn.prepareStatement(sql3);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm3 = rs.getString("foodprice");
            pr3.setText(itm3 + " BDT");
        }
        pst = conn.prepareStatement(sql4);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm4 = rs.getString("foodprice");
            pr4.setText(itm4 + " BDT");
        }
        pst = conn.prepareStatement(sql5);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm5 = rs.getString("foodprice");
            pr5.setText(itm5 + " BDT");
        }
        pst = conn.prepareStatement(sql6);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm6 = rs.getString("foodprice");
            pr6.setText(itm6 + " BDT");
        }
        pst = conn.prepareStatement(sql7);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm7 = rs.getString("foodprice");
            pr7.setText(itm7 + " BDT");
        }
        pst = conn.prepareStatement(sql8);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm8 = rs.getString("foodprice");
            pr8.setText(itm8 + " BDT");
        }
        pst = conn.prepareStatement(sql9);
        rs = pst.executeQuery();
        if (rs.next()) {
            String itm9 = rs.getString("foodprice");
            pr9.setText(itm9 + " BDT");
        }
    }

}