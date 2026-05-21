# Notepad App – Features and Concepts

This project is a desktop notepad application developed using JavaFX and MySQL.  
The main purpose of the project was to practice Java GUI development, database connectivity, and application structure.

---

# Features

- Create new notes
- Save notes to MySQL database
- Load notes from database
- Delete notes
- Dark mode interface
- Sidebar note navigation using `ListView`
- Persistent storage using JDBC and MySQL

---

# Java Concepts Implemented

## JavaFX GUI Development

The graphical interface was built using JavaFX components such as:

- `Stage`
- `Scene`
- `Button`
- `TextArea`
- `ListView`
- `HBox`
- `BorderPane`

The project demonstrates how desktop interfaces are created and organized in JavaFX.

---

## Event-Driven Programming

The application reacts to user interaction through event handling.

Examples:
- Button click events
- Note selection events

Methods used:
```java
setOnAction()
addListener()
```

---

## Object-Oriented Programming

The project follows object-oriented design by separating responsibilities into different classes.

### `Note.java`
Represents a single note object.

Contains:
- note ID
- note content

Concepts used:
- constructors
- encapsulation
- getter methods
- method overriding (`toString()`)

---

## JDBC Database Connectivity

The application connects Java to MySQL using JDBC.

Classes used:
- `Connection`
- `PreparedStatement`
- `ResultSet`
- `DriverManager`

Implemented SQL operations:
- `INSERT`
- `SELECT`
- `DELETE`

---

## Prepared Statements

Database queries were implemented using `PreparedStatement`.

Example:
```java
String sql = "DELETE FROM notes WHERE id = ?";
```

This improves:
- query safety
- readability
- parameter handling

---

## Collections Framework

Used:
```java
ArrayList<Note>
```

to store and manage note objects loaded from the database.

---

## JavaFX CSS Styling

The UI styling was implemented using an external CSS file:

```text
style.css
```

This includes:
- dark mode colors
- button styling
- hover effects
- ListView styling

---

## Separation of Concerns

The project is divided into multiple files with different responsibilities.

| File | Responsibility |
|---|---|
| `NotepadApp.java` | User Interface |
| `NoteService.java` | Database Operations |
| `DBConnection.java` | Database Connection |
| `Note.java` | Note Model |

This structure improves:
- code organization
- maintainability
- readability

---

# Problems Solved During Development

- JavaFX module setup
- JDBC driver configuration
- MySQL connection setup
- SQL syntax debugging
- Classpath configuration
- JavaFX runtime configuration
- UI synchronization with database

---

# Skills Practiced

- Java desktop application development
- GUI programming
- Database integration
- SQL query handling
- JavaFX styling
- Debugging and troubleshooting
- Multi-file project organization

---

# Possible Future Improvements

- Edit/update notes
- Search functionality
- Auto-save
- File export/import
- Rich text formatting
- Markdown support
