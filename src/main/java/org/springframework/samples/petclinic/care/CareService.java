package org.springframework.samples.petclinic.care;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.pet.PetType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CareService {    

    @Autowired
    CareProvisionRepository cpr;
    
    public List<Care> getAllCares(){
        List<Care> cuidado = cpr.findAllCares();
        return cuidado;
    }
    
    public List<Care> getAllCompatibleCares(PetType petTypeName, Care additionalCareName){
        return null;
    }
    
    public Care getCare(String careName) {
        Care cuidado = cpr.findCareByName(careName);
        return cuidado;
       
    }
    
    public CareProvision save(CareProvision p) throws NonCompatibleCaresException, UnfeasibleCareException {        
        return null;   
    }

    public List<CareProvision> getAllCaresProvided(){
        List<CareProvision> res = cpr.findAll();
        return res;
    }

    public List<CareProvision> getCaresProvidedInVisitById(Integer visitId){
        return null;

    }
 
    public Page<CareProvision> getPaginatedCareProvisions(Pageable pageable){
        return null;
    }

}
