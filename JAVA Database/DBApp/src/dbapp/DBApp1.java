package dbapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

public /*abstract*/ class DBApp1 extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final Text text5;
    protected final TextField txtSSN;
    protected final TextField txtFirst;
    protected final TextField txtLast;
    protected final TextField txtAddr;
    protected final TextField txtSalary;
    protected final TextField txtDno;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints3;
    protected final ColumnConstraints columnConstraints4;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final ColumnConstraints columnConstraints7;
    protected final ColumnConstraints columnConstraints8;
    protected final ColumnConstraints columnConstraints9;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final Button newB;
    protected final Button updateB;
    protected final Button deleteB;
    protected final Button firstB;
    protected final Button prevB;
    protected final Button nextB;
    protected final Button lastB;
    
    Connection con;
    Statement stm;
    ResultSet rs;
    boolean isInsert;

    public DBApp1() {
        
        try
        {
        con = MyDataSourceFactory.getMySQLDataSource().getConnection();
        stm= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs = stm.executeQuery("SELECT SSN , Fname , Lname ,Address , Salary , Dno FROM employee1");
        //con.close();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        
        

        
        
        
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        text5 = new Text();
        txtSSN = new TextField();
        txtFirst = new TextField();
        txtLast = new TextField();
        txtAddr = new TextField();
        txtSalary = new TextField();
        txtDno = new TextField();
        gridPane = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        columnConstraints4 = new ColumnConstraints();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        columnConstraints7 = new ColumnConstraints();
        columnConstraints8 = new ColumnConstraints();
        columnConstraints9 = new ColumnConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        newB = new Button();
        updateB = new Button();
        deleteB = new Button();
        firstB = new Button();
        prevB = new Button();
        nextB = new Button();
        lastB = new Button();

        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(133.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(127.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(371.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(371.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(144.0);
        columnConstraints1.setMinWidth(0.0);
        columnConstraints1.setPrefWidth(0.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("        Person Details");
        text.setWrappingWidth(137.134765625);
        text.setFont(new Font(14.0));

        GridPane.setRowIndex(text0, 1);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("        SSN");
        text0.setFont(new Font(14.0));

        GridPane.setRowIndex(text1, 2);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("        First Name");
        text1.setFont(new Font(14.0));

        GridPane.setRowIndex(text2, 3);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("        Last Name");
        text2.setFont(new Font(14.0));

        GridPane.setRowIndex(text3, 4);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("        Address");
        text3.setFont(new Font(14.0));

        GridPane.setRowIndex(text4, 5);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("        Salary");
        text4.setFont(new Font(14.0));

        GridPane.setRowIndex(text5, 6);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("        Dno");
        text5.setFont(new Font(14.0));

        GridPane.setColumnIndex(txtSSN, 1);
        GridPane.setRowIndex(txtSSN, 1);
        txtSSN.getText();

        GridPane.setColumnIndex(txtFirst, 1);
        GridPane.setRowIndex(txtFirst, 2);
        txtFirst.getText();

        GridPane.setColumnIndex(txtLast, 1);
        GridPane.setRowIndex(txtLast, 3);
        txtLast.getText();

        GridPane.setColumnIndex(txtAddr, 1);
        GridPane.setRowIndex(txtAddr, 4);
        txtAddr.getText();

        GridPane.setColumnIndex(txtSalary, 1);
        GridPane.setRowIndex(txtSalary, 5);
        txtSalary.getText();

        GridPane.setColumnIndex(txtDno, 1);
        GridPane.setRowIndex(txtDno, 6);
        txtDno.getText();

        GridPane.setColumnIndex(gridPane, 1);
        GridPane.setRowIndex(gridPane, 7);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(96.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(46.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMaxWidth(73.0);
        columnConstraints4.setMinWidth(0.0);
        columnConstraints4.setPrefWidth(64.0);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMaxWidth(73.0);
        columnConstraints5.setMinWidth(0.0);
        columnConstraints5.setPrefWidth(52.0);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMaxWidth(78.0);
        columnConstraints6.setMinWidth(0.0);
        columnConstraints6.setPrefWidth(40.0);

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(83.0);
        columnConstraints7.setMinWidth(0.0);
        columnConstraints7.setPrefWidth(68.0);

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMaxWidth(90.0);
        columnConstraints8.setMinWidth(8.0);
        columnConstraints8.setPrefWidth(43.0);

        columnConstraints9.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints9.setMaxWidth(95.0);
        columnConstraints9.setMinWidth(10.0);
        columnConstraints9.setPrefWidth(60.0);

        rowConstraints7.setMaxHeight(38.0);
        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(38.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMaxHeight(22.0);
        rowConstraints8.setMinHeight(0.0);
        rowConstraints8.setPrefHeight(0.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMaxHeight(19.0);
        rowConstraints9.setMinHeight(2.0);
        rowConstraints9.setPrefHeight(14.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        newB.setAlignment(javafx.geometry.Pos.CENTER);
        newB.setMnemonicParsing(false);
        newB.setPrefHeight(24.0);
        newB.setPrefWidth(41.0);
        newB.setText("New");
        newB.setFont(new Font(11.0));
        newB.setOnAction((ActionEvent event) -> {
            try {
                PreparedStatement pstm= con.prepareStatement("INSERT INTO employee1 VALUES ( ?, ?, ?, ?,?,?)" );
                pstm.setInt(1, Integer.parseInt(txtSSN.getText()));
                pstm.setString(2, txtFirst.getText());
                pstm.setString(3, txtLast.getText());
                pstm.setString(4, txtAddr.getText());
                pstm.setInt(5, Integer.parseInt(txtSalary.getText()));
                pstm.setInt(6, Integer.parseInt(txtDno.getText()));
                pstm.executeUpdate();
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Add new Successful!");
                alert.show();
                rs = stm.executeQuery("SELECT SSN , Fname , Lname ,Address , Salary , Dno FROM employee1");
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(DBApp1.class.getName()).log(Level.SEVERE, null, ex);
            }
            });

        GridPane.setColumnIndex(updateB, 1);
        updateB.setMnemonicParsing(false);
        updateB.setPrefHeight(24.0);
        updateB.setPrefWidth(58.0);
        updateB.setText("Update");
        updateB.setFont(new Font(11.0));
        updateB.setOnAction((ActionEvent event) -> {
            try {
                PreparedStatement pstm= con.prepareStatement("UPDATE employee1 SET Fname=?,Lname=?,Address=?,Salary=?,Dno=? WHERE SSN=?");
                pstm.setInt(6, Integer.parseInt(txtSSN.getText()));
                pstm.setString(1, txtFirst.getText());
                pstm.setString(2, txtLast.getText());
                pstm.setString(3, txtAddr.getText());
                pstm.setInt(4, Integer.parseInt(txtSalary.getText()));
                pstm.setInt(5, Integer.parseInt(txtDno.getText()));
                pstm.executeUpdate();
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Update Successful!");
                alert.show();
                rs = stm.executeQuery("SELECT SSN , Fname , Lname ,Address , Salary , Dno FROM employee1");
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(DBApp1.class.getName()).log(Level.SEVERE, null, ex);
            }
            });

        GridPane.setColumnIndex(deleteB, 2);
        deleteB.setMnemonicParsing(false);
        deleteB.setText("Delete");
        deleteB.setFont(new Font(11.0));
        deleteB.setOnAction((ActionEvent event) -> {
            try {
                PreparedStatement pstm= con.prepareStatement("DELETE FROM employee1 WHERE SSN=?");
                pstm.setInt(1, Integer.parseInt(txtSSN.getText()));
                pstm.executeUpdate();
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Delete Successful!");
                alert.show();
                rs = stm.executeQuery("SELECT SSN , Fname , Lname ,Address , Salary , Dno FROM employee1");
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(DBApp1.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        

        GridPane.setColumnIndex(firstB, 3);
        firstB.setMnemonicParsing(false);
        firstB.setText("First");
        firstB.setFont(new Font(11.0));
        firstB.setOnAction((ActionEvent ae) -> {         
        try {
            rs.first();
            int ssn =rs.getInt(1);
            int salary=rs.getInt(5);
            int dno=rs.getInt(6);
            txtSSN.setText(String.valueOf(ssn));
            txtFirst.setText(rs.getString(2));
            txtLast.setText(rs.getString(3));
            txtAddr.setText(rs.getString(4));
            txtSalary.setText(String.valueOf(salary));
            txtDno.setText(String.valueOf(dno));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        });

        GridPane.setColumnIndex(prevB, 4);
        prevB.setMnemonicParsing(false);
        prevB.setPrefHeight(24.0);
        prevB.setPrefWidth(60.0);
        prevB.setText("Previous");
        prevB.setFont(new Font(11.0));
        prevB.setOnAction((ActionEvent ae) -> {         
        try {
            if(rs.previous())
            {
            int ssn =rs.getInt(1);
            int salary=rs.getInt(5);
            int dno=rs.getInt(6);
            txtSSN.setText(String.valueOf(ssn));
            txtFirst.setText(rs.getString(2));
            txtLast.setText(rs.getString(3));
            txtAddr.setText(rs.getString(4));
            txtSalary.setText(String.valueOf(salary));
            txtDno.setText(String.valueOf(dno));
            }
            else
            { Alert alert = new Alert(Alert.AlertType.INFORMATION, "No Previous!");
                alert.show(); }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        });
        

        GridPane.setColumnIndex(nextB, 5);
        nextB.setMnemonicParsing(false);
        nextB.setText("Next");
        nextB.setFont(new Font(11.0));
        nextB.setOnAction((ActionEvent ae) -> {         
        try {
            if(rs.next())
            {
            int ssn =rs.getInt(1);
            int salary=rs.getInt(5);
            int dno=rs.getInt(6);
            txtSSN.setText(String.valueOf(ssn));
            txtFirst.setText(rs.getString(2));
            txtLast.setText(rs.getString(3));
            txtAddr.setText(rs.getString(4));
            txtSalary.setText(String.valueOf(salary));
            txtDno.setText(String.valueOf(dno));
            }
            else
            { Alert alert = new Alert(Alert.AlertType.INFORMATION, "No Next!");
                alert.show(); }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        });

        GridPane.setColumnIndex(lastB, 6);
        lastB.setMnemonicParsing(false);
        lastB.setText("Last");
        lastB.setFont(new Font(11.0));
        lastB.setOnAction((ActionEvent ae) -> {         
        try {
            rs.last();
            int ssn =rs.getInt(1);
            int salary=rs.getInt(5);
            int dno=rs.getInt(6);
            txtSSN.setText(String.valueOf(ssn));
            txtFirst.setText(rs.getString(2));
            txtLast.setText(rs.getString(3));
            txtAddr.setText(rs.getString(4));
            txtSalary.setText(String.valueOf(salary));
            txtDno.setText(String.valueOf(dno));
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        });

        getColumnConstraints().add(columnConstraints);
        getColumnConstraints().add(columnConstraints0);
        getColumnConstraints().add(columnConstraints1);
        getColumnConstraints().add(columnConstraints2);
        getRowConstraints().add(rowConstraints);
        getRowConstraints().add(rowConstraints0);
        getRowConstraints().add(rowConstraints1);
        getRowConstraints().add(rowConstraints2);
        getRowConstraints().add(rowConstraints3);
        getRowConstraints().add(rowConstraints4);
        getRowConstraints().add(rowConstraints5);
        getRowConstraints().add(rowConstraints6);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(text3);
        getChildren().add(text4);
        getChildren().add(text5);
        getChildren().add(txtSSN);
        getChildren().add(txtFirst);
        getChildren().add(txtLast);
        getChildren().add(txtAddr);
        getChildren().add(txtSalary);
        getChildren().add(txtDno);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getColumnConstraints().add(columnConstraints4);
        gridPane.getColumnConstraints().add(columnConstraints5);
        gridPane.getColumnConstraints().add(columnConstraints6);
        gridPane.getColumnConstraints().add(columnConstraints7);
        gridPane.getColumnConstraints().add(columnConstraints8);
        gridPane.getColumnConstraints().add(columnConstraints9);
        gridPane.getRowConstraints().add(rowConstraints7);
        gridPane.getRowConstraints().add(rowConstraints8);
        gridPane.getRowConstraints().add(rowConstraints9);
        gridPane.getChildren().add(newB);
        gridPane.getChildren().add(updateB);
        gridPane.getChildren().add(deleteB);
        gridPane.getChildren().add(firstB);
        gridPane.getChildren().add(prevB);
        gridPane.getChildren().add(nextB);
        gridPane.getChildren().add(lastB);
        getChildren().add(gridPane);
        
        
    }
}