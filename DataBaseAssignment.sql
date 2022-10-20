create table CUSTOMER(
Cust_id varchar(5),
Fname varchar(15),
Lname varchar(15),
Area char(2),
Phone int(10),
DOB Date,
Payment int(62)
);
desc CUSTOMER;
select * from CUSTOMER;
INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A01', 'Ivan', 'Ross', 'SA', 6125467, '1986-01-15', 800.50);

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A02', 'Vandana', 'Ray', 'MU', 5560379, '1987-12-20', 1000.75);

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A03', 'Pramada', 'Jauguste', 'DA', 4560389, '1967-07-25', 500.00);

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A04','Basu', 'Navindi', 'BA', 6125401, '1956-02-26', 860.00);

INSERT INTO customer(Cust_id, Fname, Lname, Area,  DOB, Payment)
VALUES('A05', 'Ravi', 'Shridhar', 'NA', '1989-02-15', 500.50);

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A06', 'Rukmini', 'Aiyer', 'GH', 5125274, '1987-07-23', 1500.50);
select * from CUSTOMER;

update CUSTOMER set Phone=1234567876
where Cust_id=A02;

update CUSTOMER set Phone=3456787653
where Cust_id=A04;

update CUSTOMER set DOB=1998-03-17
where Cust_id=A03;

update CUSTOMER set DOB=1998-04-26
where Cust_id=A05;

select * from CUSTOMER;

delete from CUSTOMER where Cust_id=A01;
delete from CUSTOMER where Cust_id=A05;
select * from CUSTOMER;
truncate table CUSTOMER;

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A01', 'Ivan', 'Ross', 'SA', 6125467, '1986-01-15', 800.50);

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A02', 'Vandana', 'Ray', 'MU', 5560379, '1987-12-20', 1000.75);

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A03', 'Pramada', 'Jauguste', 'DA', 4560389, '1967-07-25', 500.00);

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A04','Basu', 'Navindi', 'BA', 6125401, '1956-02-26', 860.00);

INSERT INTO customer(Cust_id, Fname, Lname, Area, Phone, DOB, Payment)
VALUES('A04','Basu', 'Navindi', 'BA', 6125401, '1956-02-26', 860.00);

update CUSTOMER set DOB=1998-03-17
where Cust_id=A06;

delete from CUSTOMER where Cust_id=A03;



