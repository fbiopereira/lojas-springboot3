package com.fbiopereira.companybranchescleanarchspringboot3.domain;

import com.fbiopereira.companybranchescleanarchspringboot3.domain.enumerator.CompanyBranchType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyBranchTypeUnitTest {

    @Test
    @DisplayName("Testing CompanyBranchType descriptions")
    void CompanyBranchValidateDescription(){

        assertEquals("CD", CompanyBranchType.Deposit.toString());
        assertEquals("LOJA", CompanyBranchType.Store.toString());
        assertEquals("ONLINE", CompanyBranchType.Online.toString());

    }
}
