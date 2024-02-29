package com.cis.vani.demo.repository;


import com.cis.vani.demo.entity.LibraryMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LIbraryMemberRepository extends JpaRepository<LibraryMember, Integer> {

}