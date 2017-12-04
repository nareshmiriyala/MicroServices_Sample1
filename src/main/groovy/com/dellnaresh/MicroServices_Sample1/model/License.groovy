package com.dellnaresh.MicroServices_Sample1.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "licenses")
class License {
  @Id
  @Column(name = "license_id",nullable = false)
  String id
  @Column(name = "product_name",nullable = false)
  String productName
  @Column(name = "license_type",nullable = false)
  String licenseType
  @Column(name = "organization_id",nullable = false)
  String organizationId
}
