
package org.app.controller;

import org.app.models.Employee;
import org.app.services.EmployeeRepository;
import org.app.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class EmployeeController {
    private static final String [] NAMES= {"Tom", "Jerry", "Donald"};

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {"text/html"})
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/nuovo'>insert</a></li>";
        html += " <li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += " <li><a href='/showFullNameLikeTom'>Show All 'Tom'</a></li>";
        html += " <li><a href='/deleteAllEmployee'>Delete All Employee</a></li>";
        html += "</ul>";
        return html;
    }
    @ResponseBody
    @GetMapping(value = "/nuovo", produces = {"text/html"})
    public String addEmployee(){
        String html = "";
        html+="<form method='POST' action='/insert'>" +
                "<label>Codice</label>" +
                "<input type='text' name='code'>" +
                "<label>Nome</label>" +
                "<input type='text' name='fullname'>" +
                "<input type='date' name='birth_date'> "+
                "<input type='submit'/>" +
                "</form>";
        return html;



    }

     @ResponseBody
     @PostMapping("/insert")
     public String testInsert(@ModelAttribute EmployeeDTO employeeDTO) {
         employeeService.save(employeeDTO);

         return employeeDTO.toString();


     }

}
