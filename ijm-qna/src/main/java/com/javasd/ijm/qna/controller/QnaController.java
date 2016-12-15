/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javasd.ijm.qna.controller;

import com.javasd.ijm.qna.service.QnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author acampos
 */
@RestController
@EnableSwagger2
public class QnaController
{

    @Autowired
    private QnaService qnaService;
    
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET)
    public Object root()
    {
        return "QnA Microservice Root - " +
                new java.util.Date();
    }
    
    @RequestMapping(
    value = "/findAll",
            method = RequestMethod.GET )
    public Object findAll()
    {
        return qnaService.findAll();
    }
}
