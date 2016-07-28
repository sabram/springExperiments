package com.shaunabram.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Controller
public class GreetingController {

    //fails with:
    //No qualifying bean of type [com.shaunabram.spring.Greeting] is defined: expected single matching bean but found 2: irish,french
//    @Inject
//    Greeting greeting;

    @Inject
    Greeting mongoDB;

    @Inject
    Greeting mongoDBRead;

    @Inject
    @Qualifier("mongoDBRead")
    Greeting mongoWithQualifier;

    @PostConstruct
    public void injectionDebug() {
        System.out.println("injected Greeting mongoDB = " + mongoDB);
        System.out.println("injected Greeting mongoDBRead = " + mongoDBRead);
        System.out.println("injected Greeting mongoWithQualifier = " + mongoWithQualifier);
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}