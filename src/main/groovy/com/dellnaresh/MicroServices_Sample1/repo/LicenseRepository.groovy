package com.dellnaresh.MicroServices_Sample1.repo

import com.dellnaresh.MicroServices_Sample1.model.License
import org.springframework.data.jpa.repository.JpaRepository

interface LicenseRepository extends JpaRepository<License, String> {
}
