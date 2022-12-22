package org.springframework.samples.petclinic.care;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class CareFormatter implements Formatter<Care>{

    @Autowired
    private CareService cs;

    @Override
    public String print(Care object, Locale locale) {
        return object.getName();
    }

    @Override
    public Care parse(String text, Locale locale) throws ParseException {
        Care care = cs.getCare(text);
        if(care != null){
            return care;
        }
        throw new ParseException("No se puede obtener el cuidado", 0);
    }


  
}

    
/*
 * 
 * @Override
public FeedingType parse(String text, Locale locale) throws ParseException {
for( FeedingType ft: feedingService.getAllFeedingTypes()){
    if(ft.getName().equals(text)){
    return ft;
    }
    }
    throw new ParseException("No se encontraron
coincidencias", 0);
}
}
 */


