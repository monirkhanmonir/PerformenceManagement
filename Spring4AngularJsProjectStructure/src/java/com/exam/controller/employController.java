package com.exam.controller;

import com.exam.model.Appraisal;
import com.exam.model.Employee;
import com.exam.model.Retirement;
import com.exam.model.Transfer;
import com.exam.service.AppraisalInterface;

import com.exam.service.EmpService;
import com.exam.service.RetirementInterF;
import com.exam.service.TranesferSerInterF;
import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println("Accept");
        tranesferSerInterF.saveTransfer(transfer);
        System.out.println(transfer.getName());
        System.out.println(transfer.getDate());
        return null;
    }

    @RequestMapping(value = "/retirement")
    public String addRetirement(@RequestBody Retirement retirement) {
        System.out.println("Ok");
        System.out.println(retirement.geteName());
        
        retirementInterF.saveRetirement(retirement);
        System.out.println("Reansection");
        System.out.println(retirement.getEmployedDate());
        return null;
    }

    @RequestMapping(value = "/appraisaldata")
    public String addAppraisa(@RequestBody Appraisal appraisal) {
        appraisalser.saveAppraisal(appraisal);     
        return null;
    }
}
