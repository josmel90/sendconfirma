package com.example.sendconfirma.controller;

 
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.sendconfirma.entity.Param;

@RestController
@RequestMapping({"/send"})
@CrossOrigin(origins = {"*"})
public class SendController {
  @Autowired
  @GetMapping({"/"})
  public String index() {
    return "v 0.1 dev: jOSLabs";
  }
  
  @GetMapping({"/whatsapp/{num}/{men}"})
  public String sendData(@PathVariable String num, @PathVariable String men) throws IOException {
    RestTemplate restTemplate = new RestTemplate();
    String resourceUrl = "http://flow.datasend.com.br:8090/BMV/MV-SendMessage.rule?sys=BMV";
    HttpEntity<Param> request = new HttpEntity(new Param("45", "+51" + num, "text", men));
    return (String)restTemplate.postForObject(resourceUrl, request, String.class, new Object[0]);
  }
}

