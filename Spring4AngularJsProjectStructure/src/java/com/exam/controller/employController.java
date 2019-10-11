package com.exam.controller;

import com.exam.model.Appraisal;
import com.exam.model.Employee;
import com.exam.model.Retirement;
import com.exam.model.Transfer;
import com.exam.service.AppraisalInterface;

import com.exam.service.EmpService;
import com.exam.service.RetirementInterF;
import com.exam.service.TranesferSerInterF;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class employController {

    @Autowired
    EmpService empService;
    @Autowired
    AppraisalInterface appraisalser;
    @Autowired
    RetirementInterF retirementInterF;
    @Autowired
    TranesferSerInterF tranesferSerInterF;

    @RequestMapping(value = "/empcreate")
    public String addEmploy(@RequestBody Employee employee) {
        System.out.println(employee.getName());
        System.out.println(employee.getEmail());
        empService.saveUser(employee);
        return null;
    }

    @RequestMapping(value = "/transferData")
    public String addTransfer(@RequestBody Transfer transfer) {

        tranesferSerInterF.saveTransfer(transfer);

        return null;
    }

    @RequestMapping(value = "/retirement")
    public String addRetirement(@RequestBody Retirement retirement) {
        retirementInterF.saveRetirement(retirement);
        return null;
    }

    @RequestMapping(value = "/appraisaldata")
    public String addAppraisa(@RequestBody Appraisal appraisal) {
        appraisalser.saveAppraisal(appraisal);
        return null;
    }

    @RequestMapping(value = "/showAllEmployee")
    public List<Employee> getAllEmployee() {
        System.out.println("accept controlller");
        List<Employee> listemp = empService.getAllEmployee();
        System.out.println(listemp);

        return listemp;
    }

    @RequestMapping(value = "/empDetails/{id}")
    public Employee getDetails(@PathVariable int id) {
        // System.out.println(id);
        Employee emp = empService.getById(id);
        System.out.println(emp);
        return emp;
    }

    @RequestMapping(value = "/transferDetails/{id}")
    public Transfer getTarnsferDetails(@PathVariable int id) {

        Transfer ts = tranesferSerInterF.getById(id);
        System.out.println(ts);
        return ts;
    }

    @RequestMapping(value = "/appraisalDetails/{id}")
    public Appraisal getAppraisalDetails(@PathVariable int id) {
        System.out.println("Appraisal request accept");
        Appraisal aps = appraisalser.getById(id);
        System.out.println(aps);
        return aps;
    }

    @RequestMapping(value = "/retirementDetails/{id}")
    public Retirement getRetirementDetails(@PathVariable int id) {
        System.out.println("Retirement request accept"+id);
//        Retirement retc = retirementInterF.getById(id);
//        System.out.println(retc);
//        return retc;
        return null;
    }

}
