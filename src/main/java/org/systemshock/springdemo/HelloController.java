package org.systemshock.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping( value = "/" )
    public ModelAndView hello( Model model ) {

        ModelAndView mav = new ModelAndView( "welcome" );
        mav.addObject( "name", "Raiden" );

        return mav;
    }

    @GetMapping( value = "/hello" )
    public ModelAndView loggedHello( Model model ) {
        ModelAndView mav = new ModelAndView( "hello" );
        mav.addObject( "name", "Goro" );

        return mav;
    }
}
