package com.dellnaresh.MicroServices_Sample1.services

import com.dellnaresh.MicroServices_Sample1.repo.LicenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LicenseService {
  @Autowired
  private LicenseRepository licenseRepository

}
