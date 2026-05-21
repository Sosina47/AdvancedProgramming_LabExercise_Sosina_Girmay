import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;

public class NotepadApp extends Application {

    TextArea textArea = new TextArea();
    ListView<Note> noteList = new ListView();

    @Override
    public void start(Stage stage) {

        // Buttons
        Button saveButton = new Button("Save");
        Button loadButton = new Button("Load");
        Button newButton = new Button("New"); 
        Button deleteButton = new Button("Delete"); 
 
        // Save action
        saveButton.setOnAction(e -> {
            String text = textArea.getText();
            NoteService.saveNote(text);
        });

        // Load action
        loadButton.setOnAction(e -> {
            ArrayList<Note> notes = NoteService.loadNotes();

            noteList.getItems().clear(); 
            noteList.getItems().addAll(notes); 
            
        });

        newButton.setOnAction(e -> {
            textArea.clear();
        });

        deleteButton.setOnAction(e -> {
            Note selectedNote = noteList.getSelectionModel().getSelectedItem(); 

            if (selectedNote != null) {
                NoteService.deleteNote(selectedNote.getId()); 
                noteList.getItems().remove(selectedNote); 

                textArea.clear(); 
            }
        });
        

        noteList.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, selectedNote) -> {
                if (selectedNote != null) {
                    textArea.setText(selectedNote.getContent());
                }
            }
        );        
        
        // Top bar
        HBox topBar = new HBox(10);
        topBar.getChildren().addAll(saveButton, loadButton, newButton, deleteButton);

        topBar.setSpacing(10);
        
        // Layout
        BorderPane root = new BorderPane();
        root.setTop(topBar);
        
        root.setLeft(noteList); 
        root.setRight(textArea);
        root.setStyle("-fx-padding: 10;"); 
        
        // Scene
        Scene scene = new Scene(root, 600, 400);
        scene.getStylesheets().add("style.css"); 

        stage.setTitle("JavaFX Notepad");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
