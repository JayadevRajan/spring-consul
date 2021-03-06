package com.awesomesoftware.identityservice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class UserConfigRestController {


    private final UserConfiguration userConfiguration;

    @GetMapping("userconfig")
    public UserConfiguration.User get(){
        return userConfiguration.getUser();
    }

}
