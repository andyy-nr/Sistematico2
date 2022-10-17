/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistandreanunez;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author isi7
 */
public class ArrayListImp {
    private List<Empleado> empList = new ArrayList<>();

    public List<Empleado> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Empleado> empList) {
        this.empList = empList;
    }
    
    public void agregarEmpleado(Empleado emp){
        empList.add(emp);
        this.setEmpList(empList);
    }
    
}
