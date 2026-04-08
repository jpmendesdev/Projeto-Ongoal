package com.jpmendes.OngoalAPI2.dto;

import com.jpmendes.OngoalAPI2.model.MedicineTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicineTableDTO {
    private int id;
    private String medicineName;
    private int totalCapsules;

    public static MedicineTableDTO convert(MedicineTable medicineTable){
        MedicineTableDTO medicineTableDTO = new MedicineTableDTO();
        medicineTableDTO.setId(medicineTable.getId());
        medicineTableDTO.setMedicineName(medicineTable.getMedicineName());
        medicineTableDTO.setTotalCapsules(medicineTable.getTotalCapsules());
        return medicineTableDTO;
    }
}
