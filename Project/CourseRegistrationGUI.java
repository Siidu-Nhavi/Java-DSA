import javax.swing.*;
import java.awt.event.*;
import java.util.*;

// Abstract User class
abstract class User {
    protected String id;
    protected String name;
    protected String password;

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public abstract void viewDashboard();

    public String getName() {
        return name;
    }

    protected boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }
}

class Student extends User {
    private List<Course> registeredCourses = new ArrayList<>();

    public Student(String id, String name, String password) {
        super(id, name, password);
    }

    public void registerCourse(Course c) {
        if (!registeredCourses.contains(c)) {
            registeredCourses.add(c);
        }
    }

    public List<Course> getCourses() {
        return registeredCourses;
    }

   //overide
    public void viewDashboard() {
        new StudentDashboard(this);
    }
}

class Admin extends User {
    public Admin(String id, String name, String password) {
        super(id, name, password);
    }

   //overide
    public void viewDashboard() {
        new AdminDashboard(this);
    }
}

class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

   //override
    public String toString() {
        return code + ": " + title;
    }

// Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return Objects.equals(code, course.code);
    }

   //verride
    public int hashCode() {
        return Objects.hash(code);
    }
}

class CourseService {
    private static List<Course> availableCourses = new ArrayList<>();

    static {
        availableCourses.add(new Course("CS101", "Intro to CS"));
        availableCourses.add(new Course("CS102", "Data Structures"));
        availableCourses.add(new Course("CS103", "Algorithms"));
        availableCourses.add(new Course("CS104", "Databases"));
    }

    public static List<Course> getAvailableCourses() {
        return availableCourses;
    }

    public static void addCourse(Course c) {
        availableCourses.add(c);
    }
}

class LoginService {
    private static Map<String, User> users = new HashMap<>();

    static {
        users.put("student1", new Student("1", "Alice", "pass123"));
        users.put("student2", new Student("2", "Bob", "pass456"));
        users.put("admin", new Admin("0", "Admin", "adminpass"));
    }

    public static User authenticate(String username, String password) {
        User u = users.get(username);
        if (u != null && u.checkPassword(password)) {
            return u;
        }
        return null;
    }
}

public class CourseRegistrationGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginScreen());
    }
}

class LoginScreen extends JFrame {
    public LoginScreen() {
        setTitle("Login");
        setSize(350, 200);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginBtn = new JButton("Login");

        userLabel.setBounds(30, 30, 80, 25);
        userField.setBounds(120, 30, 150, 25);
        passLabel.setBounds(30, 70, 80, 25);
        passField.setBounds(120, 70, 150, 25);
        loginBtn.setBounds(120, 110, 100, 30);

        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            User user = LoginService.authenticate(username, password);
            if (user != null) {
                JOptionPane.showMessageDialog(this, "Login successful! Welcome " + user.getName());
                dispose();
                user.viewDashboard();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class StudentDashboard extends JFrame {
    public StudentDashboard(Student student) {
        setTitle("Student Dashboard - " + student.getName());
        setSize(500, 400);
        setLayout(null);

        JLabel label = new JLabel("Registered Courses:");
        label.setBounds(30, 20, 200, 25);
        add(label);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> courseList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(courseList);
        scrollPane.setBounds(30, 50, 400, 150);
        add(scrollPane);

        JTextField searchField = new JTextField();
        searchField.setBounds(30, 210, 200, 25);
        add(searchField);

        JButton searchBtn = new JButton("Search");
        searchBtn.setBounds(240, 210, 80, 25);
        add(searchBtn);

        JButton registerBtn = new JButton("Register New Course");
        registerBtn.setBounds(30, 250, 200, 30);
        add(registerBtn);

        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(300, 250, 100, 30);
        add(logoutBtn);

        registerBtn.addActionListener(e -> {
            List<Course> available = CourseService.getAvailableCourses();
            Course[] courseArray = available.toArray(new Course[0]);
            Course selectedCourse = (Course) JOptionPane.showInputDialog(
                this,
                "Select a course to register:",
                "Course Registration",
                JOptionPane.PLAIN_MESSAGE,
                null,
                courseArray,
                courseArray[0]
            );

            if (selectedCourse != null) {
                if (!student.getCourses().contains(selectedCourse)) {
                    student.registerCourse(selectedCourse);
                    listModel.addElement(selectedCourse.toString());
                    JOptionPane.showMessageDialog(this, "Course registered successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "You are already registered in this course.");
                }
            }
        });

        logoutBtn.addActionListener(e -> {
            dispose();
            new LoginScreen();
        });

        searchBtn.addActionListener(e -> {
            String query = searchField.getText().toLowerCase();
            listModel.clear();
            for (Course c : student.getCourses()) {
                if (c.getTitle().toLowerCase().contains(query) || c.getCode().toLowerCase().contains(query)) {
                    listModel.addElement(c.toString());
                }
            }
        });

        for (Course c : student.getCourses()) {
            listModel.addElement(c.toString());
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class AdminDashboard extends JFrame {
    public AdminDashboard(Admin admin) {
        setTitle("Admin Dashboard - " + admin.getName());
        setSize(400, 300);
        setLayout(null);

        JLabel label = new JLabel("Add New Course");
        label.setBounds(30, 20, 200, 25);
        add(label);

        JTextField codeField = new JTextField();
        codeField.setBounds(30, 50, 150, 25);
        add(codeField);

        JTextField titleField = new JTextField();
        titleField.setBounds(200, 50, 150, 25);
        add(titleField);

        JButton addBtn = new JButton("Add Course");
        addBtn.setBounds(30, 90, 150, 30);
        add(addBtn);

        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(200, 90, 150, 30);
        add(logoutBtn);

        addBtn.addActionListener(e -> {
            String code = codeField.getText();
            String title = titleField.getText();
            if (!code.isEmpty() && !title.isEmpty()) {
                CourseService.addCourse(new Course(code, title));
                JOptionPane.showMessageDialog(this, "Course added successfully!");
                codeField.setText("");
                titleField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Please fill both fields.");
            }
        });

        logoutBtn.addActionListener(e -> {
            dispose();
            new LoginScreen();
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
