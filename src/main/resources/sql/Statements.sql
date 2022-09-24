update products set name = 'strawberry', price = 11 where products_id=1;
update products set name = 'tomato', price = 6 where products_id=2;
update products set name = 'beer', price = 11 where products_id=3;
update products set name = 'milk', price = 8 where products_id=4;
update products set name = 'egg', price = 2 where products_id=5;
update products set name = 'ketchup', price = 4 where products_id=6;
update products set name = 'potatoes', price = 6 where products_id=7;
update products set name = 'broccolli', price = 9 where products_id=8;
update products set name = 'bread', price = 2 where products_id=9;
update products set name = 'salt', price = 5 where products_id=10;

delete from products WHERE name ='salty1';
delete from products WHERE name ='salty2';
delete from products WHERE name ='salty3';
delete from products WHERE name ='salty4';
delete from products WHERE name ='salty5';
delete from products WHERE name ='salty6';
delete from products WHERE name ='salty7';
delete from products WHERE name ='salty8';
delete from products WHERE name ='salty9';
delete from products WHERE name ='salty10';


select products.products_id, merchants.admin_id, order_items.order_id, products.price, products.created_at
from products
INNER JOIN merchants ON products.products_id = merchants.products_id
INNER JOIN merchants ON products.products_price = merchants.admin_id
INNER JOIN merchants ON order_items.order_id = merchants.order_id
INNER JOIN order_items ON products.products_id = order_items.products_id
INNER JOIN order_items ON products.price = order_items.price;

select department.DeptID, employee.EmpID, department.DeptName, employee.EmpAge, department.DeptZone
from department
FULL OUTER JOIN employee ON department.DeptID=EmpID
ORDER BY department.DeptID;


select deptID,DeptName,DeptZone
from department
left join employee
ON department.DeptID = employee.EmpAge;

select deptID,DeptName,DeptZone
from department
right join employee
ON department.DeptName = employee.EmpDept;



 
