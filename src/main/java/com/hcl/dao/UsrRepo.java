package com.hcl.dao;

import org.springframework.data.repository.CrudRepository;

import com.hcl.model.Users;

public interface UsrRepo extends CrudRepository<Users, Long> {

}
