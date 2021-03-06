/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
package com.salesvision2_0.myjavaservice6.controller;

import com.salesvision2_0.myjavaservice6.MyJavaService6;
import java.lang.String;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController
@RequestMapping(value = "/myJavaService6")
public class MyJavaService6Controller {

    @Autowired
    private MyJavaService6 myJavaService6;

    @RequestMapping(value = "/sampleJavaOperation", produces = "application/json", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "")
    public String sampleJavaOperation(@RequestParam(value = "name", required = false) String name, HttpServletRequest request) {
        return myJavaService6.sampleJavaOperation(name, request);
    }
}
