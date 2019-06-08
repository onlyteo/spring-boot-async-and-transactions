INSERT INTO PARENTS (NAME, CREATED) VALUES ('ANAKIN', SYSTIMESTAMP);

INSERT INTO CHILDREN (NAME, PARENT_ID, CREATED) VALUES ('LUKE', (SELECT ID FROM PARENTS WHERE NAME = 'ANAKIN'), SYSTIMESTAMP);
INSERT INTO CHILDREN (NAME, PARENT_ID, CREATED) VALUES ('LEIA', (SELECT ID FROM PARENTS WHERE NAME = 'ANAKIN'), SYSTIMESTAMP);