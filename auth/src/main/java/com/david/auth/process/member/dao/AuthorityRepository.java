package com.david.auth.process.member.dao;

import com.david.auth.process.member.domain.Authority;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by david100gom on 2017. 9. 10.
 *
 * Github : https://github.com/david100gom
 */
public interface AuthorityRepository extends CrudRepository<Authority, Integer> {

    List<Authority> findByUsername(String username);

}