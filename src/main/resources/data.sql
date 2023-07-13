insert into product values (1, 'Savings_Acct');
insert into product values (2, 'Guarantees');
insert into product values (3, 'Cur_Acct');
insert into product values (4, 'Derivative_Acct');
insert into product values (5, 'Payroll_Acct');
insert into product values (6, 'Junior_Acct');
insert into product values (7, 'Mas_Particular_Acct');
insert into product values (8, 'Particular_Acct');
insert into product values (9, 'Particular_Plus_Acct');
insert into product values (10, 'Short_Term_Deposits');
insert into product values (11, 'Med_Term_Deposits');
insert into product values (12, 'Long_Term_Deposits');
insert into product values (13, 'e-Acct');
insert into product values (14, 'Funds');
insert into product values (15, 'Mortgage');
insert into product values (16, 'Pension1');
insert into product values (17, 'Loans');
insert into product values (18, 'Taxes');
insert into product values (19, 'Credit_Card');
insert into product values (20, 'Securities');
insert into product values (21, 'Home_Acct');
insert into product values (22, 'Payroll');
insert into product values (23, 'Pension2');
insert into product values (24, 'Direct_Debit');

drop table customer;
CREATE TABLE customer
(
  Cust_ID VARCHAR(100),
  Status_Dt VARCHAR(100),
  Emp_Status VARCHAR(100),
  Cust_Ctry VARCHAR(100),
  Cust_Sex VARCHAR(100),
  Age VARCHAR(100),
  Join_Dt VARCHAR(100),
  Is_New_Cust VARCHAR(100),
  Cust_Since VARCHAR(100),
  Relship_Status VARCHAR(100),
  Lst_Dt_Primary_Cust VARCHAR(100),
  Cust_Type_Mth_Beg VARCHAR(100),
  Cust_Relship_Type_Mth_Beg VARCHAR(100),
  Residence_Ctry VARCHAR(100),
  Is_Foreigner VARCHAR(100),
  Is_Spouse_Emp VARCHAR(100),
  Join_Channel VARCHAR(100),
  Deceased_Flg VARCHAR(100),
  Address_Type VARCHAR(100),
  Cust_Province_Cd VARCHAR(100),
  Cust_Province_Name VARCHAR(100),
  Cust_Active_Status VARCHAR(100),
  Gross_HHLD_Income VARCHAR(100),
  Cust_Segment VARCHAR(100)
)
AS
SELECT *
FROM CSVREAD('insert_customer.csv');