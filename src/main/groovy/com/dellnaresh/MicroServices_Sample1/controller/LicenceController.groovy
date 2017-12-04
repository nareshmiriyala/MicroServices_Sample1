package com.dellnaresh.MicroServices_Sample1.controller

import com.dellnaresh.MicroServices_Sample1.model.License
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/organizations/{organizationId}/licenses")
class LicenceController {

  @GetMapping("/{licenseId}")
  License getLicenses(@PathVariable("organizationId") String organizationId,
                      @PathVariable("licenseId") String licenseId) {
    return new License(id: licenseId, productName: "Teleco", licenseType: "Seat", organizationId: organizationId)
  }

}
