import java.sql.*;
import java.util.ArrayList; 

public class NoteService {

    public static void saveNote(String content) {
        try {
            Connection conn = DBConnection.connect();

            String sql = "INSERT INTO notes (content) VALUES (?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, content);
            stmt.executeUpdate();

            System.out.println("Note saved!");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Note> loadNotes() {
        ArrayList<Note> notes = new ArrayList<>();

        try {
            Connection conn = DBConnection.connect();

            if (conn == null) return notes;

            String sql = "SELECT * FROM notes";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String content = rs.getString("content");

                Note note = new Note(id, content); 
                
                notes.add(note); 
            }
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return notes;
    }

    public static void deleteNote(int id) {
        try {
            Connection conn = DBConnection.connect(); 

            if (conn == null) return ; 

            String sql = "DELETE FROM notes WHERE id = ?"; 
            PreparedStatement stmt = conn.prepareStatement(sql); 

            stmt.setInt(1, id); 
            stmt.executeUpdate();

            conn.close();
            System.out.println("Note deleted!"); 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}