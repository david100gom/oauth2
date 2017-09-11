package com.david.auth.process.member.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

/**
 * Created by david100gom on 2017. 9. 10.
 *
 * Github : https://github.com/david100gom
 */
@Controller
public class MemberController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        System.out.print("==========>>>>>>>>");

        return "login";
    }
}
