INSERT INTO roles (name) VALUES ('USER');
INSERT INTO roles (name) VALUES ('CREATOR');
INSERT INTO roles (name) VALUES ('EDITOR');
INSERT INTO roles (name) VALUES ('ADMIN');

INSERT INTO EMPLOYEE (username, password, enabled) VALUES ('nilesh', '$2a$10$OlpVGGz1EXm.LQ/OcvmBQOFdAe3FQNYhOOXrKD6y9fhxOr2aBKwHu', '1');
INSERT INTO employees_roles (employee_id, role_id) VALUES (1, 1);

INSERT INTO EMPLOYEE (username, password, enabled) VALUES ('mahesh', '$2a$10$lv8PTtiNw7injglznpYeIehWW6knfFe/RnUW16TmGKtfSWRm/V2z2', '1');
INSERT INTO EMPLOYEE (username, password, enabled) VALUES ('suresh', '$2a$10$flDL1ovH.7JEy1lSpBuuHuqagrXA8K3j3ELXQFV/KXhQK.WSnP8a.', '1');
INSERT INTO EMPLOYEE (username, password, enabled) VALUES ('ramesh', '$2a$10$9k8/ODt16QFCmcmXLO2.oeVR8gHUtqpw9JeoEwEx/BKKAX9BZbbHK', '1');
INSERT INTO EMPLOYEE (username, password, enabled) VALUES ('admin', '$2a$10$bN7OWEvi6rTqJEYbZfDOg.FHmG.xPTDxJR1k9LzsR4O6Nt8zuIKwq', '1');

INSERT INTO employees_roles (employee_id, role_id) VALUES (2, 2); 
INSERT INTO employees_roles (employee_id, role_id) VALUES (3, 3); 
INSERT INTO employees_roles (employee_id, role_id) VALUES (4, 2); 
INSERT INTO employees_roles (employee_id, role_id) VALUES (4, 3); 
INSERT INTO employees_roles (employee_id, role_id) VALUES (5, 4);

INSERT INTO BOND (bid,status,coupon,cusip,face_value,isin,issuer,maturity_date,type,username) VALUES ('111','Redeemed','None','65432','100000','6788','User1', '12/12/15','Govt. Bond','suresh');
INSERT INTO BOND (bid,status,coupon,cusip,face_value,isin,issuer,maturity_date,type,username) VALUES ('112','Not Redeemed','None','64332','200000','6789','User2', '2/1/21','Corporate Bond','ramesh');
INSERT INTO BOND (bid,status,coupon,cusip,face_value,isin,issuer,maturity_date,type,username) VALUES ('113','Not Redeemed','None','65542','130000','6790','User2', '1/02/22','Treasury Bond','nilesh');
INSERT INTO BOND (bid,status,coupon,cusip,face_value,isin,issuer,maturity_date,type,username) VALUES ('114','Redeemed','None','65442','50000','6791','User3', '12/5/21','Govt. Bond','mahesh');

