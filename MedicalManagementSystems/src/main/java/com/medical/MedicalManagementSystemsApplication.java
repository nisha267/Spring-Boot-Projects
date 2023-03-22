package com.medical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.medical.entity.Doctor;
import com.medical.entity.Patient;
import com.medical.repository.DoctorRepository;
import com.medical.repository.PatientRepository;

@SpringBootApplication
public class MedicalManagementSystemsApplication implements CommandLineRunner {
	@Autowired
	private DoctorRepository doctorrepository;
	@Autowired
	private PatientRepository patientrepository;

	public static void main(String[] args) {
		SpringApplication.run(MedicalManagementSystemsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Doctor d1 = Doctor.builder().doctor_name("Chirag Basu").Specialization("Psychiatist").dcontact_no(7865432198l)
				.build();

		doctorrepository.save(d1);
		Patient p1 = Patient.builder().patient_name("Shivam Roy").age(21).gender("male").bloodGroup("o+")
				.pcontact_no(6543218765l).Idnumber("231454362187").insuranceavailable("yes").doctor(d1).build();
		patientrepository.save(p1);
		System.out.println("-----All saved-----");

	}

}
