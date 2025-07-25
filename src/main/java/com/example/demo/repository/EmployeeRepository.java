/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentRepository Class.
 * <p>
 * </p>
 *
 * @author
 */

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
