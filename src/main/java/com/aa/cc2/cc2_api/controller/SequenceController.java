package com.aa.cc2.cc2_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sequence")
public class SequenceController {
    @GetMapping(path = "/number")
    public String getSequenceNumber() {
        return "This is Seq13910";
    }
}
