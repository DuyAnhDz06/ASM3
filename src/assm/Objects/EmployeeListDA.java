/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assm.Objects;

import java.util.ArrayList;
import java.util.List;
import Interfaces.EmployeeListInterface;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class EmployeeListDA implements EmployeeListInterface {

    private static List<Staff> empList = new ArrayList<Staff>();
    private static List<Staff> sortList = new LinkedList<Staff>();
    private Comparable<Staff> comparator;

    @Override
    public List<Staff> returnEmpList() {
        return empList;
    }

    @Override
    public List<Staff> returnSortList() {
        return sortList;
    }

    @Override
    public void setEmpList(Object newList) {
        empList = (ArrayList<Staff>) newList;
    }

    @Override
    public Staff getEmp(int index) {
        return empList.get(index);
    }

    @Override
    public void addEmp(Staff e) {
        empList.add(e);
    }

    @Override
    public void updateEmp(int index, Staff newEmp) {
        empList.set(index, newEmp);
    }

    @Override
    public void removeEmp(int index) {
        empList.remove(index);
    }

    @Override
    public int getEmpListSize() {
        return empList.size();
    }

    @Override
    public <T> void searchInList(T search) {
        sortList.clear();
        for (Staff e : empList) {
            if (e.toString().toLowerCase().contains(((String) search).toLowerCase())) {
                sortList.add(e);
            }
        }
    }

}
