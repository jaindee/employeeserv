package com.paypal.bfs.test.employeeserv.api;


import com.paypal.bfs.test.employeeserv.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Interface for employee resource operations.
 */
public interface EmployeeResource {

    /**
     * Retrieves the {@link Employee} resource by id.
     *
     * @param id employee id.
     * @return {@link Employee} resource.
     */
    @RequestMapping("/v1/bfs/employees/{id}")
    ResponseEntity<Employee> employeeGetById(@PathVariable("id") String id);

    // ----------------------------------------------------------
    // TODO - add a new operation for creating employee resource.
    // ----------------------------------------------------------

    @RequestMapping("/v1/bfs/employee/create")
    ResponseEntity<Employee> createEmployee(@RequestBody Employee employee);

    @RequestMapping("/v1/bfs/employee/retrieve/getall")
    ResponseEntity<List<Employee>> getEmployees();

    @RequestMapping("/v1/bfs/employee/retrieve/get/{id}")
    ResponseEntity<Employee> getEmployee(@PathVariable long id);
}
