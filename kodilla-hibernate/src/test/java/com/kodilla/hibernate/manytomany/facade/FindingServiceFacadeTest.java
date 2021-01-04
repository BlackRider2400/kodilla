package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FindingServiceFacadeTest {

    @Autowired
    private FindingServiceFacade findingService;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void findCompanyTest(){
        //Given
        Company company = new Company("Tesla");
        Company company1 = new Company("Dhl");
        Company company2 = new Company("Apple");

        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);

        //When
        List<CompanyDto> companyDtos = findingService.findCompanyByNameFragment("Dhl");

        //Then
        assertEquals(companyDtos.size(), 1);

        //CleanUp
        companyDao.delete(company);
        companyDao.delete(company1);
        companyDao.delete(company2);
    }

    @Test
    void findEmployeeTest(){
        //Given
        Employee employee = new Employee("John", "Smith");
        Employee employee1 = new Employee("Jessy", "Smith");
        Employee employee2 = new Employee("Max", "Smith");

        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        //When
        List<EmployeeDto> employeeDaos = findingService.findEmployeeByNameFragment("J");

        //Then
        assertEquals(employeeDaos.size(), 2);

        //CleanUp
        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
    }
}