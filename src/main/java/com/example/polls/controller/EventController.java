package com.example.polls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import com.example.polls.model.Address;
import com.example.polls.model.Event;
import com.example.polls.payload.EventRequest;
import com.example.polls.repository.EventRepository;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    

	
	@RequestMapping(value = "/createEvent", method = RequestMethod.POST)
	public ResponseEntity<?> createEvent(@Valid @RequestBody EventRequest request){

        Event event= new Event(request.getEventName(),request.getCategoryId(),request.getCityId(),request.getAddress());
        eventRepository.save(event);
        return new ResponseEntity(HttpStatus.ACCEPTED);
	}

    
}
