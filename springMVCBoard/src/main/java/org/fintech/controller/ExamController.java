package org.fintech.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.fintech.domain.SampleVO;
import org.fintech.domain.Ticket;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

//기존 Controller에서는 Model 객체에
//데이터를 담아서 JSP에 View로 전달하는 방식인데
//반해 @RestController는 메서드의 리턴 타입
//으로 사용자가 정의한 클래스 타입을 사용가능하고
//JSON이나 XML로 자동으로 데이터를 처리가능함
@RestController
@RequestMapping("/sample")
@Log4j
public class ExamController {
	
	@GetMapping(value="/test1",produces="text/plain;charset=UTF-8")
	public String getText1() {
		
		log.info("MIME type:" + MediaType.TEXT_PLAIN_VALUE);
		
		return "exam test1 page"; 
	}
	@GetMapping(value="/test2",produces="text/plain;charset=UTF-8")
	public String getText2() {
		
		log.info("MIME type:" + MediaType.TEXT_PLAIN_VALUE);
		
		return "exam test2 page"; 
	}
	@GetMapping(value="/test3",produces="text/plain;charset=UTF-8")
	public String getText3() {
		
		log.info("MIME type:" + MediaType.TEXT_PLAIN_VALUE);
		
		return "exam test3 page"; 
	}
}