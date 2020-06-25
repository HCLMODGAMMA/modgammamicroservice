package com.mot.gamma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mot.gamma.entiry.CaseDetails;

@Repository
public interface CaseDetailsRepository extends JpaRepository<CaseDetails, Integer>{

}
