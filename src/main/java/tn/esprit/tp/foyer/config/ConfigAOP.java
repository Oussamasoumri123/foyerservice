package tn.esprit.tp.foyer.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ConfigAOP {
     @AfterReturning("execution(* tn.esprit.tp.foyer.service.*.*(..))")
    public void LogMethodEntry() {
        log.info("Methode exucute");
        
    }
@AfterReturning("execution(* tn.esprit.tp.foyer.service.ChambreServiceImpl.getChambreById(Long))")
    public void LogMethodEntry2() {
         log.info("Chambre Trouveé");

    }


}
