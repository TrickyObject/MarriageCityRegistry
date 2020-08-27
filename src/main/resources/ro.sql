DROP TABLE IF EXISTS ro_birth_certificate;
DROP TABLE IF EXISTS ro_marriage_certificate;
DROP TABLE IF EXISTS ro_passport;
DROP TABLE IF EXISTS ro_person;

CREATE TABLE ro_person (

    person_id SERIAL,
    sex SMALLINT not null,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    patronymic varchar(100) not null,
    date_birth date not null,
    PRIMARY KEY (person_id)
);

CREATE TABLE ro_passport(

    passport_id SERIAL not null,
    person_id integer not null,
    serial varchar(10) not null,
    number varchar(10) not null,
    date_issue date not null,
    issue_department varchar(200),
    PRIMARY KEY (passport_id),
    FOREIGN KEY (person_id) REFERENCES ro_person(person_id) ON DELETE RESTRICT

);

CREATE TABLE ro_birth_certificate (
    birth_certificate_id SERIAL not null,
    number_certificate varchar(20) not null,
    date_issue date not null,
    person_id integer not null,
    father_id integer,
    mother_id integer,
    PRIMARY KEY (birth_certificate_id),
    FOREIGN KEY (person_id) REFERENCES ro_person(person_id) ON DELETE RESTRICT,
    FOREIGN KEY (father_id) REFERENCES ro_person(person_id) ON DELETE RESTRICT,
    FOREIGN KEY (mother_id) REFERENCES ro_person(person_id) ON DELETE RESTRICT

);

CREATE TABLE ro_marriage_certificate (
    marriage_certificate_id SERIAL,
    marriage_number varchar(20) not null,
    date_issue date not null,
    husband_id integer,
    wife_id integer,
    active boolean,
    end_date date,
	PRIMARY KEY (marriage_certificate_id),
    FOREIGN KEY (husband_id) REFERENCES ro_person(person_id) ON DELETE RESTRICT,
    FOREIGN KEY (wife_id) REFERENCES ro_person(person_id) ON DELETE RESTRICT

)
;

INSERT INTO ro_person(sex, last_name, first_name, patronymic, date_birth)
VALUES (1, 'Васильева', 'Ирина', 'Петровна', '1997-04-05');

INSERT INTO ro_person(sex, last_name, first_name, patronymic, date_birth)
VALUES (2, 'Васильев', 'Павел', 'Николаевич', '1995-03-18');

INSERT INTO ro_person(sex, last_name, first_name, patronymic, date_birth)
VALUES (2, 'Васильев', 'Никольный', 'Олегович', '2018-10-21');

INSERT INTO ro_passport(person_id, serial, number, date_issue, issue_department)
VALUES ('1', '4321', '654321', '2017-04-05', 'Dep-1');

INSERT INTO ro_passport(person_id, serial, number, date_issue, issue_department)
VALUES ('2', '1234', '123456', '2015-04-11', 'Dep-1');


INSERT INTO ro_marriage_certificate (marriage_number, date_issue, husband_id, wife_id, active, end_date)
VALUES ('1', '2018-04-10', '2', '1', true, null);

INSERT INTO ro_birth_certificate (person_id, mother_id, father_id, number_certificate, date_issue)
VALUES (3, 1, 2, '123B', '2018-11-01');