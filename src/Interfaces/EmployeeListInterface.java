/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import assm.Objects.Staff;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface EmployeeListInterface {

    public <T> void searchInList(T search);

    public List<Staff> returnEmpList();

    public List<Staff> returnSortList();

    public void setEmpList(Object newList);

    public Staff getEmp(int index);

    public void addEmp(Staff e);

    public void updateEmp(int index, Staff newEmp);

    public void removeEmp(int index);

    public int getEmpListSize();
}
