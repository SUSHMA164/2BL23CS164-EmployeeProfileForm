# 2BL23CS164-EmployeeProfileForm
This project is a Java Servlet web application that collects employee details through an HTML form and displays a formatted Employee Profile Card. The form includes fields like Employee Name, ID, Department, Designation, Date of Joining, and Annual Salary. 

# Employee Profile Form (Servlet)

## Description
This project is a Java Servlet web application that collects employee details through an HTML form and displays a formatted Employee Profile Card. The form includes fields like Employee Name, ID, Department, Designation, Date of Joining, and Annual Salary. The servlet processes the input, calculates monthly salary and years of service, and displays all details.

## Technologies Used
- Java
- Servlet (Jakarta Servlet API)
- HTML
- Apache Tomcat v10.1
- Eclipse IDE

## Folder Structure
EmployeeProfileForm/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/tara/EmployeeServlet.java
│       │
│       └── webapp/
│           ├── index.html
│           └── WEB-INF/
│               └── web.xml
│
├── screenshots/
│   ├── screenshot1.png
│   ├── screenshot2.png
│
└── README.md

## Requirements
- JDK 17 or above
- Eclipse IDE
- Apache Tomcat v10.1
- Web Browser (Chrome/Edge)

## How to Run
1. Open Eclipse IDE
2. Create or import Dynamic Web Project (EmployeeProfileForm)
3. Configure Apache Tomcat v10.1
4. Right click project → Run As → Run on Server
5. Open browser
6. Enter URL:
   http://localhost:8081/EmployeeProfileForm/index.html

## How It Works
- User enters employee details in the form
- Data is sent to servlet using POST method
- Servlet reads all input values
- Monthly Salary = Annual Salary / 12
- Years of Service is calculated from Date of Joining
- A formatted Employee Profile Card is displayed

## Output
The application displays:
- Employee Name
- Employee ID
- Department
- Designation
- Date of Joining
- Annual Salary
- Monthly Salary (calculated)
- Years of Service (calculated)

## Screenshots
Add screenshots of:
1. Input form page
2. Output profile card page

## Author
Sushma Angadi  
BE Computer Science
