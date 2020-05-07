package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillsController {
    @GetMapping("form")
    @RequestMapping(value = "form", method = {RequestMethod.GET, RequestMethod.POST})
    public String skillDisplay(@RequestParam String coder) {
        return coder;
    }

    @GetMapping
    @ResponseBody
    public String skillsForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<label for='skill'>Skills Tracker:</label>" +
                        "<input type = 'text' name = 'coder" +
                        "<form method = 'post' action = 'form'>" +
                        "<select name='skill1'>" +
                        "<option value='html'>HTML</option>" +
                        "<option value='js'>JavaScript</option>" +
                        "<option value='css'>CSS</option>" +
                        "</select>" +

                        "<select name='skill2'>" +
                        "<option value='html'>HTML</option>" +
                        "<option value='js'>JavaScript</option>" +
                        "<option value='css'>CSS</option>" +
                        "</select>" +

                        "<select name='skill3'>" +
                        "<option value='html'>HTML</option>" +
                        "<option value='js'>JavaScript</option>" +
                        "<option value='css'>CSS</option>" +
                        "</select>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
