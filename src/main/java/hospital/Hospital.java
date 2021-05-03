package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {


    public Collection<Patient> getAllPatients;
    Map<String, HospitalEmployee> employeeList = new HashMap<>();
    Map<Integer,Patient> patientList = new HashMap<>();
    private int patientId;

    public void hire(HospitalEmployee employeeToHire) {
        employeeList.put(employeeToHire.getEmployeeNumber(), employeeToHire);
    }

    public HospitalEmployee findEmployee(String employeeNumber) {

        return employeeList.get(employeeNumber);
    }

    public Collection<HospitalEmployee> getALlEmployees() {
       return employeeList.values();
    }

    public Collection<HospitalEmployee> getMedicalEmployees() {
        Collection<HospitalEmployee> medicalEmployees = new ArrayList<>();
        for (HospitalEmployee employee : employeeList.values()) {
            if (employee instanceof MedicalDuties) {
                medicalEmployees.add(employee);

            }
        }
        return medicalEmployees;
    }

    public void admit(Patient patientYoAdmit) {
        patientId ++;
        patientList.put(patientId, patientYoAdmit);
    }

    public Collection<Patient> getAllPatients() {
        return patientList.values();
    }
  
}
