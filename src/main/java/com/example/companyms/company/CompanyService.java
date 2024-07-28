package com.example.companyms.company;

import com.example.companyms.company.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    boolean updateCompany(Company updateCompany, Long id);

    void createCompany(Company company);

    boolean deleteCompany(Long id);

    Company getCompanyById(Long id);

    public void updateCompanyRating(ReviewMessage reviewMessage);
}
