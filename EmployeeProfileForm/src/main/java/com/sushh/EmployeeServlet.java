package com.sushh;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String department = request.getParameter("department");
        String designation = request.getParameter("designation");
        String doj = request.getParameter("doj");
        double annualSalary = Double.parseDouble(request.getParameter("salary"));

        double monthlySalary = annualSalary / 12.0;

        LocalDate joinedDate = LocalDate.parse(doj);
        long yearsOfService = ChronoUnit.YEARS.between(joinedDate, LocalDate.now());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Employee Profile Card</h2>");

        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr><td>Employee Name</td><td>" + name + "</td></tr>");
        out.println("<tr><td>Employee ID</td><td>" + id + "</td></tr>");
        out.println("<tr><td>Department</td><td>" + department + "</td></tr>");
        out.println("<tr><td>Designation</td><td>" + designation + "</td></tr>");
        out.println("<tr><td>Date of Joining</td><td>" + doj + "</td></tr>");
        out.println("<tr><td>Annual Salary</td><td>" + annualSalary + "</td></tr>");
        out.println("<tr><td>Monthly Salary</td><td>" + String.format("%.2f", monthlySalary) + "</td></tr>");
        out.println("<tr><td>Years of Service</td><td>" + yearsOfService + "</td></tr>");
        out.println("</table>");

        out.println("<br><a href='index.html'>Back</a>");
        out.println("</body></html>");
    }
}