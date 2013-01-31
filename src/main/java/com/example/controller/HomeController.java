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
     * パラメータを受け取るメソッドです
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String home(@RequestParam("data") String data,
                       @RequestParam("count") Integer count,
                       Locale locale,
                       Model model) {

        // 受取りパラメータ「data」をjspに出力します。
        model.addAttribute("data", data );

        // 受取りパラメータ「count」をjspに出力します。
        model.addAttribute("count", count );

        return "home";
    }
}
