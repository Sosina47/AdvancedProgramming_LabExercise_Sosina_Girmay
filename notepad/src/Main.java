public class Main {
    public static void main(String[] args) {
        NoteService.saveNote("Hello this is my first note!");

        NoteService.loadNotes();
    }
}

