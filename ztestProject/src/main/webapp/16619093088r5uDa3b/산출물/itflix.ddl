DROP TABLE Subscription CASCADE CONSTRAINTS;
DROP TABLE Review CASCADE CONSTRAINTS;
DROP TABLE Ticket CASCADE CONSTRAINTS;
DROP TABLE Jjim CASCADE CONSTRAINTS;
DROP TABLE Movie CASCADE CONSTRAINTS;
DROP TABLE Prefer CASCADE CONSTRAINTS;
DROP TABLE Notice CASCADE CONSTRAINTS;
DROP TABLE User_Info CASCADE CONSTRAINTS;
DROP TABLE Category CASCADE CONSTRAINTS;

CREATE TABLE Category(
		cg_no                         		NUMBER(10)		 NOT NULL		 PRIMARY KEY,
		cg_name                       		VARCHAR2(50)		 NOT NULL
);

DROP SEQUENCE Category_cg_no_SEQ;

CREATE SEQUENCE Category_cg_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



CREATE TABLE User_Info(
		u_email                       		VARCHAR2(50)		 NOT NULL		 PRIMARY KEY,
		u_pass                        		VARCHAR2(20)		 NOT NULL,
		u_name                        		VARCHAR2(20)		 NOT NULL,
		u_phone                       		VARCHAR2(50)		 NULL 
);


CREATE TABLE Notice(
		n_no                          		NUMBER(10)		 NOT NULL		 PRIMARY KEY,
		n_date                        		DATE		 DEFAULT sysdate		 NULL ,
		n_title                       		VARCHAR2(50)		 NOT NULL,
		n_content                     		VARCHAR2(500)		 NOT NULL,
		n_groupno                     		NUMBER(10)		 NULL ,
		n_step                        		NUMBER(10)		 DEFAULT 0		 NULL ,
		n_depth                       		NUMBER(10)		 DEFAULT 0		 NULL 
);

DROP SEQUENCE Notice_n_no_SEQ;

CREATE SEQUENCE Notice_n_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE Prefer(
		u_email                       		VARCHAR2(50)		 NULL ,
		cg_no                         		NUMBER(10)		 NULL ,
  FOREIGN KEY (u_email) REFERENCES User_Info (u_email),
  FOREIGN KEY (cg_no) REFERENCES Category (cg_no)
);


CREATE TABLE Movie(
		m_no                          		NUMBER(10)		 NOT NULL		 PRIMARY KEY,
		m_name                        		VARCHAR2(50)		 NOT NULL,
		m_actor                       		VARCHAR2(50)		 NULL ,
		m_info                        		VARCHAR2(500)		 NOT NULL,
		m_image                       		VARCHAR2(100)		 NULL ,
		m_count                       		NUMBER(10)		 DEFAULT 0		 NULL ,
		m_date                        		DATE		 NULL ,
		cg_no                         		NUMBER(10)		 NULL ,
  FOREIGN KEY (cg_no) REFERENCES Category (cg_no)
);

DROP SEQUENCE Movie_m_no_SEQ;

CREATE SEQUENCE Movie_m_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE Jjim(
		u_email                       		VARCHAR2(50)		 NULL ,
		m_no                          		NUMBER(10)		 NULL ,
  FOREIGN KEY (u_email) REFERENCES User_Info (u_email),
  FOREIGN KEY (m_no) REFERENCES Movie (m_no)
);


CREATE TABLE Ticket(
		t_no                          		NUMBER(10)		 NULL 		 PRIMARY KEY,
		t_price                       		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE Ticket_t_no_SEQ;

CREATE SEQUENCE Ticket_t_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE Review(
		r_no                          		NUMBER(10)		 NOT NULL		 PRIMARY KEY,
		r_title                       		VARCHAR2(50)		 NULL ,
		r_content                     		VARCHAR2(500)		 NULL ,
		r_grade                       		NUMBER(20)		 NULL ,
		r_date                        		DATE		 DEFAULT sysdate		 NULL ,
		m_no                          		NUMBER(10)		 NULL ,
		u_email                       		VARCHAR2(50)		 NULL ,
  FOREIGN KEY (m_no) REFERENCES Movie (m_no),
  FOREIGN KEY (u_email) REFERENCES User_Info (u_email)
);

DROP SEQUENCE Review_r_no_SEQ;

CREATE SEQUENCE Review_r_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;

CREATE TABLE Subscription(
		s_no                          		NUMBER(10)		 NULL 		 PRIMARY KEY,
		s_start                       		DATE		 DEFAULT sysdate		 NULL ,
		s_end                         		DATE		 NULL ,
		s_cardName                    		VARCHAR2(20)		 NULL ,
		s_cardNumber                  		NUMBER(20)		 NULL ,
		t_no                          		NUMBER(10)		 NULL ,
		u_email                       		VARCHAR2(50)		 NULL ,
  FOREIGN KEY (t_no) REFERENCES Ticket (t_no),
  FOREIGN KEY (u_email) REFERENCES User_Info (u_email)
);

DROP SEQUENCE Subscription_s_no_SEQ;

CREATE SEQUENCE Subscription_s_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



