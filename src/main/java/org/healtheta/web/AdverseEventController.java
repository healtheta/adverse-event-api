package org.healtheta.web;

import org.healtheta.model.adverse.AdverseEvent;
import org.healtheta.model.adverse.repo.AdverseEventRepo;
import org.healtheta.model.common.repos.IdentifierRepo;
import org.healtheta.model.common.repos.ReferenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdverseEventController {
    @Autowired
    AdverseEventRepo adverseEventRepo;
    @Autowired
    private IdentifierRepo identifierRepo;
    @Autowired
    private ReferenceRepo referenceRepo;

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<?> create(@RequestBody AdverseEvent adverseEvent){
        return null;
    }

    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity<?> read(@PathVariable String id){
        return null;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody
    public ResponseEntity<?> update(@RequestBody AdverseEvent adverseEvent){
        return null;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    @ResponseBody
    public ResponseEntity<?> delete(String id) {
        return null;
    }

    @RequestMapping(value = "/search",
            method = RequestMethod.GET,
            produces = "application/json")
    @ResponseBody
    public ResponseEntity<?> search(@RequestParam(value = "eventParticipant", required=false) Long schedule){
        return null;
    }

    @RequestMapping(value = "/format", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity<?> format(){
        return new ResponseEntity<AdverseEvent>(new AdverseEvent(), HttpStatus.OK);
    }
}
