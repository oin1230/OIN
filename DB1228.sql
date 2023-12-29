-- SQL(구조화 질의 언어)
-- MySQL DBMS(RDBMS : 관계형 데이터베이스) -> TABLE 단위로 관리
-- 제약조건(constraint)
-- select * from 테이블명 order by 열이름 asc;
-- -> 오름차순 정렬
-- -> desc; 내림차순 정렬
create database bigdata;

create table student(
	num int not null primary key auto_increment,
    name varchar(50),
    tel varchar(50),
    age int,
    email varchar(50)
);

-- CRUD
-- 정보추가하기
insert into student(name, tel, age, email) 
values('홍길동', '010-1111-1111', 20, 'aaaa@naver.com'
);

insert into student(name, tel, age, email)
values('오인영', '010-5625-1111', 30, 'aaaa@naver.com'
);

-- 저장된 데이터 보기
select * from student;

-- 정보 수정하기
-- num가 2인 학생의 나이를 99로 수정하세요.
update student set age = 99 where num = 2;
-- 전화번호와 이메일주소를 동시에 수정하세요.
update student
set tel ='010-2222-2222', email = '2222@naver.com'
where num = 2;

-- 정보 삭제하기
-- 2번 학생을 삭제하시요
delete from student
where num = 2;

-- 테이블 삭제(drop)
drop table student;



