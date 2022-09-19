package com.organization.organizationservice.controller;

import com.organization.organizationservice.model.Organization;
import com.organization.organizationservice.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/organizations")
public class OrganizationController {
    private OrganizationService organizationService;

    @Autowired
    public OrganizationController(OrganizationService organizationService){
        this.organizationService=organizationService;
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Organization saveOrg(@RequestBody Organization organization){
       return organizationService.saveOrg(organization);
    }

    @RequestMapping(value = "/{organizationId}", method = RequestMethod.GET)
    public Organization getOrganization(@PathVariable("organizationId") String organizationId){
        return organizationService.getOrganization(organizationId);
    }
}
