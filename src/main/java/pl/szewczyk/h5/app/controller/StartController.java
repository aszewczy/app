package pl.szewczyk.h5.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.szewczyk.h5.app.model.FindParams;
import pl.szewczyk.h5.app.model.Photo;

import java.util.List;

@Controller
public class StartController {


    public StartController() {
    }

    @GetMapping("/start")
    public String getStart() {
        return "StartView";
    }





}
