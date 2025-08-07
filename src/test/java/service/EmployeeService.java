package service;

import bean.Employee;

public interface EmployeeService {
String findInsuranceScheme(double salary,String designation);
void assignInsurancescheme(Employee emp);
}
