package com.jpmendes.OngoalAPI2.model;

import com.jpmendes.OngoalAPI2.dto.MedicineTableDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicineTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String medicineName;
    private int totalCapsules;

    public static MedicineTable convert(MedicineTableDTO medicineTableDTO){
        MedicineTable medicineTable = new MedicineTable();
        medicineTable.setId(medicineTableDTO.getId());
        medicineTable.setMedicineName(medicineTableDTO.getMedicineName());
        medicineTable.setTotalCapsules(medicineTableDTO.getTotalCapsules());
        return medicineTable;
    }
}
