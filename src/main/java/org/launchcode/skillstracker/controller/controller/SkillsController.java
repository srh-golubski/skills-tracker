package org.launchcode.skillstracker.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String showList() {
        String html =
                "<html>" +
                "<body>" +
                    "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the </h2>" +
                            "<ol>" +
                                "<li>Java</li>" +
                                "<li>JavaScript</li>" +
                                "<li>Python</li>" +
                            "</ol>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String showForm() {
        String html = "<html>" +
                "<body>" +
                    "<form method='post' action='result'>" +
                        "<input type='text' name='name'/>" +
                "<input list='languages' name='firstLanguage'/>" +
                "<input list='languages' name='secondLanguage'/>" +
                "<input list='languages' name='thirdLanguage'/>" +
                "<input type='submit' value='Continue'>" +
                    "</form>" +
                "</body>" +
                "<datalist id='languages'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "<option value='CSS'>CSS</option>" +
                "<option value='TypeScript'>TypeScript</option>" +
                "</html>";
        return html;
    }

    @PostMapping("result")
    public String showResult(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        String html =  "<html>" +
                "<body>" +
                "<p>Hello, " + name + "</p>" +
                "<ol>" +
                "<li>"+ firstLanguage +"</li>" +
                "<li>"+ secondLanguage +"</li>" +
                "<li>"+ thirdLanguage +"</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }
}
