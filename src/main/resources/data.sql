insert into user_details(id, birth_date, name) values
(101, current_timestamp(), 'Ranga'),
(102, current_timestamp(), 'Said'),
(103, current_timestamp(), 'Ravi');

insert into posts(id, description, user_id) values
(101, 'test 1', 101),
(102, 'test 2', 101),
(103, 'test 3', 103);
