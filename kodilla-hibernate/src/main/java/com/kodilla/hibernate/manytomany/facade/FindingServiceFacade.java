package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FindingServiceFacade {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public FindingServiceFacade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<CompanyDto> findCompanyByNameFragment(String string){
        string = "%" + string + "%";
        List<Company> companies = companyDao.retrieveCompanyWithSpecificLetters(string);
        List<CompanyDto> companyDtos = companies.stream()
                .map(company -> new CompanyDto(company.getId(), company.getName(), company.getEmployees()))
                .collect(Collectors.toList());
        return companyDtos;
    }

    public List<EmployeeDto> findEmployeeByNameFragment(String string){
        string = "%" + string + "%";
        List<Employee> employees = employeeDao.retrieveEmployeeWithSpecificLettersInName(string);
        List<EmployeeDto> employeeDtos = employees.stream()
                .map(employee -> new EmployeeDto(employee.getId(), employee.getFirstname(), employee.getLastname(), employee.getCompanies()))
                .collect(Collectors.toList());
        return employeeDtos;
    }
}
