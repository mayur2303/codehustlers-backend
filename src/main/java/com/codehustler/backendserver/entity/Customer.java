package com.codehustler.backendserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "Cust_ID")
    private String id;

    @Column(name = "Status_Dt")
    private String statusDt;

    @Column(name = "Emp_Status")
    private String empStatus;

    @Column(name = "Cust_Ctry")
    private String custCtry;

    @Column(name = "Cust_Sex")
    private String sex;

    @Column(name = "Age")
    private String age;

    @Column(name = "Join_Dt")
    private String joinDt;

    @Column(name = "Is_New_Cust")
    private String isNewCust;

    @Column(name = "Cust_Since")
    private String custSince;

    @Column(name = "Relship_Status")
    private String relshipStatus;

    @Column(name = "Lst_Dt_Primary_Cust")
    private String lstDtPrimaryCust;

    @Column(name = "Cust_Type_Mth_Beg")
    private String custTypeMthBeg;

    @Column(name = "Cust_Relship_Type_Mth_Beg")
    private String custRelshipTypeMthBeg;

    @Column(name = "Residence_Ctry")
    private String residenceCtry;

    @Column(name = "Is_Foreigner")
    private String isForeigner;

    @Column(name = "Is_Spouse_Emp")
    private String isSpouseEmp;

    @Column(name = "Join_Channel")
    private String joinChannel;

    @Column(name = "Deceased_Flg")
    private String deceasedFlg;

    @Column(name = "Address_Type")
    private String addressType;

    @Column(name = "Cust_Province_Cd")
    private String custProvinceCd;

    @Column(name = "Cust_Province_Name")
    private String custProvinceName;

    @Column(name = "Cust_Active_Status")
    private String custActiveStatus;

    @Column(name = "Gross_HHLD_Income")
    private String grossHHLDIncome;

    @Column(name = "Cust_Segment")
    private String custSegment;




}
