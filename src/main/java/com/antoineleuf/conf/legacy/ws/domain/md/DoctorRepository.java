package com.antoineleuf.conf.legacy.ws.domain.md;

import java.util.List;

public interface DoctorRepository {
  List<Doctor> findAll();

  Doctor findById(String id);

  void update(Doctor doctor) throws DoctorNotFoundException;

  void save(Doctor doctor);

  void remove(String id);

}
