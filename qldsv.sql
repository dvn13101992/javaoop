
insert into khoa(idkhoa, ten_khoa) values(1,'Khoa cntt'),(2,'DTVT'),(3,'Tài chính kế toán');

insert into lop (idlop, ten_lop, idkhoa) values (1, 'cntt01', 1), (2, 'DTVT02', 2), (3, 'TCKT03', 3);

insert into sinh_vien(idsinhvien, ho_ten, gioi_tinh, ngay_sinh, idlop, hoc_bong)
values(1, 'Đặng Văn Nghĩa', 'Nam', '1992/10/13', 1, 100000),
(2, 'Đinh Văn Phúc', 'Nam', '1992/05/15', 2, 0),
(3, 'Phạm Thị Thanh Thu', 'Nữ', '1998/07/14', 3, 500000)
;

insert into sinh_vien(idsinhvien, ho_ten, gioi_tinh, ngay_sinh, idlop, hoc_bong)
values(4, 'Đồng Thị Ngọc Bích', 'Nữ', '1992/8/13', 1, 100000)
;

insert into mon_hoc(idmonhoc, ten_mon_hoc, so_tiet) values(1, 'java core', 10),
(2, 'TT HCM', 15),
(3, 'Vat Ly', 12)
;

insert into ket_qua(idsinhvien, idmonhoc, diem_thi) values(1, 1, 10),(1,2,9),(2,1,3),
(2, 3, 4),
(3, 2, 9);


#1
select idlop, ten_lop, idkhoa from lop l;

#2
select * from sinh_vien;

#3
select * from sinh_vien where hoc_bong > 0;

#4
select * from sinh_vien where gioi_tinh = 'Nữ';

#5
select * from sinh_vien where ho_ten like 'Đinh%';

#6
select * from sinh_vien where gioi_tinh = 'Nữ' and hoc_bong > 0;

#7
select * from sinh_vien where gioi_tinh = 'Nữ' or hoc_bong > 0;

#8
select * from sinh_vien where year(ngay_sinh) between 1991 and 1992;


#9

select * from sinh_vien order by idsinhvien asc;

#10

select * from sinh_vien order by hoc_bong desc;


#11

select sv.*, mh.ten_mon_hoc, kq.diem_thi  from sinh_vien sv inner join ket_qua kq on sv.idsinhvien = kq.idsinhvien
inner join mon_hoc mh on mh.idmonhoc= kq.idmonhoc where kq.idmonhoc = 1 and kq.diem_thi >= 1
;

#12, 13
select sv.*, l.ten_lop, k.ten_khoa from sinh_vien sv inner join lop l on sv.idlop = l.idlop
inner join khoa k on k.idkhoa = l.idkhoa
where k.idkhoa = 1 and sv.hoc_bong > 0;

#14

select l.idlop, l.ten_lop, count(1) sl from sinh_vien sv inner join lop l on sv.idlop = l.idlop group by l.idlop, l.ten_lop;

#15
select k.idkhoa, k.ten_khoa, count(1) sl 
from sinh_vien sv inner join lop l on sv.idlop = l.idlop 
inner join khoa k on k.idkhoa = l.idkhoa group by k.idkhoa, k.ten_khoa;

#16
select k.idkhoa, k.ten_khoa, count(1) sl 
from sinh_vien sv inner join lop l on sv.idlop = l.idlop 
inner join khoa k on k.idkhoa = l.idkhoa 
where gioi_tinh = 'Nữ'
group by k.idkhoa, k.ten_khoa;

#17
select l.idlop, l.ten_lop, sum(hoc_bong) sum_hoc_bong from sinh_vien sv inner join lop l on sv.idlop = l.idlop group by l.idlop, l.ten_lop;

#18

select k.idkhoa, k.ten_khoa , sum(hoc_bong) sum_hoc_bong from sinh_vien sv inner join lop l on sv.idlop = l.idlop
inner join khoa k on k.idkhoa = l.idkhoa group by k.idkhoa, k.ten_khoa;

#19

select k.idkhoa, k.ten_khoa , count(1) sl from sinh_vien sv inner join lop l on sv.idlop = l.idlop
inner join khoa k on k.idkhoa = l.idkhoa group by k.idkhoa, k.ten_khoa having sl > 0;

#20
select k.idkhoa, k.ten_khoa , count(1) sl from sinh_vien sv inner join lop l on sv.idlop = l.idlop
inner join khoa k on k.idkhoa = l.idkhoa where  gioi_tinh = 'Nữ' group by k.idkhoa, k.ten_khoa having sl > 0;

#21
select k.idkhoa, k.ten_khoa , sum(hoc_bong) sum_hoc_bong from sinh_vien sv inner join lop l on sv.idlop = l.idlop
inner join khoa k on k.idkhoa = l.idkhoa group by k.idkhoa, k.ten_khoa having sum_hoc_bong > 400000;

#22
select * from sinh_vien where hoc_bong >= all(select hoc_bong from sinh_vien); 

#23
select sv.*, mh.ten_mon_hoc, kq.diem_thi  from sinh_vien sv inner join ket_qua kq on sv.idsinhvien = kq.idsinhvien
inner join mon_hoc mh on mh.idmonhoc= kq.idmonhoc where kq.idmonhoc = 1 and kq.diem_thi 
>= all (select diem_thi from ket_qua where idmonhoc = 1);
;

#24
select sv.*, mh.ten_mon_hoc, kq.diem_thi, kq.idmonhoc  from sinh_vien sv inner join ket_qua kq on sv.idsinhvien = kq.idsinhvien
inner join mon_hoc mh on mh.idmonhoc= kq.idmonhoc where kq.idmonhoc <> 3;
;

select * from mon_hoc;

#25
select k.idkhoa, k.ten_khoa , count(1) sl from sinh_vien sv inner join lop l on sv.idlop = l.idlop
inner join khoa k on k.idkhoa = l.idkhoa group by k.idkhoa, k.ten_khoa having sl >= all (select count(1) sl from sinh_vien sv inner join lop l on sv.idlop = l.idlop
inner join khoa k on k.idkhoa = l.idkhoa group by k.idkhoa, k.ten_khoa);

















