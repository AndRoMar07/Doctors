package com.doctors.repository.crudrepository;

import com.doctors.model.DoctorModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoctorCrudRepository extends CrudRepository<DoctorModel, Integer> {

}
