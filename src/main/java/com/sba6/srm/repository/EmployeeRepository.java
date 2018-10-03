package com.sba6.srm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sba6.srm.entity.Employee;
import com.sba6.srm.entity.Request;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

	@Query(value="SELECT r FROM employee e, request r WHERE e.MGR_ID = :mgrId AND r.EMP_ID = e.ID", nativeQuery = true)
	public List<Request> getRequestsForManager(@Param("mgrId") Long mgrId);
}
