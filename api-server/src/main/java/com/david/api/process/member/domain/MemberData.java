package com.david.api.process.member.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import java.util.Set;

/**
 * Created by david100gom on 2017. 9. 8.
 *
 * Github : https://github.com/david100gom
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberData {

    Long id;
    String name;
    String username;
    String email;
    String phone;
    String nick;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    Date lastLoginDate;

    public static MemberData from(Member member, Set<String> scopes) {
        MemberData memberData = new MemberData();
        memberData.id = member.getId();
        memberData.name = member.getName();
        memberData.username = member.getName();
        if (scopes.contains("member.info.email")) {
            memberData.email = member.getEmail();
        }
        if (scopes.contains("member.info.phone")) {
            memberData.phone = member.getPhone();
        }
        if (scopes.contains("member.info.nick")) {
            memberData.nick = member.getNick();
        }
        if (scopes.contains("member.info.last_login_date")) {
            memberData.lastLoginDate = member.getLastLoginDate();
        }
        return memberData;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getNick() {
        return nick;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }
}
