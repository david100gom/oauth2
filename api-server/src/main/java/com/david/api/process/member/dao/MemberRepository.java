package com.david.api.process.member.dao;

import com.david.api.process.member.domain.Member;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by david100gom on 2017. 9. 5.
 *
 * Github : https://github.com/david100gom
 */
//@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
    Member findByUsername(String username);
}