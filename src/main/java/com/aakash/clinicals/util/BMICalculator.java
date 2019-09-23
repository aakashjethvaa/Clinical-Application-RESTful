package com.aakash.clinicals.util;

import java.util.List;

import com.aakash.clinicals.model.ClinicalData;
import com.aakash.clinicals.model.Patient;

public class BMICalculator {

	public static void calculateBMI(List<ClinicalData> clinicalData, ClinicalData eachEntry) {
		if (eachEntry.getComponentName().equals("hw")) {
			String[] heightAndWeight = eachEntry.getComponentValue().split("/");
			if (heightAndWeight != null && heightAndWeight.length > 1) {
				float feetToMetres = Float.parseFloat(heightAndWeight[0]) * 0.4536F;
				float BMI = Float.parseFloat(heightAndWeight[1]) / (feetToMetres * feetToMetres);
				ClinicalData bmiEntry = new ClinicalData();
				bmiEntry.setComponentName("BMI");
				bmiEntry.setComponentValue(Float.toString(BMI));
				clinicalData.add(bmiEntry);
			}
		}
		
	}
}
