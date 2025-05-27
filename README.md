
## 📁 Project Structure

```
├── module1-frontend/                 # Frontend: HTML, CSS, JavaScript, Bootstrap (30+ files)
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
│   └── JDBC + Menu-driven console program
│
└── README.md
```

---

## 🔷 Module 1: Front-End Web Development

### 📌 Technologies Used

* **HTML5** (10 files)
* **CSS3** (1 main stylesheet)
* **JavaScript** (14 scripts)
* **Bootstrap 5** (19 HTML pages using Bootstrap components)

### 🎯 Features

* Responsive layouts using Bootstrap grid system
* Navigation bar with dropdown menus and modal dialogs
* Interactive image gallery with hover effects
* Event Registration form with JavaScript validation
* Feedback form storing data locally using `localStorage`
* Help page implemented with Accordion and Tooltips
* Embedded videos with media event handling
* Dark Mode toggle with persistent user preference saved in `localStorage`

### 📂 Key Files

* `index.html`, `event-form.html`, `gallery.html`, `feedback.html`, `help.html`
* `style.css` — Custom styling
* `script.js`, `form-validation.js`, `dark-mode.js` — Core JavaScript functionalities

---

## 🔷 Module 2: ANSI SQL Scripts

### 📌 Database

* Designed for **MySQL** or any ANSI SQL-compatible RDBMS

### 📂 Contents

* 25 SQL scripts including:

  * Table creation scripts (DDL)
  * Insert statements (DML)
  * Complex `SELECT` queries with JOINs and conditions
  * Aggregate functions (`COUNT()`, `AVG()`, `GROUP BY`)
  * Nested and correlated subqueries
  * Views and basic stored procedures

### 🧪 Sample Tables

* `users`, `events`, `registrations`, `feedback`

### 🛠 Sample Query

```sql
SELECT u.name, e.event_name
FROM users u
JOIN registrations r ON u.user_id = r.user_id
JOIN events e ON r.event_id = e.event_id
WHERE e.event_date > CURRENT_DATE();
```

---

## 🔷 Module 3: Core Java Backend Application

### 📌 Technologies Used

* Java SE (JDK 8+)
* JDBC (Java Database Connectivity)
* OOP Concepts: Inheritance, Encapsulation, Polymorphism
* Exception Handling
* Console-based menu-driven interface

### 🎯 Features

* Object-oriented backend for managing:

  * Users
  * Events
  * Registrations
  * Feedback
* CRUD operations implemented with DAO pattern
* Secure database interaction via JDBC
* Robust exception and input validation
* Interactive text menu system for user operations

### 📋 Sample Code Snippet

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

    // Getters and Setters...
}
```

---

## 🚀 How to Run

### 🖥 Module 1: Front-End

* Open any `.html` file in a modern web browser (Chrome, Firefox, Edge)
* Use browser Developer Tools (F12) for debugging and inspection

### 🗄 Module 2: SQL

* Import SQL scripts into your database client (e.g., MySQL Workbench)
* Execute scripts in order to create schema, insert data, and run queries

### ☕ Module 3: Core Java

* Open in IDE (VS Code, IntelliJ, Eclipse)
* Compile all Java files:

  ```bash
  javac *.java
  ```
* Run the main class:

  ```bash
  java Main
  ```
* Ensure correct database connection settings (URL, username, password) in `DBConnection.java`

---

## 🎓 Learning Outcomes

* Designed modular backend architecture with Java and JDBC
* Applied Object-Oriented Programming principles in real-world scenarios
* Built DAO classes for effective CRUD database operations
* Established secure connection and communication between Java app and SQL database
* Implemented exception handling and input validations to improve reliability
* Developed CLI-based interactive user interface
* Gained full-stack integration understanding from frontend to backend

---

## 👨‍💻 Author

**M Sampath**

Department of Computer Science and Engineering
Prince Shri Venkateshwara Padmavathy Engineering College

---

