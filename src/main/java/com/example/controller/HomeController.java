package com.example.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    /**
     * �u���E�U�ŁA�ȉ�URL�Ŏ��s���ĉ������B
     * JSON���ԋp����܂��B
     * http://localhost:8080/spring-request-param/test/?data='test'&count=2
     * 
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String home(@RequestParam("data") String data,
                       @RequestParam("count") Integer count,
                       Locale locale,
                       Model model) {

        // ����p�����[�^�udata�v��jsp�ɏo�͂��܂��B
        model.addAttribute("data", data );

        // ����p�����[�^�ucount�v��jsp�ɏo�͂��܂��B
        model.addAttribute("count", count );

        return "home";
    }
}
