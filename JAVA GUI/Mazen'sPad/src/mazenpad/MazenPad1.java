package mazenpad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MazenPad1 extends BorderPane {

    protected final MenuBar menuBar;
    protected final Menu fileMenu;
    protected final MenuItem newItem;
    protected final MenuItem openItem;
    protected final MenuItem saveItem;
    protected final MenuItem closeItem;
    protected final Menu editMenu;
    protected final MenuItem cutItem;
    protected final MenuItem copyItem;
    protected final MenuItem pasteItem;
    protected final MenuItem selectAllItem;
    protected final MenuItem deleteItem;
    protected final Menu helpMenu;
    protected final MenuItem aboutItem;
    protected final TextArea textArea;
    protected String onSelect;
    public MazenPad1() {
        
        
        menuBar = new MenuBar();
        fileMenu = new Menu();
        newItem = new MenuItem();
        openItem = new MenuItem();
        saveItem = new MenuItem();
        closeItem = new MenuItem();
        editMenu = new Menu();
        cutItem = new MenuItem();
        copyItem = new MenuItem();
        pasteItem = new MenuItem();
        selectAllItem = new MenuItem();
        deleteItem = new MenuItem();
        helpMenu = new Menu();
        aboutItem = new MenuItem();
        textArea = new TextArea();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(menuBar, javafx.geometry.Pos.CENTER);
        
        BorderPane.setAlignment(textArea, javafx.geometry.Pos.CENTER);
        textArea.setPrefHeight(200.0);
        textArea.setPrefWidth(600.0);
        setCenter(textArea);
        
        fileMenu.setMnemonicParsing(false);
        fileMenu.setText("File");

        newItem.setMnemonicParsing(false);
        newItem.setText("New");
        newItem.setOnAction((ActionEvent ae) -> {
            textArea.clear();   
        });
        
        

        openItem.setMnemonicParsing(false);
        openItem.setText("Open");              
        openItem.setOnAction((ActionEvent event) -> {
            FileChooser fc = new FileChooser();
            fc.setTitle("Open Text File");
            fc.setInitialDirectory(new File("."));
            fc.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
            File selectedFile = fc.showOpenDialog(null);
            BufferedReader buffr;
            String Line;
            if (selectedFile == null) {
                String fileName = "new.txt";
                try {
                    buffr = new BufferedReader(new FileReader("data/" + fileName));
                } catch (IOException e) {
                    Logger.getLogger(MazenPad1.class.getName()).log(Level.SEVERE, null, e);
                }
            } else {
                try {
                    buffr = new BufferedReader(new FileReader(selectedFile));
                    textArea.selectAll();
                    textArea.replaceSelection("");
                    
                    while ((Line = buffr.readLine()) != null) {
                        
                        textArea.appendText(Line + "\n");
                    }
                } catch (IOException e) {
                    Logger.getLogger(MazenPad1.class.getName()).log(Level.SEVERE, null, e);
                }}
        });
        
        saveItem.setMnemonicParsing(false);
        saveItem.setText("Save");        
        saveItem.setOnAction((ActionEvent event) -> {
            FileChooser fc = new FileChooser();
            FileChooser.ExtensionFilter ext = new FileChooser.ExtensionFilter("txt files", ".txt");
            File savefile = fc.showSaveDialog(null);
            FileWriter fw;
            try {
                fw = new FileWriter(savefile);
                fw.write(textArea.getText());
                fw.close();
                
            } catch (IOException ex) {
                Logger.getLogger(MazenPad1.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        closeItem.setMnemonicParsing(false);
        closeItem.setText("Close");
        closeItem.setOnAction((ActionEvent ae) -> {
            Platform.exit();   
        });
        editMenu.setMnemonicParsing(false);
        editMenu.setText("Edit");

        cutItem.setMnemonicParsing(false);
        cutItem.setText("Cut");
        cutItem.setOnAction((ActionEvent ae) -> {
        onSelect=textArea.getSelectedText();
        textArea.setText(textArea.getText().replace(onSelect, ""));   
        });
        
        copyItem.setMnemonicParsing(false);
        copyItem.setText("Copy");
        copyItem.setOnAction((ActionEvent ae) -> {
        onSelect=textArea.getSelectedText();    
        });
        
        pasteItem.setMnemonicParsing(false);
        pasteItem.setText("Paste");
        pasteItem.setOnAction((ActionEvent ae) -> {
        textArea.replaceText(textArea.getSelection().getStart(), textArea.getSelection().getEnd(), onSelect);       
        });

        
        selectAllItem.setMnemonicParsing(false);
        selectAllItem.setText("Select All");
        selectAllItem.setOnAction((ActionEvent ae) -> {
        textArea.selectAll();  
        });

        deleteItem.setMnemonicParsing(false);
        deleteItem.setText("Delete");
        deleteItem.setOnAction((ActionEvent ae) -> {
        onSelect=textArea.getSelectedText();
        textArea.setText(textArea.getText().replace(onSelect, ""));
        });
        
        helpMenu.setMnemonicParsing(false);
        helpMenu.setText("Help");
        aboutItem.setMnemonicParsing(false);
        aboutItem.setText("About MazenPad");
        setTop(menuBar);              
        aboutItem.setOnAction((ActionEvent ae) -> {      
        Alert alert = new Alert(AlertType.INFORMATION, "Welcome to Mazen's Pad :)");
        alert.show();
        });
        

        
        

        fileMenu.getItems().add(newItem);
        fileMenu.getItems().add(openItem);
        fileMenu.getItems().add(saveItem);
        fileMenu.getItems().add(closeItem);
        menuBar.getMenus().add(fileMenu);
        editMenu.getItems().add(cutItem);
        editMenu.getItems().add(copyItem);
        editMenu.getItems().add(pasteItem);
        editMenu.getItems().add(selectAllItem);
        editMenu.getItems().add(deleteItem);
        menuBar.getMenus().add(editMenu);
        helpMenu.getItems().add(aboutItem);
        menuBar.getMenus().add(helpMenu);

    }  
                
}