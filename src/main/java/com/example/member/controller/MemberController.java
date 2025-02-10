package com.example.member.controller;

import com.example.member.dto.SaveRequestDto;
import com.example.member.dto.SaveResponseDto;
import com.example.member.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<SaveResponseDto> save(@RequestBody @Valid SaveRequestDto dto) {
        return new ResponseEntity<>(memberService.save(dto), HttpStatus.CREATED);
    }



}
