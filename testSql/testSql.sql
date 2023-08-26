create database test_sql
use test_sql

--Bài 1
create table canhan(
id int identity,
email varchar(100),
primary key(id)
)

insert into canhan
values('a@b.com'),('c@d.com'),('a@b.com')

--1. Hiển thị tất cả các email bị trùng trong bảng “Canhan”.
select 
email
from canhan
group by email
having count(email) > 1

--2. Hiển thị tất cả các email không bị trùng trong bảng “Canhan”.
select 
email
from canhan
group by email
having count(email) = 1

--Bài 2
create table luong(
id int identity,
salary int,
primary key(id)
)

insert into luong
values (100),(200),(300)

--Viết câu lệnh SQL để hiển thị giá trị lương của nhân viên có mức lượng cao thứ nhì trong bảng “luong”.
select
max(salary) as 'SecondHighestSalary'
from luong
where salary < 
(
select 
max(salary) 
from luong
);

--Bài 3
create table ketqua(
id int identity,
score decimal(10,2),
primary key(id)
)

insert into ketqua
values (3.50),(3.65),(4.00),(3.85),(4.00),(3.65)

--Viết câu lệnh SQL để hiển thị xếp hạng các lượt chơi theo nguyên tắc:
--- Lượt chơi có số điểm cao nhất sẽ có xếp hạng bé nhất là 1.
--- Các lượt chơi có số điểm bằng nhau có số xếp hạng (rank) bằng nhau.
--- Sắp xếp theo thứ tự giảm dần theo rank.

select 
score,
dense_rank() over (order by score desc) as 'rank'
from ketqua
order by 'rank';

