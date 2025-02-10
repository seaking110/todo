package com.example.member.service;

import com.example.member.dto.SaveRequestDto;
import com.example.member.dto.SaveResponseDto;
import com.example.member.entity.Member;
import com.example.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }
    public SaveResponseDto save(SaveRequestDto dto) {
        Member member = memberRepository.save(new Member(dto.getName(), dto.getEmail(), dto.getPassword()));
        return new SaveResponseDto(member.getId(), member.getName(), member.getEmail(), member.getCreatedAt(), member.getModifiedAt());
    }
}
