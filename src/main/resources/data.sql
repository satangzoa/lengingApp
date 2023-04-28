insert into user_info

(user_id, username, password, mail_address, enabled)

values

(user_info_seq.nextval, 'test1', '{noop}12345', 'tlaghwls@naver.com', 0);

​

insert into user_info

(user_id, username, password, mail_address, enabled)

values

(user_info_seq.nextval, 'test2', '{noop}12345', 'tlaghwls@nate.com', 1);

​

​

insert into user_role

(role_id, role, user_id)

values

(1, 'ROLE_admin', 1);

​

insert into user_role

(role_id, role, user_id)

values

(2, 'ROLE_USER', 2);