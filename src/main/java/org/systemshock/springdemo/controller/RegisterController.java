package org.systemshock.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegisterController {

    @GetMapping( value = "/register" )
    public ModelAndView showRegistrationForm( WebRequest request ) {



        ModelAndView mav = new ModelAndView( "register" );
        mav.addObject( "user", "Stipe" );

        return mav;
    }

}
