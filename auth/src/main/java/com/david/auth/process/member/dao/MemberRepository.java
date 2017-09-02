package com.david.auth.process.member.dao;

import com.david.auth.process.member.domain.Member;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by david100gom on 2017. 9. 2.
 *
 * Github : https://github.com/david100gom
 */
@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
