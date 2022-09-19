package com.organization.organizationservice.service;

import com.organization.organizationservice.model.Organization;
import com.organization.organizationservice.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class OrganizationService {

    private OrganizationRepository organizationRepository;
    @Autowired
    public OrganizationService(OrganizationRepository organizationRepository){
        this.organizationRepository=organizationRepository;
    }
    public Organization saveOrg(Organization organization) {
        organization.setId(UUID.randomUUID().toString());
        return organizationRepository.save(organization);
    }

    public Organization getOrganization(String organizationId) {
        Optional<Organization> organization = organizationRepository.findById(organizationId);
        if(organization.isPresent()) return organization.get();
        return null;
    }
}
