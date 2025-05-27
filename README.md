
## 📁 Project Structure


├── module1-frontend/                 # HTML, CSS, JS, Bootstrap (30+ files)
│   ├── 10 HTML files
│   ├── 1 CSS file
│   ├── 14 JavaScript files
│   └── 19 Bootstrap-based HTML pages
│
├── module2-sql/                     # SQL Scripts (25 files)
│   ├── 25 SQL files (DDL, DML, JOIN, Aggregates, Views)
│
├── module3-core-java/               # Core Java Application (41 files)
│   ├── 41 Java files
│   └── JDBC + Menu-driven program
│
└── README.md


## 🔷 Module 1: Front-End Web Development

### 📌 Technologies Used
- **HTML5** (10 files)
- **CSS3** (1 main file)
- **JavaScript** (14 files)
- **Bootstrap 5** (19 HTML files using components)

### 🎯 Features
- Responsive layout using Bootstrap Grid
- Navigation bar with dropdowns and modals
- Image gallery with hover effects
- Event Registration Form (JS Validation)
- Feedback Form with localStorage
- Help Page using Accordion & Tooltips
- Video embedding and media events
- Dark Mode toggle and user preference saving

### 📂 Key Files
- `index.html`, `event-form.html`, `gallery.html`, `feedback.html`, `help.html`
- `style.css` – Custom styles
- `script.js`, `form-validation.js`, `dark-mode.js`

---

## 🔷 Module 2: ANSI SQL

### 📌 Database Used
- **MySQL / ANSI SQL-compatible RDBMS**

### 📂 File Summary
25 SQL Scripts including:
- Table creation (DDL)
- Insert queries (DML)
- SELECT queries with conditions, joins
- Aggregate functions: `COUNT()`, `AVG()`, `GROUP BY`
- Subqueries, nested queries
- Views, indexing, basic stored procedures

### 🧪 Sample Tables
- `users`, `events`, `registrations`, `feedback`

### 🛠 Example Query
```sql
SELECT u.name, e.event_name
FROM users u
JOIN registrations r ON u.user_id = r.user_id
JOIN events e ON r.event_id = e.event_id
WHERE e.event_date > CURRENT_DATE();


# 🔷 Module 3: Core Java (41 Java Files)

This module focuses on the backend logic using **Core Java** and integrates with a relational database using **JDBC**.

---

## 📌 Technologies Used

- Java SE (JDK 8+)
- JDBC (Java Database Connectivity)
- OOP Concepts: Inheritance, Encapsulation, Polymorphism
- Exception Handling
- Menu-driven console interaction

---

## 📂 Project Structure


---

## 🎯 Features

- Object-Oriented backend system
- CRUD operations for:
  - Users
  - Events
  - Registrations
  - Feedback
- JDBC-based interaction with SQL database
- Menu-driven user interface (text-based)
- Exception and input validation mechanisms

---

## 📋 Sample Code Snippet

```java
// Event.java
public class Event {
    private int id;
    private String name;
    private String location;

    public Event(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println("Event: " + name + " | Location: " + location);
    }

    // Getters and Setters
}
🚀 How to Run
🖥 Module 1: Front-End
  Open any HTML file using a browser (e.g., index.html)
  Use DevTools (F12) for inspection/debugging

🗄 Module 2: SQL
  Load SQL scripts in your database client (e.g., MySQL Workbench)
  Execute step-by-step to create, populate, and query the database

☕ Module 3: Core Java
  Open in IDE like VS Code, IntelliJ, or Eclipse
  Compile using: javac *.java
  Run: java Main and follow the menu
  Ensure correct JDBC URL, username, and password in DBConnection.jav

🎓 Learning Outcomes
      ✅ Designed a modular backend using Java and JDBC
      ✅ Implemented real-world OOP concepts
      ✅ Built DAO classes for CRUD operations
      ✅ Connected Java app to SQL database securely
      ✅ Handled exceptions and validated user inputs
      ✅ Learned CLI-based system interaction
      ✅ Understood full-stack integration from backend perspective
design

👨‍💻 Author
  M Sampath
  Department of Computer Science and Engineering
  Prince Shri Venkateshwara Padmavathy Engineering College

