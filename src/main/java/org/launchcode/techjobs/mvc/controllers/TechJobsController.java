// Teresa Tull created this on 10-30-2022

package org.launchcode.techjobs.mvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String, String> columnChoices = new HashMap<>();
    static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController() {
        actionChoices.put("all", "All");
        actionChoices.put("employer", "Employer");
        actionChoices.put("location", "Location");
        actionChoices.put("positionType", "Position Type");
        actionChoices.put("coreCompetency", "Skill");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");

    }

    @ModelAttribute("actions")
    public HashMap<String, String> getActionChoices() {
        return actionChoices;
    }

}
